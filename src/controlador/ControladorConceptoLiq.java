  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static java.awt.SystemColor.control;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Concepto;
import modelo.GestionConexion;
import vistas.GestionConcepto;
import vistas.ModConcepto;

/**
 *
 * @author Martin
 */
public class ControladorConceptoLiq {

    private GestionConexion conexion;
    private Concepto concepto;
    private GestionConcepto conceptowin;
    private DefaultTableModel modelo_Concepto;

    public ControladorConceptoLiq(GestionConexion conexion) {
        this.conexion = conexion;
        this.concepto = new Concepto();
        conceptowin = new GestionConcepto(this, concepto);
        conceptowin.setVisible(true);
        Generarnumeracion();
        mostrarConceptos();

    }

    public void Generarnumeracion() {
        String SQL = "select max(idConcepto) from concepto_liquidacion";

        conceptowin.getTxtCodigo_con().setEnabled(false);
        int c = 0;
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            if (c == 0) {
                conceptowin.getTxtCodigo_con().setText("456783");
            } else {
                conceptowin.getTxtCodigo_con().setText("" + (c + 1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarConcepto() {
        try {
            conexion.getStatement().executeUpdate("INSERT INTO concepto_liquidacion (idConcepto,descripcion,importe,tipoConcepto)"
                    + "VALUES (" + concepto.getIdConcepto() + ",'" + concepto.getDescripcion() + "'," + concepto.getImporte() + ",'" + concepto.getTipo_concepto() + "');");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarConceptos() {
        String[] titulos = {"id", "Descripcion", "Importe", "Tipo"};
        modelo_Concepto = new DefaultTableModel(null, titulos);
        String datos[] = new String[4];
        String sql = "SELECT * FROM  concepto_liquidacion";
        try {
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idConcepto");
                datos[1] = rs.getString("descripcion");
                datos[2] = rs.getString("importe");
                datos[3] = rs.getString("tipoConcepto");
                modelo_Concepto.addRow(datos);
            }
            conceptowin.tablaConceptos.setModel(modelo_Concepto);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarFilaConcepto(GestionConcepto tabla) {
        int flag = tabla.getTablaConceptos().getSelectedRow();
        if (flag > -1) {
            int n = JOptionPane.showConfirmDialog(tabla, "Esta seguro de Borrar ?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                String idCalculo = (String) tabla.getTablaConceptos().getModel().getValueAt(flag, 0);
                Integer.valueOf(idCalculo);
                try {
                    String query = "Delete from concepto_liquidacion where idConcepto =" + idCalculo + ";";
                    Statement st = conexion.getStatement();
                    st.executeUpdate(query);
                    System.out.println("Concepto borrado. ");
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(tabla, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void modificarConcepto() {
         ModConcepto windown;
        int flag = conceptowin.tablaConceptos.getSelectedRow();
        String des = "", importe = "";
        if (flag > -1) {
            windown = new ModConcepto(conexion,concepto,this);
       windown.setVisible(true);
            String idCalculo = (String) conceptowin.tablaConceptos.getModel().getValueAt(flag, 0);
            Integer.valueOf(idCalculo);
            try {
                String sql = "SELECT * FROM concepto_liquidacion WHERE idConcepto = " + idCalculo + ";";
                Statement st = conexion.getStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    des = rs.getString("descripcion");
                    importe = "" + rs.getInt("importe");
                }
                windown.txtCodigo_con_mod.setText(idCalculo);
                windown.getTxtDescripcion_mod().setText(des);
                windown.getTxtImporte_conc_mod().setText(importe);

            } catch (SQLException ex) {
                Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(conceptowin.tablaConceptos, "Debe seleccionar una fila", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateConcepto(Concepto concep) {
        try {
            String query = "UPDATE concepto_liquidacion SET descripcion = '" + concepto.getDescripcion() + "', "
                    + "importe = " + concepto.getImporte() + " , "
                    + "tipoConcepto = '" + concepto.getTipo_concepto() + "' "
                    + "WHERE idConcepto = " + concepto.getIdConcepto() + ";";
            Statement st = conexion.getStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(conceptowin, "El Concepto fue modificado ");
            System.out.println("Concepto Modificado");
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void buscarConcepto(String comodin, JTable tb) {
        DefaultTableModel model;
        String[] titulos = {"idConcepto", "Descripcion", "Importe", "TipoConcepto"};
        model = new DefaultTableModel(null, titulos);
        String val[] = new String[4];
        try {
            String sql = "SELECT * FROM concepto_liquidacion WHERE descripcion LIKE '" + comodin + "'";
            Statement st = conexion.getStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                val[0] = rs.getString("idConcepto");
                val[1] = rs.getString("descripcion");
                val[2] = rs.getString("importe");
                val[3] = rs.getString("tipoConcepto");

                model.addRow(val);
            }
            conceptowin.tablaConceptos.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(ControladorConceptoLiq.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
