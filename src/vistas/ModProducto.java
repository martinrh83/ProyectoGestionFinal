/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.BuscarProducto;
import modelo.Producto;
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
        txtPMay.setText(null);
        txtPMin.setText(null);
        txtPCpra.setText(null);
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

    public JTextField getTxtPCpra() {
        return txtPCpra;
    }

    public void setTxtPCpra(JTextField txtPCpra) {
        this.txtPCpra = txtPCpra;
    }

    public JTextField getTxtPMay() {
        return txtPMay;
    }

    public void setTxtPMay(JTextField txtPMay) {
        this.txtPMay = txtPMay;
    }

    public JTextField getTxtPMin() {
        return txtPMin;
    }

    public void setTxtPMin(JTextField txtPMin) {
        this.txtPMin = txtPMin;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPMin_Prod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPMay_Prod = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPcioCpra = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();
        txtCant_MProd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbCatMProd = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPMay = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPCpra = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Precios"));

        jLabel5.setText("Minorista");

        jLabel6.setText("Mayorista");

        jLabel18.setText("Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPMin_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPMay_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPcioCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPMin_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPMay_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtPcioCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Producto");

        jLabel1.setText("Codigo");

        txtCod_MProd.setEnabled(false);

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

        jLabel16.setText("Cantidad");

        txtCant_MProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCant_MProdActionPerformed(evt);
            }
        });

        jLabel17.setText("Categoria");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Precios"));

        jLabel7.setText("Minorista");

        jLabel8.setText("Mayorista");

        jLabel19.setText("Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPMin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPMay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtPCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtCod_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnMod_MProd)
                                .addGap(62, 62, 62)
                                .addComponent(btnCanc_MProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btnFin_MProd)))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(txtCant_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtFecV_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel17)
                                        .addGap(36, 36, 36)
                                        .addComponent(cmbCatMProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel13)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtName_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtName_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDesc_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFecV_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCant_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmbCatMProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
       
        /* try {
            prod.setCodigoProd(Integer.valueOf(txtCod_MProd.getText()));
            prod.setNombreProd(txtName_MProd.getText());
            prod.setDescripcionProd(txtDesc_MProd.getText());
            prod.setFechaVenc(txtFecV_MProd.getText());
            prod.setMarca(txtMarca_MProd.getText());
            prod.setCantProd(Integer.valueOf(txtCant_MProd.getText()));
            //prod.setCatProd(cmbCatMProd.getSelectedItem().toString());
            prod.setPrecMay(Float.valueOf(txtPMay.getText()));
            prod.setPrecMin(Float.valueOf(txtPMin.getText()));
            prod.setPcioCpra(Float.valueOf(txtPCpra.getText()));
            
            //control.updateProv(prod);
            String sql = "UPDATE producto SET "+
                    "idProducto = " + prod.getCodigoProd() + ", " +
                     "nombre = '" + prod.getNombreProd() + "', " +
                    "descripcion = '" + prod.getDescripcionProd() + "', " +
                    "fechaVenc = '" + prod.getFechaVenc() + "', " +
                    "cantidad = " + prod.getCantProd() + ", " +
                    "pcioCpra = " + prod.getPcioCpra() + "," +
                    "pcioMin = " + prod.getPrecMin() + ", " +
                    "pcioMay = " + prod.getPrecMay() + ", " +
                    "marca = '" + prod.getMarca() + "', " +
                    "categoria_idCategoria = " + prod.getIdCategoria() + 
                    "WHERE idProducto = " + prod.getCodigoProd() +";";
            
            Statement st = conexion.getStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ModProducto.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //this.dispose();
        
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCant_MProd;
    private javax.swing.JTextField txtCod_MProd;
    private javax.swing.JTextField txtDesc_MProd;
    private javax.swing.JTextField txtFecV_MProd;
    private javax.swing.JTextField txtMarca_MProd;
    private javax.swing.JTextField txtName_MProd;
    private javax.swing.JTextField txtPCpra;
    private javax.swing.JTextField txtPMay;
    private javax.swing.JTextField txtPMay_Prod;
    private javax.swing.JTextField txtPMin;
    private javax.swing.JTextField txtPMin_Prod;
    private javax.swing.JTextField txtPcioCpra;
    // End of variables declaration//GEN-END:variables
}
