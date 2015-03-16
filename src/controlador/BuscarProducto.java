/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.Producto;
import java.util.ArrayList;
import java.util.Date;
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

    // BUSQUEDA POR CATEGORIA
    public void busquedaCategoria(String cat, JTable tb) {
        String[] titulos = {"idProducto", "nombre", "descripcion", "fechaVenc", "cantidad", "P. Compra", "pcioMin", "pcioMay", "marca"};
        model = new DefaultTableModel(null, titulos);
        String[] parts = cat.split(":");
        int c1 = Integer.valueOf(parts[0]);
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

    public void llenarCB(ModProducto m) {
        JComboBox cmb = m.getCmbCatMProd();
        ArrayList<String> resul;
        resul = consulta();
        for (int i = 0; i < resul.size(); i++) {
            cmb.addItem(resul.get(i));
        }
    }

    public ArrayList<String> consulta() {//Retornamos un ArrayList para tratarlo en el JComboBox
        String sql = "SELECT * FROM categoria";
        ArrayList<String> ls = new ArrayList<String>();
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre = rs.getString("descripcion");
                int id = rs.getInt("idCategoria");
                ls.add("" + id + ": " + nombre);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    public void modificarProd() throws ParseException {
        int flag = window.getTablaProducto().getSelectedRow();
        String nom = "", des = "", fv = "", mar = "", pmin = "", pmay = "", can = "", pcpra = "", cat = "";
        if (flag > -1) {
            String idP = (String) window.getTablaProducto().getModel().getValueAt(flag, 0);
            Integer.valueOf(idP);
            ModProducto mod = new ModProducto(this, conexion);
            mod.setVisible(true);
            llenarCB(mod);
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
                    String fecha = fv;
                    Date fe = new SimpleDateFormat("dd/mm/yyyy").parse(fecha);
                    mod.getFechaV().setDate(fe);
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

    public void actualizarProd(ModProducto mp) {
        int id = Integer.valueOf(mp.getTxtCod_MProd().getText());
        String datos = mp.getCmbCatMProd().getSelectedItem().toString();
        String[] parts = datos.split(":");
        int cat = Integer.valueOf(parts[0]);
        Date fechaVenc = mp.getFechaV().getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fec1 = formato.format(fechaVenc);
        try {
            String sql = "UPDATE producto SET nombre = '" + mp.getTxtName_MProd().getText() + "', "
                    + "descripcion = '" + mp.getTxtDesc_MProd().getText() + "', "
                    + "fechaVenc = '" + fec1 + "', "
                    + "cantidad = " + mp.getTxtCant_MProd().getText() + ", "
                    + "pcioCpra = " + mp.getTxtPCpra().getText() + ", "
                    + "pcioMin = " + mp.getTxtPMin().getText() + ", "
                    + "pcioMay = " + mp.getTxtPMay().getText() + ", "
                    + "marca = '" + mp.getTxtMarca_MProd().getText() + "', "
                    + "categoria_idCategoria = " + cat + " "
                    + "WHERE idProducto = " + id + ";";

            Statement st = conexion.getStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(window, "El Producto fue modificado...");
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarProd(JTable tabla) {
        int flag = tabla.getSelectedRow();
        if (flag > -1) {
            int s = JOptionPane.showConfirmDialog(tabla, "¿Esta seguro de Borrar el Producto?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (s == JOptionPane.YES_OPTION) {
                String idP = (String) tabla.getModel().getValueAt(flag, 0);
                Integer.valueOf(idP);
                try {
                    String sql = "DELETE FROM producto WHERE idProducto =" + idP + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(sql);
                    System.out.println("Producto borrado");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }else {
                JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
    }

}
