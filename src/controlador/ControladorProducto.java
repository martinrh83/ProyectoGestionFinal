/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
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
        this.generarNumeracion();
    }

    public void generarNumeracion() {
        String sql = "SELECT MAX(idProducto) FROM producto";
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
                alta.txtCod_Prod.setText("90008300");
            } else {
                alta.txtCod_Prod.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> obtenerCategoria() {//Retornamos un ArrayList para tratarlo en el JComboBox
        String sql = "SELECT * FROM categoria";
        ArrayList<String> ls = new ArrayList<String>();
        try {
            Statement st = conn.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String desc = rs.getString("descripcion");
                int id = rs.getInt("idCategoria");
                ls.add("" + id + ": " + desc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    public void llenarCB(JComboBox cmb) {
        ArrayList<String> resul;
        resul = obtenerCategoria();
        for (int i = 0; i < resul.size(); i++) {
            cmb.addItem(resul.get(i));
        }
    }

    public void agregarProducto() {
        producto.getCodigoProd();
        try {
            conn.getStatement().executeUpdate("INSERT INTO producto (idProducto, nombre, descripcion, fechaVenc, cantidad, pcioCpra, pcioMin, pcioMay, marca, categoria_idCategoria)"
                    + "VALUES (" + producto.getCodigoProd() + ",'"
                    + producto.getNombreProd() + "','"
                    + producto.getDescripcionProd() + "','"
                    + producto.getFechaVenc() + "',"
                    + producto.getCantProd() + ","
                    + producto.getPcioCpra() + ","
                    + producto.getPrecMin() + ","
                    + producto.getPrecMay() + ",'"
                    + producto.getMarca() + "',"
                    + producto.getIdCategoria() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
