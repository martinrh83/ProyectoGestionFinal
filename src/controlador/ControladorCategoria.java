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
import modelo.Categoria;
import modelo.GestionConexion;
import vistas.AltaCategoria;


/**
 *
 * @author Martin
 */
public class ControladorCategoria {

    private GestionConexion conn;
    private Categoria cat;
    private AltaCategoria alta;

    public ControladorCategoria(GestionConexion conexion) {
        this.conn = conexion;
        cat = new Categoria();
        alta = new AltaCategoria(this, conn, cat);
        alta.setVisible(true);
        this.generarNumeracion();
    }

   public void generarNumeracion() {
        String sql = "SELECT MAX(idCategoria) FROM categoria";
        alta.getTxt_idCat().setEnabled(false);
        int c = 0;
        try {
            Statement st = conn.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                alta.getTxt_idCat().setText("20");
            } else {
                alta.getTxt_idCat().setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarCategoria() {
        try {
            conn.getStatement().executeUpdate("INSERT INTO categoria (idCategoria, descripcion)"
                    + "VALUES (" + cat.getIdCategoria() + ", '" + cat.getDescripcion() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(AltaCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
