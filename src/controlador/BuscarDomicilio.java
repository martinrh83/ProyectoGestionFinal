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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.GestionPersonal;
import vistas.ListarDomicilios;

/**
 *
 * @author Martin
 */
public class BuscarDomicilio {
     private GestionConexion conexion;
     private ListarDomicilios window;
    private DefaultTableModel model;
    private GestionPersonal person;
    
    
    public BuscarDomicilio(GestionPersonal pers,GestionConexion conn) {

        conexion = conn;
        person=pers;
        window = new ListarDomicilios(this, conexion,person);
        
        window.setVisible(true);
    }
    
     public void busquedaPredictiva(String comodin, JTable tb) {
      
       String[] titulos = {"idDomicilio", "barrio", "calle", "altura", "departamento", "Piso", "Provincia", "Ciudad", "CP"};
        model = new DefaultTableModel(null, titulos);
        String val[] = new String[9];
        try {
            String sql = "SELECT * FROM domicilio WHERE calle LIKE '" + comodin + "'";
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val[0] = rs.getString("idDomicilio");
                val[1] = rs.getString("barrio");
                val[2] = rs.getString("calle");
                val[3] = rs.getString("altura");
                val[4] = rs.getString("departamento");
                val[5] = rs.getString("piso");
                val[6] = rs.getString("provincia");
                val[7] = rs.getString("ciudad");
                val[8] = rs.getString("codPostal");
                
                model.addRow(val);
            }
            window.getTabla_doc().setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public int obtenerDoc(){
     int id=0;
     
      String idDomicilio;
        int flag = window.getTabla_doc().getSelectedRow();
        
        if (flag > -1) {
            idDomicilio = (String) window.getTabla_doc().getModel().getValueAt(flag, 0);
            id=Integer.valueOf(idDomicilio);
        }
     return id;
     }
     
     
}
