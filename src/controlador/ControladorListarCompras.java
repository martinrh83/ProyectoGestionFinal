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
import vistas.ListarCompra;


/**
 *
 * @author Martin
 */
public class ControladorListarCompras {
    
    private DefaultTableModel modelo;
    private GestionConexion conexion;
    private ListarCompra window;
    
    public ControladorListarCompras(GestionConexion conn) {
        conexion = conn;
        window = new ListarCompra(this, conexion);
        window.setVisible(true);
    }
    
    public void listarComprasDiarias(String fec, ListarCompra v1) {
        
        String[] titulos = {"id", "Fecha", "Proveedor", "Importe", "Empleado"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[5];
        String sql = "SELECT * FROM compra where fechaCpra='" + fec + "';";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idCompra");
                datos[1] = rs.getString("fechaCpra");
                datos[2] = rs.getString("proveedor_idProveedor");
                datos[3] = rs.getString("impTotal");
                datos[4] = rs.getString("empleado_idEmpleado");
                modelo.addRow(datos);
            }
            window.getTablaCompras().setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

