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
import modelo.GestionConexion;
import vistas.AltaCliente;
import vistas.Principal;
import vistas.PrincipalEmpleado;

/**
 *
 * @author Martin
 */
public class ControladorCliente {

    private GestionConexion conn;
    private Cliente cliente;
    private AltaCliente altacli;
    public ControladorCliente(Principal principal, GestionConexion conexion) {
        this.conn = conexion;
        this.cliente = new Cliente();
        altacli = new AltaCliente(principal, true, this, cliente);
        altacli.setVisible(true);
        Generarnumeracion();
    }

        public void Generarnumeracion() {
        String SQL = "select max(n_cliente) from cliente";
       // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
           
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
                altacli.txt_id.setText("1");

            } else {
                altacli.txt_id.setText("" + (c + 1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  
   public void agregarCliente(){
try {
    conn.getStatement().executeUpdate("INSERT INTO cliente (n_cliente,nombre,apellido,dni,cuil,direccion)"
            + "VALUES ("+cliente.getIdCliente()+",'"+cliente.getNombre()+"','"+cliente.getApellido()+"',"+cliente.getDni()+","+cliente.getCuil()+",'"+cliente.getDireccion()+"');");
  } catch(SQLException ex) {
      Logger.getLogger(AltaCliente.class.getName()).log(Level.SEVERE, null, ex);
  }

    }
}
