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
import vistas.AltaProducto;
import vistas.Principal;

/**
 *
 * @author Martin
 */
public class ControladorProducto {

    private GestionConexion conn;
    private Producto producto;
    private AltaProducto alta;

    public ControladorProducto(GestionConexion conexion) {
        this.conn = conexion;
        this.producto = new Producto();
        alta = new AltaProducto(this, producto, conn);
        alta.setVisible(true);
    }

   /* public void generarNumeracion() {
        String sql = "select max(idProducto) from producto";
        alta.txtCod_Prod.setEnabled(false);
        int c = 0;

        try {
            Statement st = conn.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                alta.txtCod_Prod.setText("1");
            } else {
                alta.txtCod_Prod.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    public void agregarProducto() {
        try {
            conn.getStatement().executeUpdate("INSERT INTO producto (idProducto,nombre, descripcion,fechaVenc,cantidad,categoria,pcioMin,pcioMay,marca)"
                    + "VALUES (" + producto.getCodigoProd() + ",'" + producto.getNombreProd() + "','" + producto.getDescripcionProd() + "','" + producto.getFechaVenc() + "'," + producto.getCantProd() + ",'" + producto.getCatProd() + "'," + producto.getPrecMin() + "," + producto.getPrecMay() + ",'" + producto.getMarca() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
