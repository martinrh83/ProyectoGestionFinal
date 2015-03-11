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
import modelo.Familiar;
import modelo.GestionConexion;
import vistas.GestionGrupoFamiliar;

/**
 *
 * @author Mariana
 */
public class ControladorGrupoFamiliar {

    private GestionConexion conexion;
    private DefaultTableModel modelo;
    private GestionGrupoFamiliar window;
    private Familiar flia;

    public ControladorGrupoFamiliar(GestionConexion conn) {
        conexion = conn;
        flia = new Familiar();
        window = new GestionGrupoFamiliar(flia, this);
    }

    public void buscarEmpleado(GestionGrupoFamiliar f) {

        window = f;
        int id = Integer.valueOf(window.getTxtId_Personal().getText());
        String nom = "";
        String ap = "";
        String d = "";
        try {
            String sql = "SELECT nombre, apellido, dni FROM empleado WHERE " + id + "= idEmpleado";
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nom = rs.getString("nombre");
                ap = rs.getString("apellido");
                d = rs.getString("dni");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        window.getTxtnom_ap().setText(nom + " " + ap);
        window.getTxtdni_Personal().setText(d);
    }

    public void mostrarFamiliares() {
        String[] titulos = {"ID", "Nombre", "D.N.I.", "Parentesco", "Fec. Nac.", "Escalaridad", "Nacionalidad", "Est. Civil", "Discapacidad", "ID. Empleado"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[10];
        String sql = "SELECT * FROM  faliliar";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idFamiliar");
                datos[1] = rs.getString("nomYap");
                datos[2] = rs.getString("dni");
                datos[3] = rs.getString("parentesco");
                datos[4] = rs.getString("fechaNac");
                datos[5] = rs.getString("escolaridad");
                datos[6] = rs.getString("nacionalidad");
                datos[7] = rs.getString("estCivil");
                datos[8] = rs.getString("discapacitado");
                datos[9] = rs.getString("empleado_idEmpleado");

                modelo.addRow(datos);
            }
            window.getTabla_familiares().setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarFamiliar() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO familiar (idFamiliar, nomYap, dni, parentesco, fechaNac, escolaridad, nacionalidad, estCivil, discapacitado, empleado_idEmpleado)"
                    + "VALUES (" + flia.getIdf() + ",'" + flia.getNya() + "',"
                    + flia.getDni() + ", '" + flia.getParentesco() + "', '"
                    + flia.getFnac() + "', '" + flia.getEscolaridad() + "', '"
                    + flia.getNacionalidad() + "', '" + flia.getEsciv() + "', '"
                    + flia.getDisc() + "', " + flia.getEmpid() + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorGrupoFamiliar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
