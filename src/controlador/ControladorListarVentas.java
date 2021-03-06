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
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.ListarVenta;

/**
 *
 * @author Martin
 */
public class ControladorListarVentas {
    
    private DefaultTableModel modelo;
    private GestionConexion conexion;
    private ListarVenta window;
    
    public ControladorListarVentas(GestionConexion conn) {
        conexion = conn;
        window = new ListarVenta(this, conexion);
        window.setVisible(true);
    }
    
    public void listarVentasDiarias(String fec, ListarVenta v1) {
        
        String[] titulos = {"id", "Fecha", "Tipo", "Importe", "Empleado"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[5];
        String sql = "SELECT * FROM venta where fechaVta='" + fec + "';";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idVenta");
                datos[1] = rs.getString("fechaVta");
                datos[2] = rs.getString("tipoVta");
                datos[3] = rs.getString("impTotal");
                datos[4] = rs.getString("empleado_idEmpleado");
                modelo.addRow(datos);
            }
            window.getTablaVentas().setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
