/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Concepto;
import controlador.ControladorConceptoLiq;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author Mariana
 */
public class GestionConcepto extends javax.swing.JFrame {

   private Concepto concepto;
   private ControladorConceptoLiq control;
   private GestionConexion conexion;

    public GestionConcepto() {
    }
   
     public GestionConcepto(ControladorConceptoLiq control,Concepto concepto) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.concepto = concepto;
        this.control=control;
    }

    public JTable getTablaConceptos() {
        return tablaConceptos;
    }

    public void setTablaConceptos(JTable tablaConceptos) {
        this.tablaConceptos = tablaConceptos;
    }

  
    public JTextField getTxtCodigo_con() {
        return txtCodigo_con;
    }

    public void setTxtCodigo_con(JTextField txtCodigo_con) {
        this.txtCodigo_con = txtCodigo_con;
    }
    public void limpiar() {
        txtDescripcion.setText(null);
        txtImporte_conc.setText(null);
        tipo_concepto.clearSelection();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo_concepto = new javax.swing.ButtonGroup();
        lblCodigo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        PanelConceptos = new javax.swing.JScrollPane();
        tablaConceptos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCodigo_con = new javax.swing.JTextField();
        txtImporte_conc = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        op_Haber = new javax.swing.JRadioButton();
        op_Deber = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Conceptos de Liquidacion de Sueldo");
        setMaximizedBounds(new java.awt.Rectangle(10, 0, 0, 0));

        lblCodigo.setText("Codigo");

        lblDescripcion.setText("Descripcion");

        lblImporte.setText("Importe");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        PanelConceptos.setToolTipText("");

        tablaConceptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Importe", "Tipo"
            }
        ));
        PanelConceptos.setViewportView(tablaConceptos);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCodigo_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_conActionPerformed(evt);
            }
        });

        txtImporte_conc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporte_concKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Concepto"));

        tipo_concepto.add(op_Haber);
        op_Haber.setText("Haber");

        tipo_concepto.add(op_Deber);
        op_Deber.setText("Deber");
        op_Deber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(op_Haber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op_Deber)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_Haber)
                    .addComponent(op_Deber))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(14, 14, 14)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImporte)
                        .addGap(18, 18, 18)
                        .addComponent(txtImporte_conc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCodigo)
                            .addGap(25, 25, 25)
                            .addComponent(txtCodigo_con))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDescripcion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtImporte_conc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImporte))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addComponent(PanelConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigo_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_conActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo_conActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        concepto.setIdConcepto(Integer.valueOf(txtCodigo_con.getText()));
        concepto.setDescripcion(txtDescripcion.getText());
        concepto.setImporte(Integer.valueOf(txtImporte_conc.getText()));
      //  concepto.setTipo_concepto(jComboBoxTipo.getSelectedItem().toString());
        if (op_Haber.isSelected()){
                concepto.setTipo_concepto(op_Haber.getText());
        } else {
          concepto.setTipo_concepto(op_Deber.getText());
        }
        control.agregarConcepto();
        this.limpiar();
        control.Generarnumeracion();
        control.mostrarConceptos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       control.eliminarFilaConcepto(this);
       control.Generarnumeracion();
       control.mostrarConceptos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       ModConcepto windown = new ModConcepto(conexion,concepto,control);
       windown.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.dispose();    
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtImporte_concKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporte_concKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtImporte_concKeyTyped

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane PanelConceptos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JRadioButton op_Deber;
    private javax.swing.JRadioButton op_Haber;
    public javax.swing.JTable tablaConceptos;
    private javax.swing.ButtonGroup tipo_concepto;
    private javax.swing.JTextField txtCodigo_con;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtImporte_conc;
    // End of variables declaration//GEN-END:variables

}
