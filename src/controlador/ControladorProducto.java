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
import vistas.GestionProducto;
import vistas.Principal;
import vistas.PrincipalEmpleado;

/**
 *
 * @author Martin
 */
public class ControladorProducto {

    private GestionConexion conn;
    private Producto producto;

    public ControladorProducto(Principal principal, GestionConexion conexion) {
        this.conn = conexion;
        this.producto = new Producto();
        GestionProducto alta = new GestionProducto(principal, true, this, producto);
        alta.setVisible(true);
    }

    public ControladorProducto(PrincipalEmpleado principal, GestionConexion conexion) {
        this.conn = conexion;
        this.producto = new Producto();
        GestionProducto alta = new GestionProducto(principal, true, this, producto);
        alta.setVisible(true);
    }
    public void agregarProducto() {
        try {
            conn.getStatement().executeUpdate("INSERT INTO producto (idProducto,nombre, descripcion,fechaVenc,cantidad,categoria,pcioMin,pcioMay,marca)"
                    + "VALUES (" + producto.getCodigoProd() + ",'" + producto.getNombreProd() + "','" + producto.getDescripcionProd() + "','" + producto.getFechaVenc() + "'," + producto.getCantProd() + ",'" + producto.getCatProd() + "'," + producto.getPrecMin() + "," + producto.getPrecMay() + ",'" + producto.getMarca() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(GestionProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
