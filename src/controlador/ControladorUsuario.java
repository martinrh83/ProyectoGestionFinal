/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.GestionPersonal;
import vistas.ModPersonal;

/**
 *
 * @author Martin
 */
public class ControladorUsuario {

    private GestionConexion conexion;
    private GestionPersonal window;
    private Usuario user;
    private DefaultTableModel modelo;
    private ControladorGrupoFamiliar grFam;


    public ControladorUsuario(GestionConexion conn) {
        conexion = conn;
        user = new Usuario();
        window = new GestionPersonal(this, conexion, user);
        window.setVisible(true);
        Generarnumeracion();
        mostrarusuarios();
    }

    public void Generarnumeracion() {
        String SQL = "SELECT MAX(idEmpleado) FROM empleado";
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
                window.txt_idUser.setText("3500");

            } else {
                window.txt_idUser.setText("" + (c + 1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void agregarUsuario() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO empleado (idEmpleado,nombre, apellido,dni,tipo,cargaHoraria,fechaIngreso,pass,user)"
                    + "VALUES (" + user.getIdUsuario() + ",'"
                    + user.getNomUsuario() + "','"
                    + user.getApellidoUsuario() + "',"
                    + user.getDniUsuario() + ",'"
                    + user.getTipoUsuario() + "',"
                    + user.getCargaHoraria() + ",'"
                    + user.getFechaIngreso() + "','"
                    + user.getPassUsuario() + "','"
                    + user.getUserUsuario() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarusuarios() {
        String[] titulos = {"id", "Nombre", "Apellido", "DNI", "Tipo", "Carga_Horaria", "Fecha_Ingreso", "Usuario"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[9];
        String sql = "SELECT * FROM  empleado";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idEmpleado");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("dni");
                datos[4] = rs.getString("tipo");
                datos[5] = rs.getString("cargaHoraria");
                datos[6] = rs.getString("fechaIngreso");
                datos[7] = rs.getString("user");

                modelo.addRow(datos);
            }
            window.tablaUsuario.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarFila(GestionPersonal tabla) {

        int flag = tabla.getTablaUsuario().getSelectedRow();
        if (flag > -1) {
            int n = JOptionPane.showConfirmDialog(tabla, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                String idCalculo = (String) tabla.getTablaUsuario().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "DELETE FROM empleado WHERE idEmpleado =" + idCalculo + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Empleado Borrado ");

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorUsuario.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(window, "El Empleado fue eliminado", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public int administrarGFamiliar(GestionPersonal v1) {
        window = v1;
        int id = 0;
        int flag = window.getTablaUsuario().getSelectedRow();
        if (flag > -1) {
            String idUser = (String) window.getTablaUsuario().getModel().getValueAt(flag, 0);
            id = Integer.valueOf(idUser);

        }

        return id;
    }

    public void modificarEmpleado(ModPersonal me) throws ParseException {
        int flag = window.getTablaUsuario().getSelectedRow();
        String nom = "", ap = "", dni = "", tipo = "", carh = "", fecA = "", us = "", pas = "";

        if (flag > -1) {
            String idCalculo = (String) window.tablaUsuario.getModel().getValueAt(flag, 0);
            Integer.valueOf(idCalculo);
            try {
                String sql = "SELECT * FROM empleado WHERE idEmpleado = " + idCalculo + ";";
                Statement st = conexion.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {

                    nom = rs.getString("nombre");
                    ap = rs.getString("apellido");
                    dni = "" + rs.getString("dni");
                    tipo = rs.getString("tipo");
                    carh = "" + rs.getInt("cargaHoraria");
                    fecA = rs.getString("fechaIngreso");
                    us = rs.getString("user");
                }

                me.txt_idUserM.setText(idCalculo);
                me.getTxt_NameM().setText(nom);
                me.getTxt_apellidoM().setText(ap);
                me.getTxt_DniM().setText(dni);
                me.getCombo_tipoM().setSelectedItem(tipo);
                me.getTxt_horaM().setText(carh);
                
                String fec = fecA;
                Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fec);
                me.getjDateChooser1M().setDate(fecha);
                me.getTxt_userM().setText(us);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(window.tablaUsuario, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateUsuario() {

        try {
            String qquery = "UPDATE empleado SET nombre = '" + user.getNomUsuario() + "', "
                    + "apellido ='" + user.getApellidoUsuario() + "',"
                    + "dni = " + user.getDniUsuario() + ", "
                    + "tipo = '" + user.getTipoUsuario() + "', "
                    + "cargaHoraria = " + user.getCargaHoraria() + ", "
                    + "fechaIngreso = '" + user.getFechaIngreso() + "',"
                    + "user =  '" + user.getUserUsuario() + "' "
                    + "WHERE idEmpleado = " + user.getIdUsuario() + ";";
            Statement st = conexion.getStatement();
            st.executeUpdate(qquery);
            JOptionPane.showMessageDialog(window, "El Empleado fue modificado");
            System.out.println("Empleado Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
