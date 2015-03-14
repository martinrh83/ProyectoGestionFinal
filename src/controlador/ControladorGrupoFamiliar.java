/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Familiar;
import modelo.GestionConexion;
import vistas.GestionGrupoFamiliar;
import vistas.ModFamiliar;

/**
 *
 * @author Mariana
 */
public class ControladorGrupoFamiliar {

    private GestionConexion conexion;
    private DefaultTableModel modelo;
    private GestionGrupoFamiliar window;
    private Familiar flia;
    private int idUser;

    public ControladorGrupoFamiliar(GestionConexion conn, Integer id) {
        conexion = conn;
        idUser = id;
        flia = new Familiar();
        window = new GestionGrupoFamiliar(flia, this);
        window.setVisible(true);
        this.generarNumeracion();
        this.mostrarDatosEmp(window);
        this.mostrarFamiliares();
    }

    public void mostrarDatosEmp(GestionGrupoFamiliar v1) {
        window = v1;
        window.getTxtId_Personal().setText("" + idUser);
        window.getTxtId_Personal().setEnabled(false);
    }

    public void generarNumeracion() {
        String sql = "SELECT max(idFamiliar) FROM familiar";
        window.getTxt_idFam().setEnabled(false);
        int c = 0;

        try {
            Statement st = conexion.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                window.getTxt_idFam().setText("1");
            } else {
                window.getTxt_idFam().setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarFamiliares() {
        String[] titulos = {"ID", "Nombre", "D.N.I.", "Parentesco", "Fec. Nac.", "Escalaridad", "Nacionalidad", "Est. Civil", "Discapacidad", "idEmpleado"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[10];
        String sql = "SELECT * FROM  familiar where empleado_idEmpleado=" + idUser + ";";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idFamiliar");
                datos[1] = rs.getString("nomYap");
                datos[2] = rs.getString("dni");
                datos[3] = rs.getString("parentesco");
                datos[4] = rs.getString("fechaNac");
                datos[5] = rs.getString("escolaridad");
                datos[6] = rs.getString("nacionalidad");
                datos[7] = rs.getString("estCivil");
                datos[8] = rs.getString("discapacitado");
                datos[9] = rs.getString("Empleado_idEmpleado");

                modelo.addRow(datos);
            }
            window.getTabla_familiares().setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarFamiliar() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO familiar (idFamiliar, nomYap, dni, parentesco, fechaNac, escolaridad, nacionalidad, estCivil, discapacitado, empleado_idEmpleado)"
                    + "VALUES (" + flia.getIdf() + ",'" + flia.getNya() + "',"
                    + flia.getDni() + ", '" + flia.getParentesco() + "', '"
                    + flia.getFnac() + "', '" + flia.getEscolaridad() + "', '"
                    + flia.getNacionalidad() + "', '" + flia.getEsciv() + "', '"
                    + flia.getDisc() + "', " + flia.getEmpid() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarFilaFam(GestionGrupoFamiliar tabla) {

        int flag = tabla.getTabla_familiares().getSelectedRow();
        if (flag > -1) {
            int n = JOptionPane.showConfirmDialog(tabla, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                String idCalculo = (String) tabla.getTabla_familiares().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "DELETE FROM familiar WHERE idFamiliar =" + idCalculo + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Familiar Borrado ");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            JOptionPane.showMessageDialog(window, "El Vinculo Familiar fue eliminado con exito ");
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

 /*   public void modificarFamiliar(ModFamiliar modfam) {
        int flag = window.getTabla_familiares().getSelectedRow();
        String nom = "", dni = "", paren = "", esc = "", fecNac = "", nac = "", estCivil = "",Disc="";
        if (flag > -1) {
            String idCalculo = (String) window.getTabla_familiares().getModel().getValueAt(flag, 0);
            Integer.valueOf(idCalculo);
            try {
                String sql = "SELECT * FROM familiar WHERE idFamiliar = " + idCalculo + ";";
                Statement st = conexion.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {

                    nom = rs.getString("Nombre y Apellido");
                    dni = "" + rs.getInt("Dni");
                    paren = rs.getString("Parentesco");
                    esc = rs.getString("Escolaridad");
                    fecNac = rs.getString("Fecha de Nacimiento");
                    nac = rs.getString("Nacionalidad");
                    estCivil=rs.getString("Estado Civil");
                    Disc=rs.getString("Discapacidad");
                }

                modfam.getTxt_idFam_mod().setText(idCalculo);
                modfam.getTxt_nomF_mod().setText(nom);
                modfam.getTxt_dni_mod().setText(dni);
                modfam.getCmb_parentesco_mod().setSelectedItem(paren);
                modfam.getCmb_escolaridad_mod().setSelectedItem(esc);
                 Date fechaNac = modfam.getTxt_fec_mod().getDate();
                 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                modfam.setTxt_fec_mod(modfam.getTxt_fec_mod(formato..format(fecNac)));
                
                modfam.getCmb_estCivil_mod().setSelectItem();
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
            System.out.println("Cliente Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
*/
}
