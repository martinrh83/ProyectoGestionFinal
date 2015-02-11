/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.BuscarProducto;
import controlador.Producto;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class ModProducto extends javax.swing.JFrame {
    private BuscarProducto control;
    private Producto prod;
    private GestionConexion conexion;
    /**
     * Creates new form AltaProducto
     */
    public ModProducto(GestionConexion conn) {
        conexion=conn;
        initComponents();
        this.setLocationRelativeTo(null);
        prod = new Producto();
    }
    
    public void limpiar(){
        txtCant_MProd.setText(null);
        txtDesc_MProd.setText(null);
        txtFecV_MProd.setText(null);
        txtMarca_MProd.setText(null);
        txtName_MProd.setText(null);
        txtPMay_MProd.setText(null);
        txtPMin_MProd.setText(null);
    }

    public JComboBox getCmbCatMProd() {
        return cmbCatMProd;
    }

    public void setCmbCatMProd(JComboBox cmbCatMProd) {
        this.cmbCatMProd = cmbCatMProd;
    }

    public JTextField getTxtCant_MProd() {
        return txtCant_MProd;
    }

    public void setTxtCant_MProd(JTextField txtCant_MProd) {
        this.txtCant_MProd = txtCant_MProd;
    }

    public JTextField getTxtCod_MProd() {
        return txtCod_MProd;
    }

    public void setTxtCod_MProd(JTextField txtCod_MProd) {
        this.txtCod_MProd = txtCod_MProd;
    }

    public JTextField getTxtDesc_MProd() {
        return txtDesc_MProd;
    }

    public void setTxtDesc_MProd(JTextField txtDesc_MProd) {
        this.txtDesc_MProd = txtDesc_MProd;
    }

    public JTextField getTxtFecV_MProd() {
        return txtFecV_MProd;
    }

    public void setTxtFecV_MProd(JTextField txtFecV_MProd) {
        this.txtFecV_MProd = txtFecV_MProd;
    }

    public JTextField getTxtMarca_MProd() {
        return txtMarca_MProd;
    }

    public void setTxtMarca_MProd(JTextField txtMarca_MProd) {
        this.txtMarca_MProd = txtMarca_MProd;
    }

    public JTextField getTxtName_MProd() {
        return txtName_MProd;
    }

    public void setTxtName_MProd(JTextField txtName_MProd) {
        this.txtName_MProd = txtName_MProd;
    }

    public JTextField getTxtPMay_MProd() {
        return txtPMay_MProd;
    }

    public void setTxtPMay_MProd(JTextField txtPMay_MProd) {
        this.txtPMay_MProd = txtPMay_MProd;
    }

    public JTextField getTxtPMin_MProd() {
        return txtPMin_MProd;
    }

    public void setTxtPMin_MProd(JTextField txtPMin_MProd) {
        this.txtPMin_MProd = txtPMin_MProd;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCod_MProd = new javax.swing.JTextField();
        btnMod_MProd = new javax.swing.JButton();
        btnCanc_MProd = new javax.swing.JButton();
        btnFin_MProd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtName_MProd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDesc_MProd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFecV_MProd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMarca_MProd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPMay_MProd = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCant_MProd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbCatMProd = new javax.swing.JComboBox();
        txtPMin_MProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Producto");

        jLabel1.setText("Ingrese Codigo");

        btnMod_MProd.setText("Modificar");
        btnMod_MProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMod_MProdActionPerformed(evt);
            }
        });

        btnCanc_MProd.setText("Cancelar");

        btnFin_MProd.setText("Finalizar");
        btnFin_MProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin_MProdActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel11.setText("Descripcion");

        jLabel12.setText("Fecha Vto");

        jLabel13.setText("Marca");

        jLabel14.setText("Pcio Minorista");

        jLabel15.setText("Pcio Mayorista");

        jLabel16.setText("Cantidad");

        txtCant_MProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCant_MProdActionPerformed(evt);
            }
        });

        jLabel17.setText("Categoria");

        cmbCatMProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Limpieza", "Bebida", "Lacteos", "Golosinas Alimentos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMod_MProd)
                                .addGap(62, 62, 62)
                                .addComponent(btnCanc_MProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFin_MProd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDesc_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCant_MProd, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(txtFecV_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPMin_MProd))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel17))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtPMay_MProd)
                                                    .addComponent(cmbCatMProd, 0, 1, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                                .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtCod_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtName_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDesc_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtFecV_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtPMin_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCant_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtPMay_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cmbCatMProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMod_MProd)
                    .addComponent(btnCanc_MProd)
                    .addComponent(btnFin_MProd))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCant_MProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCant_MProdActionPerformed
        this.limpiar();
    }//GEN-LAST:event_txtCant_MProdActionPerformed

    private void btnMod_MProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMod_MProdActionPerformed
        try {
            prod.setCodigoProd(Integer.valueOf(txtCod_MProd.getText()));
            prod.setNombreProd(txtName_MProd.getText());
            prod.setDescripcionProd(txtDesc_MProd.getText());
            prod.setFechaVenc(txtFecV_MProd.getText());
            prod.setMarca(txtMarca_MProd.getText());
            prod.setCantProd(Integer.valueOf(txtCant_MProd.getText()));
            prod.setCatProd(cmbCatMProd.getSelectedItem().toString());
            prod.setPrecMay(Float.valueOf(txtPMay_MProd.getText()));
            prod.setPrecMin(Float.valueOf(txtPMin_MProd.getText()));
            
            //control.updateProv(prod);
            String sql = "UPDATE producto SET "+
                    "idProducto = " + prod.getCodigoProd() + ", " +
                     "nombre = '" + prod.getNombreProd() + "', " +
                    "descripcion = '" + prod.getDescripcionProd() + "', " +
                    "fechaVenc = '" + prod.getFechaVenc() + "', " +
                    "cantidad = " + prod.getCantProd() + ", " +
                    "categoria = '" + prod.getCatProd() + "', " +
                    "pcioMin = " + prod.getPrecMin() + ", " +
                    "pcioMay = " + prod.getPrecMay() + ", " +
                    "marca = '" + prod.getMarca() + "' " +
                    "WHERE idProducto = " + prod.getCodigoProd() +";";
            
            Statement st = conexion.getStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
        
    }//GEN-LAST:event_btnMod_MProdActionPerformed

    private void btnFin_MProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin_MProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFin_MProdActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanc_MProd;
    private javax.swing.JButton btnFin_MProd;
    private javax.swing.JButton btnMod_MProd;
    private javax.swing.JComboBox cmbCatMProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextField txtCant_MProd;
    private javax.swing.JTextField txtCod_MProd;
    private javax.swing.JTextField txtDesc_MProd;
    private javax.swing.JTextField txtFecV_MProd;
    private javax.swing.JTextField txtMarca_MProd;
    private javax.swing.JTextField txtName_MProd;
    private javax.swing.JTextField txtPMay_MProd;
    private javax.swing.JTextField txtPMin_MProd;
    // End of variables declaration//GEN-END:variables
}
