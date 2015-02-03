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
import modelo.GestionConexion;
import vistas.Login;
import vistas.Principal;

/**
 *
 * @author Martin
 */
public class ControladorLogin {

    private GestionConexion conexion;

    public ControladorLogin(GestionConexion conn) {
        conexion = conn;

    }

    public void acceder(String usuario, String pass) {
        String cap = "";
        String sql = "SELECT * FROM Usuario WHERE User='" + usuario + "' && Pass='" + pass + "'";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Tipo");
            }
            if (cap.equals("Administrador")) {

                JOptionPane.showMessageDialog(null, "Bienvenido");
                Principal ingreso = new Principal(conexion);
                ingreso.setVisible(true);

                ingreso.laber_usuario.setText(usuario);
                    // ventanaadmin.lblusu.setText(usuario);

            }
            if (cap.equals("Empleado")) {

                JOptionPane.showMessageDialog(null, "Bienvenido");
                Principal ingresos = new Principal(conexion);
                ingresos.setVisible(true);
                ingresos.laber_usuario.setText(usuario);
                //  ventanacliente.lblconectado.setText(usuario);
            }
            if ((!cap.equals("Administrador")) && (!cap.equals("Cajero"))) {
                JOptionPane.showMessageDialog(null, "No existe sus datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
