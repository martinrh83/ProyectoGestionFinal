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
import vistas.AltaProducto;
import vistas.Principal;
import vistas.PrincipalEmpleado;

/**
 *
 * @author Martin
 */
public class ControladorAlta {

    private GestionConexion conn;
    private Producto producto;

    public ControladorAlta(Principal principal, GestionConexion conexion) {
        this.conn = conexion;
        this.producto = new Producto();
        AltaProducto alta = new AltaProducto(principal, true, this, producto);
        alta.setVisible(true);
    }

    public ControladorAlta(PrincipalEmpleado principal, GestionConexion conexion) {
        this.conn = conexion;
        this.producto = new Producto();
        AltaProducto alta = new AltaProducto(principal, true, this, producto);
        alta.setVisible(true);
    }
    public void agregarProducto() {
        try {
            conn.getStatement().executeUpdate("INSERT INTO producto (CodigoProducto,Nombre, Presentacion,Fecha_de_Vencimiento,Cantidad,Categoria,Precio_Minorista,Precio_Mayorista,Marca)"
                    + "VALUES (" + producto.getCodigoProd() + ",'" + producto.getNombreProd() + "','" + producto.getDescripcionProd() + "','" + producto.getFechaVenc() + "'," + producto.getCantProd() + ",'" + producto.getCatProd() + "'," + producto.getPrecMin() + "," + producto.getPrecMay() + ",'" + producto.getMarca() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
