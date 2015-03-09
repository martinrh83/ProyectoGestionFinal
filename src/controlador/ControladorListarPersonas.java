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
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.AltaDomicilio;
import vistas.ListarPersona;

/**
 *
 * @author Martin
 */
public class ControladorListarPersonas {

    private GestionConexion conexion;
    private ListarPersona persona;
    private DefaultTableModel modelo;
    private AltaDomicilio domic;

    public ControladorListarPersonas(AltaDomicilio dom,GestionConexion conn) {
        conexion = conn;
        domic=dom;
        persona = new ListarPersona(conexion, this,domic);
        persona.setVisible(true);
    }

    public void listarpersonas(String person) {
        switch (person) {
            case "Empleado":
                String[] titulosE = {"id", "Nombre", "Apellido", "Usuario"};
                modelo = new DefaultTableModel(null, titulosE);
                String datosE[] = new String[4];
                String sqlE = "SELECT * FROM  empleado";
                try {
                    Statement st = conexion.getStatement();
                    ResultSet rs = st.executeQuery(sqlE);
                    while (rs.next()) {
                        datosE[0] = rs.getString("idEmpleado");
                        datosE[1] = rs.getString("nombre");
                        datosE[2] = rs.getString("apellido");
                        datosE[3] = rs.getString("user");

                        modelo.addRow(datosE);
                    }
                    persona.getTb_Person().setModel(modelo);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorListarPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            case "Cliente":
                String[] titulosC = {"id", "Nombre", "Apellido"};
                modelo = new DefaultTableModel(null, titulosC);
                String datosC[] = new String[3];
                String sqlC = "SELECT * FROM  cliente";
                try {
                    Statement st = conexion.getStatement();
                    ResultSet rs = st.executeQuery(sqlC);
                    while (rs.next()) {
                        datosC[0] = rs.getString("idCliente");
                        datosC[1] = rs.getString("nombre");
                        datosC[2] = rs.getString("apellido");

                        modelo.addRow(datosC);
                    }
                    persona.getTb_Person().setModel(modelo);

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorListarPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "Proveedor":
                String[] titulosP = {"id", "Nombre", "C.U.I.T."};
                modelo = new DefaultTableModel(null, titulosP);
                String datosP[] = new String[3];
                String sql = "SELECT * FROM  proveedor";
                try {
                    Statement st = conexion.getStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        datosP[0] = rs.getString("idProveedor");
                        datosP[1] = rs.getString("nombre");
                        datosP[2] = rs.getString("cuit");

                        modelo.addRow(datosP);
                    }
                    persona.getTb_Person().setModel(modelo);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorListarPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

    public String obtenerID(String person) {
        switch (person) {
            case "Empleado":
                String idEmpleado ="";
                int flagE = persona.getTb_Person().getSelectedRow();

                if (flagE > -1) {
                    idEmpleado = (String) persona.getTb_Person().getModel().getValueAt(flagE, 0);
                }
                return "Empleado:"+idEmpleado;

            case "Cliente":
                String idCliente="";
                int flagC = persona.getTb_Person().getSelectedRow();

                if (flagC > -1) {
                    idCliente = (String) persona.getTb_Person().getModel().getValueAt(flagC, 0);
                }
                return "Cliente:"+idCliente;
                

            case "Proveedor":
                String idProveedor="";
                int flagP = persona.getTb_Person().getSelectedRow();

                if (flagP > -1) {
                    idProveedor = (String) persona.getTb_Person().getModel().getValueAt(flagP, 0);
                }
                return "Proveedor:"+idProveedor;
        }
        return null;
        

    }

}
