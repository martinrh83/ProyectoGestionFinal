/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.AltaPersonal;

/**
 *
 * @author Martin
 */
public class ControladorAltaUsuario {

    private GestionConexion conexion;
    private AltaPersonal window;
    private Usuario user;
    private DefaultTableModel modelo;

    public ControladorAltaUsuario(GestionConexion conn) {
        conexion = conn;
        user = new Usuario();
        window = new AltaPersonal(this, conexion, user);
        window.setVisible(true);
        Generarnumeracion();
        mostrarusuarios();
    }

    public void Generarnumeracion() {
        String SQL = "select max(idUsuario) from Usuario";
        // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        window.txt_idUser.setEnabled(false);
        int c = 0;
        int b = 0;
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }

            if (c == 0) {
                window.txt_idUser.setText("1");

            } else {
                window.txt_idUser.setText("" + (c + 1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void agregarUsuario() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO usuario (IdUsuario,Nombre, Apellido,Dni,Tipo,Carga_Horaria,Fecha_Ingreso,Pass,User)"
                    + "VALUES (" + user.getIdUsuario() + ",'" + user.getNomUsuario() + "','" + user.getApellidoUsuario() + "'," + user.getDniUsuario() + ",'" + user.getTipoUsuario() + "'," + user.getCargaHoraria() + ",'" + user.getFechaIngreso() + "','" + user.getPassUsuario() + "','" + user.getUserUsuario() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarusuarios() {
        String[] titulos = {"id", "Nombre", "Apellido", "DNI", "Tipo", "Carga_Horaria", "Fecha_Ingreso", "Password", "Usuario"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[9];
        String sql = "SELECT * FROM  usuario";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idusuario");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Apellido");
                datos[3] = rs.getString("Dni");
                datos[4] = rs.getString("Tipo");
                datos[5] = rs.getString("Carga_Horaria");
                datos[6] = rs.getString("Fecha_Ingreso");
                datos[7] = rs.getString("Pass");
                datos[8] = rs.getString("User");

                modelo.addRow(datos);
            }
            window.tablaUsuario.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarFila(AltaPersonal tabla) {

        int flag = tabla.getTablaUsuario().getSelectedRow();
        if (flag > -1) {
            int n = JOptionPane.showConfirmDialog(tabla, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                String idCalculo = (String)tabla.getTablaUsuario().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "Delete from usuario where IdUsuario =" + idCalculo + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Producto borrado. ");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar auna fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
