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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GestionConexion;
import vistas.LiquidacionSueldo;

/**
 *
 * @author Martin
 */
public class ControladorLiquidacionSueldo {

    private GestionConexion conexion;
    private LiquidacionSueldo window;
    private DefaultTableModel modelo;
    String[] titulos2 = {"Descripcion", "cantidad", "ID Concepto", "idSueldo", "Tipo"};
    private DefaultTableModel modelo2 = new DefaultTableModel(null, titulos2);
    String datos[] = new String[5];

    public ControladorLiquidacionSueldo(GestionConexion conn) {
        conexion = conn;
        window = new LiquidacionSueldo(conexion, this);
        window.setVisible(true);
        generarnumeracion();
    }

    public void generarnumeracion() {
        String SQL = "SELECT MAX(idSueldo) FROM sueldo";
        // String SQL="select count(*) from factura";
        //String SQL="SELECT MAX(cod_emp) AS cod_emp FROM empleado";
        //String SQL="SELECT @@identity AS ID";
        window.getTxtSueldo().setEnabled(false);
        int c = 0;

        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }

            if (c == 0) {
                window.getTxtSueldo().setText("6000");

            } else {
                window.getTxtSueldo().setText("" + (c + 1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*public void llenarConceptos(LiquidacionSueldo v1){
     window=v1;
     try {
     DefaultListModel model = new DefaultListModel(); //create a new list model
     String sql = "SELECT idConcepto,descripcion FROM concepto_liquidacion";
            
            
     Statement st = conexion.getStatement();
     ResultSet rs = st.executeQuery(sql);
     while (rs.next()) {
     int id = rs.getInt("idConcepto");
     String desc = rs.getString("descripcion");
     model.addElement(""+id+":"+desc);

     }
            
            
     window.getConcepList().setModel(model);
     } catch (SQLException ex) {
     Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/
    public void buscarEmp(LiquidacionSueldo v1) {
        window = v1;
        int iduser = Integer.valueOf(window.getTxt_id().getText());
        String nom = "", ap = "", dni = "", horas = "", fecIng = "";

        try {
            String sql = "SELECT * FROM empleado WHERE idEmpleado = " + iduser + ";";
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                nom = rs.getString("nombre");
                ap = rs.getString("apellido");
                dni = rs.getString("dni");
                horas = rs.getString("cargaHoraria");
                fecIng = rs.getString("fechaIngreso");

            }
            window.getTxt_nom().setText(nom);
            window.getTxt_apel().setText(ap);
            window.getTxt_dni().setText(dni);
            window.getTxt_fecIng().setText(fecIng);
            window.getTxt_horas().setText(horas);
            ;

        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void llenarConceptos(LiquidacionSueldo v1) {
        window = v1;
        String[] titulos = {"id", "Descripcion", "Importe", "Tipo"};
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[4];
        String sql = "SELECT * FROM concepto_liquidacion";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idConcepto");
                datos[1] = rs.getString("descripcion");
                datos[2] = rs.getString("importe");
                datos[3] = rs.getString("tipoConcepto");
                modelo.addRow(datos);
            }
            window.getTablaConceptos().setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void seleccionarConceptos(LiquidacionSueldo v1) {

        window = v1;

        int flag = window.getTablaConceptos().getSelectedRow();
        if (flag > -1) {
            String concepto = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);

            if (!concepto.equals("sueldo basico")) {

                datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
                datos[1] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 2);
                datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);
                datos[3] = window.getTxtSueldo().getText();
                datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);
                modelo2.addRow(datos);
            }
            window.getTablaSueldo().setModel(modelo2);
        }
    }

    public void calcularsueldoBasico(LiquidacionSueldo v1) {
        window = v1;
        float importe = 0;
        int horas = 0, dias = 0;
        int flag = window.getTablaConceptos().getSelectedRow();

        if (flag > -1) {
            String concepto = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
            if (concepto.equals("sueldo basico")) {
                importe = Float.valueOf((String) window.getTablaConceptos().getModel().getValueAt(flag, 2));
                horas = Integer.valueOf(window.getTxt_horas().getText());
                dias = Integer.valueOf(window.getTxt_dias().getText());
                if (horas == 8) {
                    if (dias == 30) {
                        datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 2);//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = window.getTxtSueldo().getText();//idsueldo
                        datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);

                    } else if (dias != 30 && dias < 30) {
                        datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = "" + ((importe / 30) * dias);//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = window.getTxtSueldo().getText();//idsueldo
                        datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);
                    }
                } else if (horas == 4) {
                    if (dias == 30) {
                        datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = "" + importe / 2;//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = window.getTxtSueldo().getText();//idsueldo
                        datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);

                    } else if (dias != 30 && dias < 30) {
                        datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = "" + ((importe / 60) * dias);//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = window.getTxtSueldo().getText();//idsueldo
                        datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);
                    }
                }
            }
        }
        window.getTablaSueldo().setModel(modelo2);
    }

    public void calcularAsignacionxHijo(LiquidacionSueldo v1) {
        window = v1;
        float importe = 0;
        int id;
        String number="";
        int dude=0;
        float asignacion=0;
        int flag = window.getTablaConceptos().getSelectedRow();

        if (flag > -1) {
            String concepto = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
            if (concepto.equals("Asig por hijo")) {
                try {
                    importe = Float.valueOf((String) window.getTablaConceptos().getModel().getValueAt(flag, 2));
                    id = Integer.valueOf(window.getTxt_id().getText());
                    String sql = "SELECT count(*) FROM familiar AS f WHERE f.parentesco LIKE 'hijo%' AND f.empleado_idEmpleado = " + id + ";";

                    Statement st = conexion.getStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                       dude=rs.getInt('f');
                        System.out.println("nro"+dude);
            }
                    
                    asignacion=dude*importe;
                    datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = ""+asignacion;//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = window.getTxtSueldo().getText();//idsueldo
                        datos[4] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        window.getTablaSueldo().setModel(modelo2);
    }
}
