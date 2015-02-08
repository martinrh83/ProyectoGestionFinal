/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.NuevaVenta;

/**
 *
 * @author Martin
 */
public class ControladorVenta {

    private GestionConexion conexion;
    private NuevaVenta windowVenta;
    private DefaultTableModel modelo;
    private String user;
    private Venta venta;

    String datos[] = new String[7];
    String[] titulos = {"Codigo", "Nombre", "Descripción", "Marca", "Cantidad", "Precio"};

    public ControladorVenta(GestionConexion conn, String us) {
        conexion = conn;
        user = us;
        modelo = new DefaultTableModel(null, titulos);
        venta=new Venta();
        windowVenta = new NuevaVenta(this, conexion,venta);
        windowVenta.setVisible(true);

    }

    public void setearUsuario(JLabel label,JLabel id) {
        try {
            label.setText(user);
            String sql="select IdUsuario from usuario where User='"+user+"'";
            ResultSet rs=conexion.getStatement().executeQuery(sql);
            while (rs.next()) {
                 int idprueba=rs.getInt(1);
            id.setText(""+idprueba);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

     
    }

    public void Generarnumeracion(JTextField idVenta) {
        String SQL = "select max(idVenta) from venta";
        // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        idVenta.setEnabled(false);
        int c = 0;
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }

            if (c == 0) {
                idVenta.setText("1");

            } else {
                idVenta.setText("" + (c + 1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void obtenerFecha(JTextField fecha) {
        Calendar Cal = Calendar.getInstance();
        String fec = Cal.get(Cal.YEAR)+ "-" + (Cal.get(Cal.MONTH) + 1) + "-" + Cal.get(Cal.DATE)  + " " + Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND);

        fecha.setText(fec);
        fecha.setEnabled(false);
    }

    public void agregarCarrito(int codigo, JTable tVenta, String cant) {

        String sql = "SELECT * FROM  producto where CodigoProducto=" + codigo + "";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("CodigoProducto");
                datos[1] = rs.getString("Nombre");
                datos[2] = rs.getString("Presentacion");
                datos[3] = rs.getString("Marca");
                datos[4] = cant;
                datos[5] = rs.getString("Precio_Minorista");

                modelo.addRow(datos);
            }
            tVenta.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void descontarstock(int codi, String cant) {
        int baja = Integer.valueOf(cant);
        int stockPast = 0;
        int stockFinal;
        String consul = "SELECT * FROM producto WHERE  CodigoProducto=" + codi + "";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                stockPast = rs.getInt(5);
            }

        } catch (Exception e) {
        }
        stockFinal = stockPast - baja;
        String query = "UPDATE producto SET Cantidad=" + stockFinal + " WHERE CodigoProducto = " + codi + "";
        try {
            Statement st = conexion.getStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
        }

    }

    public void agregarLVenta(JTable tVenta, JTextField idVenta) {

        for (int i = 0; i < tVenta.getRowCount(); i++) {

            int cantidad = Integer.valueOf(tVenta.getValueAt(i, 4).toString());
            float precio = Float.valueOf(tVenta.getValueAt(i, 5).toString());
            int codprod = Integer.valueOf(tVenta.getValueAt(i, 0).toString());
            int id = Integer.valueOf(idVenta.getText());

            try {
                String sql = "INSERT INTO Linea_de_Venta(cantidad,precio,Producto_idProducto,Venta_idVenta) VALUES (" + cantidad + "," + precio + "," + codprod + "," + id + ")";
                conexion.getStatement().executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void calcular(NuevaVenta venta, JTable tVenta) {

        double subtotal = 0;
        float precio;
        int cantidad;
        float importe;

        /*can=Integer.parseInt(cant);
         imp=pre*can;
         dato[4]=Float.toString(imp);*/
        for (int i = 0; i < tVenta.getRowCount(); i++) {
            cantidad = Integer.valueOf(tVenta.getValueAt(i, 4).toString());
            precio = Float.valueOf(tVenta.getValueAt(i, 5).toString());

            importe = precio * cantidad;
            subtotal = subtotal + importe;
            venta.getTxtSubTotal_Venta().setText("" + subtotal);

        }
        venta.getTxtTotal_Venta().setText("" + subtotal);

    }
    
    public void grabarVenta(){
         try {
            conexion.getStatement().executeUpdate("INSERT INTO venta (idVenta,fechaVta,tipoVta,porcMarc,Cliente_idCliente,Usuario_idUsuario)"
                    + "VALUES (" + venta.getIdVenta()+ ",'" + venta.getFechaVta() + "','" + venta.getTipoVta() + "'," + venta.getPorcMarc()+ "," + venta.getCliente_idCliente() + "," + venta.getUsuario_idUsuario()+ ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
