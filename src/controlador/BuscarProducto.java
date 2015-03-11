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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.ListarProducto;
import vistas.ModProducto;

/**
 *
 * @author Martin
 */
public class BuscarProducto {

    private GestionConexion conexion;
    private DefaultTableModel model;
    private ListarProducto window;
    private Producto prod;
    private ModProducto mod;
    public BuscarProducto(GestionConexion conn) {
        conexion = conn;
        window = new ListarProducto(this, conexion);
        window.setVisible(true);
    }

    //BUSQUEDA POR NOMBRE DEL PRODUCTO
    public void busquedaPredictiva(String comodin, JTable tb) {
        String[] titulos = {"idProducto", "nombre", "descripcion", "fechaVenc", "cantidad", "P. Compra", "pcioMin", "pcioMay", "marca"};
        model = new DefaultTableModel(null, titulos);
        String val[] = new String[9];
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '" + comodin + "'";
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val[0] = rs.getString("idProducto");
                val[1] = rs.getString("nombre");
                val[2] = rs.getString("descripcion");
                val[3] = rs.getString("fechaVenc");
                val[4] = rs.getString("cantidad");
                val[5] = rs.getString("pcioCpra");
                val[6] = rs.getString("pcioMin");
                val[7] = rs.getString("pcioMay");
                val[8] = rs.getString("marca");

                model.addRow(val);
            }
            window.getTablaProducto().setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String> obtenerCategoria() {
        String sql = "SELECT * FROM categoria";
        ArrayList<String> ls = new ArrayList<String>();
        try {
            Statement st = conexion.getStatement();
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

    // BUSQUEDA POR CATEGORIA
    public void busquedaCategoria(String cat, JTable tb) {
        String[] parts = cat.split(":"); 
        int c1 = Integer.valueOf(parts[0]);
        String[] titulos = {"idProducto", "nombre", "descripcion", "fechaVenc", "cantidad", "pcioCmpra", "pcioMin", "pcioMay", "marca"};
        model = new DefaultTableModel(null, titulos);
        String val[] = new String[9];
        String sql = "SELECT * FROM producto WHERE categoria_idCategoria = '" + c1 + "';";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val[0] = rs.getString("idProducto");
                val[1] = rs.getString("nombre");
                val[2] = rs.getString("descripcion");
                val[3] = rs.getString("fechaVenc");
                val[4] = rs.getString("cantidad");
                val[5] = rs.getString("pcioCpra");
                val[6] = rs.getString("pcioMin");
                val[7] = rs.getString("pcioMay");
                val[8] = rs.getString("marca");
                model.addRow(val);
            }
            window.getTablaProducto().setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public ArrayList<String> consulta() {//Retornamos un ArrayList para tratarlo en el JComboBox
        String sql = "SELECT * FROM categoria";
        ArrayList<String> ls = new ArrayList<String>();
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre=rs.getString("descripcion");
                int id=rs.getInt("idCategoria");
                ls.add("" + id + ": " + nombre);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    public void llenarCB(ModProducto m) {
        JComboBox cmb=m.getCmbCatMProd();
        ArrayList<String> resul;
        resul = consulta();
        System.out.println("resultado" + resul);
       for (int i = 0; i < resul.size(); i++) {
            cmb.addItem(resul.get(i));
        }
    }
    public void modificarProd( ModProducto m) {
        mod=m;
        int flag = window.getTablaProducto().getSelectedRow();
        String nom = "", des = "", fv = "", mar = "", pmin = "", pmay = "", can = "", pcpra = "", cat = "";
        if (flag > -1) {
            String idP = (String) window.getTablaProducto().getModel().getValueAt(flag, 0);
            Integer.valueOf(idP);
            try {
                String sql = "SELECT * FROM producto WHERE idProducto = " + idP + ";";
                Statement st = conexion.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nom = rs.getString("nombre");
                    des = rs.getString("descripcion");
                    fv = rs.getString("fechaVenc");
                    can = rs.getString("cantidad");
                    pcpra = rs.getString("pcioCpra");
                    pmin = "" + rs.getInt("pcioMin");
                    pmay = "" + rs.getInt("pcioMay");
                    mar = rs.getString("marca");
                    cat = rs.getString("categoria_idCategoria");

                    mod.getTxtCod_MProd().setText(idP);
                    mod.getTxtName_MProd().setText(nom);
                    mod.getTxtDesc_MProd().setText(des);
                    mod.getTxtFecV_MProd().setText(fv);
                    mod.getTxtMarca_MProd().setText(mar);
                    mod.getTxtPMin().setText(pmin);
                    mod.getTxtPMay().setText(pmay);
                    mod.getTxtCant_MProd().setText(can);
                    mod.getTxtPCpra().setText(pcpra);
                    mod.getCmbCatMProd().setSelectedItem(cat);

                }
            } catch (SQLException ex) {
                Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(window.getTablaProducto(), "Debe seleccionar una fila", "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateProd(Producto prod) {
        try {
            String sql = "UPDATE producto SET nombre = '" + prod.getNombreProd() + "', "
                    + "descripcion = '" + prod.getDescripcionProd() + "', "
                    + "fechaVenc = '" + prod.getFechaVenc() + "', "
                    + "cantidad = " + prod.getCantProd() + ", "
                    + "pcioCpra = " + prod.getPcioCpra() + ", "
                    + "pcioMin = " + prod.getPrecMin() + ", "
                    + "pcioMay = " + prod.getPrecMay() + ", "
                    + "marca = '" + prod.getMarca() + "' "
                    //falta la categoria
                    + "WHERE idProducto = " + prod.getCodigoProd() + ";";

            Statement st = conexion.getStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(window, "El Producto fue modificado...");
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarProd(JTable tabla) {
        int flag = window.getTablaProducto().getSelectedRow();
        if (flag > 1) {
            int s = JOptionPane.showConfirmDialog(tabla, "¿Esta seguro de Borrar el Producto?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (s == JOptionPane.YES_OPTION) {
                String idP = (String) window.getTablaProducto().getModel().getValueAt(flag, 0);
                Integer.valueOf(idP);
                try {
                    String sql = "DELETE FROM producto WHERE idProducto =" + idP + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(sql);
                    System.out.println("Producto borrado");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
