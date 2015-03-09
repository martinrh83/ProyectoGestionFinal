/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.GestionProveedor;
import vistas.ModProveedor;

/**
 *
 * @author Martin
 */
public class ControladorProveedor {

    private GestionConexion conexion;
    private GestionProveedor window;
    private Proveedor proveedor;
    private DefaultTableModel modelo;

    public ControladorProveedor(GestionConexion conn) {
        conexion = conn;
        proveedor = new Proveedor();
        window = new GestionProveedor(this, conexion, proveedor);
        window.setVisible(true);
        generarNumeracion();
        mostrarProveedores();
    }

    public void generarNumeracion() {
        String SQL = "SELECT max(idProveedor) FROM proveedor";
        window.txt_idProv.setEnabled(false);
        int c = 0;
        int b = 0;
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                window.txt_idProv.setText("7000");

            } else {
                window.txt_idProv.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //INSERT INTO `finalgestion`.`proveedor` (`idProveedor`, `nombre`, `cuit`, `razonSocial`, `direccion`, `email`, `telefono`) VALUES (NULL, 'The Coca-Cola Company', '123456', 'S.A.', 'av. juan b. justo 1458', NULL, '0800888888');
    public void agregarProveedor() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO proveedor (idProveedor, nombre, cuit, razonSocial, email, telefono)"
                    + "VALUES (" + proveedor.getIdProveedor() + ",'" + proveedor.getNombreProv() + "'," + proveedor.getCuitProv() + ",'" + proveedor.getRazonSocProv() + "','" + proveedor.getEmailProv() + "'," + proveedor.getTelefonoProv() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProveedores() {
        String[] titulos = {"ID", "Nombre", "C.U.I.T.", "Razon Social", "e-mail", "Telefono"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[7];
        String sql = "SELECT * FROM  proveedor";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idProveedor");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("cuit");
                datos[3] = rs.getString("razonSocial");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("telefono");
                modelo.addRow(datos);
            }
            window.tablaProveedor.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarFila(GestionProveedor tabla) {
        int flag = tabla.getTablaProveedor().getSelectedRow();
        if (flag > -1) {
            int s = JOptionPane.showConfirmDialog(tabla, "¿Esta seguro de Borrar?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (s == JOptionPane.YES_OPTION) {
                String idCalculo = (String) tabla.getTablaProveedor().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "DELETE FROM proveedor WHERE idProveedor =" + idCalculo + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Proveedor borrado");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarProv(ModProveedor mp) {
        int flag = window.tablaProveedor.getSelectedRow();
        String nom = "", rsoc = "", em = "", cu = "", tel = "";
        if (flag > -1) {
            String idCalculo = (String) window.tablaProveedor.getModel().getValueAt(flag, 0);
            Integer.valueOf(idCalculo);
            try {
                String sql = "SELECT * FROM proveedor WHERE idProveedor = " + idCalculo + ";";
                Statement st = conexion.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    
                    nom = rs.getString("nombre");
                    cu = "" + rs.getInt("cuit");
                    rsoc = rs.getString("razonSocial");
                    em = rs.getString("email");
                    tel = "" + rs.getInt("telefono");
                }
                mp.txt_idProv.setText(idCalculo);
                mp.getTxt_nombreMProv().setText(nom);
                mp.getTxt_cuitMProv().setText(cu);
                mp.getCombo_rsMProv().setSelectedItem(rsoc);
                mp.getTxt_mailMProv().setText(em);
                mp.getTxt_telMProv().setText(tel);

            } catch (SQLException ex) {
                Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(window.tablaProveedor, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateProv(Proveedor prov){
        try {
            String qquery = "UPDATE proveedor SET nombre = '" + proveedor.getNombreProv() + "', " +
                    "cuit =" + proveedor.getCuitProv() + "," +
                    "razonSocial = '" + proveedor.getRazonSocProv() + "', " +
                    "email = '" + proveedor.getEmailProv() + "', " +
                    "telefono = " + proveedor.getTelefonoProv() + " " +
                    "WHERE idProveedor = " + proveedor.getIdProveedor() + ";";
            Statement st = conexion.getStatement();
            st.executeUpdate(qquery);
            JOptionPane.showMessageDialog(window, "El proveedor fue modificado.. sea feliz XD  ");
            System.out.println("Proveedor Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
