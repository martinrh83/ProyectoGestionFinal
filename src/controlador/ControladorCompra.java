/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Compra;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.NuevaCompra;

/**
 *
 * @author Casa
 */
public class ControladorCompra {

    private GestionConexion conexion;
    private String usuario;
    private DefaultTableModel modelo;
    private NuevaCompra wincompra;
    private Compra compra;

    String val[] = new String[7];
    String[] titulos = {"Cod", "Nombre", "Descripcion", "Cantidad", "Marca", "P. Compra", "Importe"};

    public ControladorCompra(GestionConexion conn, String user) {
        conexion = conn;
        usuario = user;
        modelo = new DefaultTableModel(null, titulos);
        compra = new Compra();
        wincompra = new NuevaCompra(this, conexion, compra);
        wincompra.setVisible(true);


    }

    public void setearUsuario(JLabel id) {
        try {
            String sql = "SELECT idEmpleado FROM empleado WHERE user='" + usuario + "'";
            ResultSet rs = conexion.getStatement().executeQuery(sql);
            while (rs.next()) {
                int idprueba = rs.getInt(1);
                id.setText("" + idprueba);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void GenerarNumeracion(JTextField idCompra) {
        String SQL = "SELECT MAX(idCompra) FROM compra";
        idCompra.setEnabled(false);
        int c = 0;
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                idCompra.setText("10078000");
            } else {
                idCompra.setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> consulta() {//Retornamos un ArrayList para tratarlo en el JComboBox
        String sql = "SELECT idProveedor, nombre FROM proveedor";
        ArrayList<String> ls = new ArrayList<String>();
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre=rs.getString("nombre");
                int id=rs.getInt("idProveedor");
                ls.add("" + id + ": " + nombre);
                System.out.println("nombre" + ls);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    public void llenarCB(JComboBox cmb) {
        ArrayList<String> resul;
        resul = consulta();
        System.out.println("resultado" + resul);
       for (int i = 0; i < resul.size(); i++) {
            cmb.addItem(resul.get(i));
        }
    }
    
    /*public void obtenerFecha(JTextField fecha) {
        Calendar Cal = Calendar.getInstance();
        String fec = Cal.get(Cal.YEAR) + "-" + (Cal.get(Cal.MONTH) + 1) + "-" + Cal.get(Cal.DATE) + " " + Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND);

        fecha.setText(fec);
        fecha.setEnabled(false);
    }*/
    
    public void obtenerFecha(JTextField fecha) {
        Calendar Cal = Calendar.getInstance();
        int nroMes=Cal.get(Cal.MONTH)+1;
        String mes="";
        if(nroMes<=9){
             mes="0"+nroMes;
        }
        String fec = Cal.get(Cal.DATE) +  "/" + mes + "/" +  Cal.get(Cal.YEAR)/* + " " + Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND)*/;

        fecha.setText(fec);
        fecha.setEnabled(false);
    }

    public void aumentar(int codigo, JTable tbCompra, String cant) {
        String sql = "SELECT * FROM  producto WHERE idProducto = " + codigo + ";";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val[0] = rs.getString("idProducto");
                val[1] = rs.getString("nombre");
                val[2] = rs.getString("descripcion");
                val[3] = cant;
                val[4] = rs.getString("marca");
                val[5] = rs.getString("pcioCpra");
                val[6] = "" + Integer.valueOf(cant) * Integer.valueOf(val[5]);

                modelo.addRow(val);
            }
            tbCompra.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void calcular(JTable tbCompra) {
        double total = 0;
        float precio;
        int cantidad;
        float importe;
        for (int i = 0; i < tbCompra.getRowCount(); i++) {
            cantidad = Integer.valueOf(tbCompra.getValueAt(i, 3).toString());
            precio = Float.valueOf(tbCompra.getValueAt(i, 5).toString());

            importe = precio * cantidad;
            total = total + importe;
        }
        wincompra.getTxt_TotCpra().setText(""+total);
    }

    public void aumentarStock(JTable tbCompra) {
        
        int codigo;
        int stockAnt = 0;
        int stockFinal;
        for (int i = 0; i < tbCompra.getRowCount(); i++) {
            codigo = Integer.valueOf(tbCompra.getValueAt(i, 0).toString());
            int cantidad = Integer.valueOf(tbCompra.getValueAt(i, 3).toString());
        
        String sql = "SELECT * FROM producto WHERE  idProducto = " + codigo + "";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                stockAnt = rs.getInt(5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        stockFinal = stockAnt + cantidad;
        String query = "UPDATE producto SET cantidad=" + stockFinal + " WHERE idProducto = " + codigo + "";
        try {
            Statement st = conexion.getStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public void agregarLCompra(JTable tbCompra, JTextField idCompra) {
        
        for (int i = 0; i < tbCompra.getRowCount(); i++) {
                float importe = Float.valueOf(tbCompra.getValueAt(i, 6).toString());
                int cantidad = Integer.valueOf(tbCompra.getValueAt(i, 3).toString());
                int codprod = Integer.valueOf(tbCompra.getValueAt(i, 0).toString());
                int id = Integer.valueOf(idCompra.getText());
            try {    
                String sql = "INSERT INTO linea_de_compra(cantidad,subtotal,compra_idCompra,producto_idProducto) VALUES (" + cantidad + "," + importe + "," + id+ "," + codprod  + ")";
                conexion.getStatement().executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }

    public void guardarCompra() {
        String query = "INSERT INTO compra (idCompra, fechaCpra, impTotal, proveedor_idProveedor, empleado_idEmpleado)"
                    + "VALUES (" + compra.getIdCompra() + ",'" + compra.getFecCompra() + "', " + compra.getImpTotal() + ","+compra.getProveedor_idProveedor()+"," + compra.getUsuario_idUsuario() + ");";
        try {
            conexion.getStatement().executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Se registro la compra ");
    }

}
