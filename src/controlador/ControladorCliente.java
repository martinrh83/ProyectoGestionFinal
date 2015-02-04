/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
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

    public ControladorCliente(Principal principal, GestionConexion conexion) {
        this.conn = conexion;
        this.cliente = new Cliente();
        AltaCliente altacli = new AltaCliente(principal, true, this, cliente);
        altacli.setVisible(true);
    }

  
   public void agregarCliente(){
try {
    conn.getStatement().executeUpdate("INSERT INTO cliente (n_cliente,nombre,apellido,dni,cuil,direccion)"
            + "VALUES ("+cliente.getNombre()+",'"+cliente.getApellido()+"','"+cliente.getDni()+"','"+cliente.getCuil()+"',"+cliente.getDireccion()+"');" );
  } catch(SQLException ex) {
      Logger.getLogger(AltaCliente.class.getName()).log(Level.SEVERE, null, ex);
  }

    }
}
