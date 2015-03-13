/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Concepto;
import controlador.ControladorConceptoLiq;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author Mariana
 */
public class ModConcepto extends javax.swing.JFrame {

    
    private GestionConexion conexion;
    private Concepto concepto;
    private ControladorConceptoLiq control;
    

    public ModConcepto(GestionConexion conexion, Concepto concepto,ControladorConceptoLiq control) {
        this.conexion = conexion;
        this.concepto = concepto;
        this.control = control;
        initComponents();
        this.setLocationRelativeTo(null);
       control.modificarConcepto(this);
        
    }

     public void limpiar() {
        txtDescripcion_mod.setText(null);
        txtImporte_conc_mod.setText(null);
    }

    public JRadioButton getOp_Deber_mod() {
        return op_Deber_mod;
    }

    public void setOp_Deber_mod(JRadioButton op_Deber_mod) {
        this.op_Deber_mod = op_Deber_mod;
    }

    public JRadioButton getOp_Haber_mod() {
        return op_Haber_mod;
    }

    public void setOp_Haber_mod(JRadioButton op_Haber_mod) {
        this.op_Haber_mod = op_Haber_mod;
    }

    public JTextField getTxtCodigo_con_mod() {
        return txtCodigo_con_mod;
    }

    public void setTxtCodigo_con_mod(JTextField txtCodigo_con_mod) {
        this.txtCodigo_con_mod = txtCodigo_con_mod;
    }

    public JTextField getTxtDescripcion_mod() {
        return txtDescripcion_mod;
    }

    public void setTxtDescripcion_mod(JTextField txtDescripcion_mod) {
        this.txtDescripcion_mod = txtDescripcion_mod;
    }

    public JTextField getTxtImporte_conc_mod() {
        return txtImporte_conc_mod;
    }

    public void setTxtImporte_conc_mod(JTextField txtImporte_conc_mod) {
        this.txtImporte_conc_mod = txtImporte_conc_mod;
    }

    public ButtonGroup getTipoConceptoaMod() {
        return tipoConceptoaMod;
    }

    public void setTipoConceptoaMod(ButtonGroup tipoConceptoaMod) {
        this.tipoConceptoaMod = tipoConceptoaMod;
    }
     
     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoConceptoaMod = new javax.swing.ButtonGroup();
        txtCodigo_con_mod = new javax.swing.JTextField();
        lblCodigo_mod = new javax.swing.JLabel();
        txtImporte_conc_mod = new javax.swing.JTextField();
        lblDescripcion_mod = new javax.swing.JLabel();
        txtDescripcion_mod = new javax.swing.JTextField();
        lblImporte_mod = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        op_Haber_mod = new javax.swing.JRadioButton();
        op_Deber_mod = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Concepto");

        txtCodigo_con_mod.setEditable(false);
        txtCodigo_con_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo_con_modActionPerformed(evt);
            }
        });

        lblCodigo_mod.setText("Codigo");

        lblDescripcion_mod.setText("Descripcion");

        lblImporte_mod.setText("Importe");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Concepto"));

        tipoConceptoaMod.add(op_Haber_mod);
        op_Haber_mod.setText("Haber");

        tipoConceptoaMod.add(op_Deber_mod);
        op_Deber_mod.setText("Deber");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(op_Haber_mod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op_Deber_mod)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_Haber_mod)
                    .addComponent(op_Deber_mod))
                .addContainerGap())
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(txtCodigo_con_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalir)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblImporte_mod)
                            .addGap(18, 18, 18)
                            .addComponent(txtImporte_conc_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCodigo_mod)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDescripcion_mod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDescripcion_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtCodigo_con_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnsalir))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(lblCodigo_mod)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescripcion_mod)
                        .addComponent(txtDescripcion_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtImporte_conc_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblImporte_mod))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigo_con_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo_con_modActionPerformed
        
    }//GEN-LAST:event_txtCodigo_con_modActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     
        concepto.setIdConcepto(Integer.valueOf(txtCodigo_con_mod.getText()));
        concepto.setDescripcion(txtDescripcion_mod.getText());
        concepto.setImporte(Float.valueOf(txtImporte_conc_mod.getText()));
    
        if (op_Haber_mod.isSelected()){
            concepto.setTipo_concepto(op_Haber_mod.getText());
        } else {
            concepto.setTipo_concepto(op_Deber_mod.getText());
        }
        control.updateConcepto(concepto);
        control.mostrarConceptos();
        this.dispose();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo_mod;
    private javax.swing.JLabel lblDescripcion_mod;
    private javax.swing.JLabel lblImporte_mod;
    private javax.swing.JRadioButton op_Deber_mod;
    private javax.swing.JRadioButton op_Haber_mod;
    private javax.swing.ButtonGroup tipoConceptoaMod;
    public javax.swing.JTextField txtCodigo_con_mod;
    private javax.swing.JTextField txtDescripcion_mod;
    private javax.swing.JTextField txtImporte_conc_mod;
    // End of variables declaration//GEN-END:variables
}
