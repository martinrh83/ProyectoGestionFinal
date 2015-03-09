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
import modelo.Domicilio;
import modelo.GestionConexion;
import vistas.AltaDomicilio;


/**
 *
 * @author Martin
 */
public class ControladorDomicilio {
        private GestionConexion conn;
    private Domicilio domicilio;
    private AltaDomicilio alta;

    public ControladorDomicilio(GestionConexion conexion) {
        this.conn = conexion;
        this.domicilio = new Domicilio();
        alta = new AltaDomicilio(this, domicilio, conn);
        alta.setVisible(true);
        generarNumeracion();
    }

   public void generarNumeracion() {
        String sql = "SELECT max(idDomicilio) FROM domicilio";
        alta.txt_idDom.setEnabled(false);
        int c = 0;

        try {
            Statement st = conn.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                alta.txt_idDom.setText("10");
            } else {
                alta.txt_idDom.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarDomicilio() {
  
        try {
            conn.getStatement().executeUpdate("INSERT INTO domicilio (idDomicilio,barrio,calle,nroCalle,departamento,piso,provincia,ciudad,codPostal,cliente_idCliente,proveedor_idProveedor,empleado_idEmpleado)"
                    + "VALUES (" + domicilio.getIdDomicilio() + 
                    ",'" + domicilio.getBarrio() + "','" 
                    + domicilio.getCalle() + "'," 
                    + domicilio.getNroCalle() + ",'" 
                    + domicilio.getDepartamento() + "'," 
                    + domicilio.getNroPiso() + ",'" 
                    + domicilio.getProvincia() + "','" 
                    + domicilio.getCiudad() + "'," 
                    + domicilio.getCp() + ","
                    + domicilio.getIdCliente() + ","
                    + domicilio.getIdProveedor() + ","
                    + domicilio.getIdEmpleado() + ");");
                    
                    
        } catch (SQLException ex) {
            Logger.getLogger(AltaDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
