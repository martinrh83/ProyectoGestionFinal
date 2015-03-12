/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.GestionCliente;
import vistas.ModCliente;
import vistas.Principal;
import vistas.PrincipalEmpleado;

/**
 *
 * @author Martin
 */
public class ControladorCliente {

    private GestionConexion conn;
    private Cliente cliente;
    private GestionCliente altacli;
    private DefaultTableModel modelo_Cliente;

    public ControladorCliente(Principal principal, GestionConexion conexion) {
        this.conn = conexion;
        this.cliente = new Cliente();
        altacli = new GestionCliente(principal, true, this, cliente);
        altacli.setVisible(true);
        Generarnumeracion();
        mostrarClientes();
    }
    
     public ControladorCliente(PrincipalEmpleado principal, GestionConexion conexion) {
        this.conn = conexion;
        this.cliente = new Cliente();
        altacli = new GestionCliente(principal, true, this, cliente);
        altacli.setVisible(true);
        Generarnumeracion();
        mostrarClientes();
    }
     
    public void Generarnumeracion() {
        String SQL = "SELECT max(idCliente) FROM cliente";

        altacli.txt_id.setEnabled(false);
        int c = 0;
        int b = 0;
        try {
            Statement st = conn.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                altacli.txt_id.setText("6000");

            } else {
                altacli.txt_id.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarCliente() {
        try {
            conn.getStatement().executeUpdate("INSERT INTO cliente (idcliente,nombre,apellido,dni,cuil,telefono,email,tipo)"
                    + "VALUES (" + cliente.getIdCliente() + ",'" + cliente.getNombre() + "','" + cliente.getApellido() + "'," + cliente.getDni() + "," + cliente.getCuil() + "," + cliente.getTelefono() + ",'" + cliente.getEmail() + "','" + cliente.getTipo() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarClientes() {
        String[] titulos = {"id", "Nombre", "Apellido", "DNI", "CUIL", "Telefono", "Email", "Tipo"};
        modelo_Cliente = new DefaultTableModel(null, titulos);
        String datos[] = new String[8];
        String sql = "SELECT * FROM  cliente";
        try {
            Statement st = conn.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idCliente");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("dni");
                datos[4] = rs.getString("cuil");
                datos[5] = rs.getString("telefono");
                datos[6] = rs.getString("email");
                datos[7] = rs.getString("tipo");

                modelo_Cliente.addRow(datos);
            }
            altacli.tablaCliente.setModel(modelo_Cliente);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarFilaCli(GestionCliente tabla) {

        int flag = tabla.getTablaCliente().getSelectedRow();
        if (flag > -1) {
            int n = JOptionPane.showConfirmDialog(tabla, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                String idCalculo = (String) tabla.getTablaCliente().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "DELETE FROM cliente WHERE idCliente =" + idCalculo + ";";
                    Statement st = conn.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Cliente borrado. ");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void modificarCliente(ModCliente mod_Cli) {
        int flag = altacli.tablaCliente.getSelectedRow();
        String nom = "", ap = "", dni = "", cuil = "", dir = "", tel = "", email = "", tipo = "";
        if (flag > -1) {
            String idCalculo = (String) altacli.tablaCliente.getModel().getValueAt(flag, 0);
            Integer.valueOf(idCalculo);
            try {
                String sql = "SELECT * FROM cliente WHERE idCliente = " + idCalculo + ";";
                Statement st = conn.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {

                    nom = rs.getString("nombre");
                    ap = rs.getString("Apellido");
                    dni = "" + rs.getInt("Dni");
                    cuil = "" + rs.getInt("cuil");
                    tel = "" + rs.getInt("Telefono");
                    email = rs.getString("Email");
                    tipo = rs.getString("Tipo");
                }

                mod_Cli.txt_idmod.setText(idCalculo);
                mod_Cli.getTxtnom_mod().setText(nom);
                mod_Cli.getTxtap_mod().setText(ap);
                mod_Cli.getTxtdni_mod().setText(dni);
                mod_Cli.getTxtcuil_mod().setText(cuil);
                mod_Cli.getTxttelefono_mod().setText(tel);
                mod_Cli.getTxt_email_mod().setText(email);
                mod_Cli.getjComboBox_tipoCliente_mod().setSelectedItem(tipo);

            } catch (SQLException ex) {
                Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(altacli.tablaCliente, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateCliente(Cliente cli) {
        try {
            String qquery = "UPDATE cliente SET nombre = '" + cliente.getNombre() + "', "
                    + "apellido = '" + cliente.getApellido() + "', "
                    + "dni = " + cliente.getDni() + ","
                    + "cuil = " + cliente.getCuil() + ","
                    + "telefono = " + cliente.getTelefono() + ", "
                    + "email = '" + cliente.getEmail() + "', "
                    + "tipo = '" + cliente.getTipo() + "'  "
                    + "WHERE idCliente = " + cliente.getIdCliente() + ";";
            Statement st = conn.getStatement();
            st.executeUpdate(qquery);
            JOptionPane.showMessageDialog(altacli, "El Cliente fue modificado ");
            System.out.println("Proveedor Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
