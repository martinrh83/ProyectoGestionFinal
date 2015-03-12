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
    private int idUser;
    public ControladorGrupoFamiliar(GestionConexion conn,Integer id) {
        conexion = conn;
        idUser=id;
        flia = new Familiar();
        window = new GestionGrupoFamiliar(flia, this);
        window.setVisible(true);
        this.generarNumeracion();
        this.mostrarDatosEmp(window);
        this.mostrarFamiliares();
    }
    
    public void mostrarDatosEmp(GestionGrupoFamiliar v1){
    window=v1;
    window.getTxtId_Personal().setText(""+idUser);
    window.getTxtId_Personal().setEnabled(false);
    }

    public void generarNumeracion() {
        String sql = "SELECT max(idFamiliar) FROM familiar";
        window.getTxt_idFam().setEnabled(false);
        int c = 0;

        try {
            Statement st = conexion.getStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                window.getTxt_idFam().setText("1");
            } else {
                window.getTxt_idFam().setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mostrarFamiliares() {
        String[] titulos = {"ID", "Nombre", "D.N.I.", "Parentesco", "Fec. Nac.", "Escalaridad", "Nacionalidad", "Est. Civil", "Discapacidad","idEmpleado"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[10];
        String sql = "SELECT * FROM  familiar where empleado_idEmpleado="+idUser+";";
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
                datos[9]=rs.getString("Empleado_idEmpleado");

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
