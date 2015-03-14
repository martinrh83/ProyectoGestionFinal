/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
    private String fec;
    String[] titulos2 = {"Descripcion", "cantidad", "ID Concepto", "Tipo"};
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

    public void obtenerFecha(LiquidacionSueldo v1) {

        Calendar Cal = Calendar.getInstance();
        fec = Cal.get(Cal.DATE) + "/" + (Cal.get(Cal.MONTH) + 1) + "/" + Cal.get(Cal.YEAR);

        v1.getTxtFecActual().setText(fec);
        v1.getTxtFecActual().setEnabled(false);
    }

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
            String hoy = window.getTxtFecActual().getText();
            String[] dat1 = fecIng.split("/");
            String[] dat2 = hoy.split("/");

            int anos = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
            int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
            if (mes < 0) {
                anos = anos - 1;
            } else if (mes == 0) {
                int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
                if (dia > 0) {
                    anos = anos - 1;
                }
            }

            window.getTxt_nom().setText(nom);
            window.getTxt_apel().setText(ap);
            window.getTxt_dni().setText(dni);
            window.getTxt_fecIng().setText(fecIng);
            window.getTxt_horas().setText(horas);
            window.getTxt_Antiguedad().setText("" + anos);
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

            if (!concepto.equals("sueldo basico") && !concepto.equals("Asig por hijo") && !concepto.equals("Antiguedad")) {

                datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
                datos[1] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 2);
                datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);
                datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);

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

                if (!window.getTxt_dias().getText().equals("")) {
                    dias = Integer.valueOf(window.getTxt_dias().getText());
                    if (horas == 8) {
                        if (dias == 30) {
                            datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                            datos[1] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 2);//cantidad
                            datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                            datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                            modelo2.addRow(datos);

                        } else if (dias != 30 && dias < 30) {
                            datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                            datos[1] = "" + ((importe / 30) * dias);//cantidad
                            datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                            datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                            modelo2.addRow(datos);
                        }
                    } else if (horas == 4) {
                        if (dias == 30) {
                            datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                            datos[1] = "" + importe / 2;//cantidad
                            datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                            datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                            modelo2.addRow(datos);

                        } else if (dias != 30 && dias < 30) {
                            datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                            datos[1] = "" + ((importe / 60) * dias);//cantidad
                            datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                            datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                            modelo2.addRow(datos);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de horas");
                }
            }
        }
        window.getTablaSueldo().setModel(modelo2);
    }

    public void calcularAsignacionxHijo(LiquidacionSueldo v1) {
        window = v1;
        float importe = 0;
        int id;
        int cantHijos = 0;
        float asignacion = 0;
        int flag = window.getTablaConceptos().getSelectedRow();

        if (flag > -1) {
            String concepto = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
            if (concepto.equals("Asig por hijo")) {
                try {
                    importe = Float.valueOf((String) window.getTablaConceptos().getModel().getValueAt(flag, 2));
                    id = Integer.valueOf(window.getTxt_id().getText());
                    String sql = "SELECT count(*) AS count FROM familiar AS f WHERE f.parentesco LIKE 'hijo%' AND f.empleado_idEmpleado = " + id + ";";

                    Statement st = conexion.getStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        cantHijos = rs.getInt("count");

                    }
                    if (cantHijos != 0) {
                        asignacion = cantHijos * importe;
                        datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                        datos[1] = "" + asignacion;//cantidad
                        datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                        datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                        modelo2.addRow(datos);
                    } else {
                        JOptionPane.showMessageDialog(null, "El empleado no posee hijos");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        window.getTablaSueldo().setModel(modelo2);
    }

    public void calcularAntiguedad() {

        float importe = 0;
        int antiguedad;
        float asignacion = 0;
        int flag = window.getTablaConceptos().getSelectedRow();

        if (flag > -1) {
            String concepto = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);
            if (concepto.equals("Antiguedad")) {

                importe = Float.valueOf((String) window.getTablaConceptos().getModel().getValueAt(flag, 2));
                antiguedad = Integer.valueOf(window.getTxt_Antiguedad().getText());

                asignacion = antiguedad * importe * 8500;
                datos[0] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 1);//descripcion
                datos[1] = "" + asignacion;//cantidad
                datos[2] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 0);//idconcepto
                datos[3] = (String) window.getTablaConceptos().getModel().getValueAt(flag, 3);//tipo
                modelo2.addRow(datos);

            }
        }
        window.getTablaSueldo().setModel(modelo2);
    }

    public void calcularSueldo() {
        float cantidad = 0;
        String tipo;
        float total = 0;
        for (int i = 0; i < window.getTablaSueldo().getRowCount(); i++) {
            cantidad = Float.valueOf(window.getTablaSueldo().getValueAt(i, 1).toString());
            tipo = window.getTablaSueldo().getValueAt(i, 3).toString();

            if (tipo.equals("Haber")) {
                total = total + cantidad;
            } else {
                total = total - cantidad;
            }

        }
        window.getTxt_total().setText("" + total);
    }

    public String obtenerContratacion() {
        int hora = Integer.valueOf(window.getTxt_horas().getText());
        String contrato = "";
        if (hora == 8) {
            contrato = "Full-Time";
        } else {
            contrato = "Part-Time";
        }
        return contrato;
    }

    public void agregarLliquidacion(LiquidacionSueldo v1) {
        window = v1;
        for (int i = 0; i < window.getTablaSueldo().getRowCount(); i++) {
            String descripcion = window.getTablaSueldo().getValueAt(i, 0).toString();
            float subtotal = Float.valueOf(window.getTablaSueldo().getValueAt(i, 1).toString());
            int idConcepto = Integer.valueOf(window.getTablaSueldo().getValueAt(i, 2).toString());
            int idSueldo = Integer.valueOf(window.getTxtSueldo().getText());

            try {
                String sql = "INSERT INTO Linea_de_liquidacion(descripcion,subtotal,concepto_liquidacion_idConcepto,sueldo_idSueldo) VALUES ('"
                        + descripcion + "',"
                        + subtotal + ","
                        + idConcepto + ","
                        + idSueldo + ")";
                conexion.getStatement().executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
/*
    public void grabarLiquidacion(LiquidacionSueldo v1) {
        window = v1;

        int sueldo = Integer.valueOf(window.getTxtSueldo().getText());
        String fecha = window.getTxtFecActual().getText();
        String lugarP = window.getCmbLugar().getSelectedItem().toString();
        String contratacion = obtenerContratacion();
        float total = Float.valueOf(window.getTxt_total().getText());
        int idEmpleado = Integer.valueOf(window.getTxt_id().getText());
        String periodo = (window.getMes().getMonth() + 1) + "/" + window.getAnio().getYear();
        try {
            conexion.getStatement().executeUpdate("INSERT INTO sueldo (idSueldo,perAbonado,fechaPago,lugarPago,contratacion,sdoNeto,empleado_idEmpleado)"
                    + "VALUES (" + sueldo + ",'"
                    + periodo + "','"
                    + fecha + "','"
                    + lugarP + "','"
                    + contratacion + "',"
                    + total + ","
                    + idEmpleado + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Se registro la Liquidación");
    }*/
    
     public void grabarLiquidacion(LiquidacionSueldo v1) {
        window = v1;

        int sueldo = Integer.valueOf(window.getTxtSueldo().getText());
        String fecha = window.getTxtFecActual().getText();
        String lugarP = window.getCmbLugar().getSelectedItem().toString();
        String contratacion = obtenerContratacion();
        float total = Float.valueOf(window.getTxt_total().getText());
        int idEmpleado = Integer.valueOf(window.getTxt_id().getText());
        String periodo = (window.getMes().getMonth() + 1) + "/" + window.getAnio().getYear();
        try {
            conexion.getStatement().executeUpdate("INSERT INTO sueldo (perAbonado,fechaPago,lugarPago,contratacion,sdoNeto,empleado_idEmpleado)"
                    + "VALUES ('" 
                    + periodo + "','"
                    + fecha + "','"
                    + lugarP + "','"
                    + contratacion + "',"
                    + total + ","
                    + idEmpleado + ");");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLiquidacionSueldo.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Se registro la Liquidación");
    }
}
