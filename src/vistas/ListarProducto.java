/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.BuscarProducto;
import controlador.ControladorProducto;
import javax.swing.JTable;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class ListarProducto extends javax.swing.JFrame {

    private GestionConexion conexion;
    private BuscarProducto control;


    public ListarProducto(BuscarProducto buscar,GestionConexion c) {
        conexion = c;
        control=buscar;
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFin_LProd = new javax.swing.JButton();
        btnEdit_LProd = new javax.swing.JButton();
        btnDelete_LProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtName_LProd = new javax.swing.JTextField();
        cmbCat_LProd = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de Productos");

        btnFin_LProd.setText("Finalizar");
        btnFin_LProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin_LProdActionPerformed(evt);
            }
        });

        btnEdit_LProd.setText("Modificar");
        btnEdit_LProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_LProdActionPerformed(evt);
            }
        });

        btnDelete_LProd.setText("Eliminar");
        btnDelete_LProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_LProdActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tablaProducto);

        jRadioButton1.setText("Buscar por Nombre");

        jRadioButton3.setText("Buscar por Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        txtName_LProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtName_LProdKeyReleased(evt);
            }
        });

        cmbCat_LProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Limpieza", "Bebida", "Lacteos", "Alimentos", "Golosinas" }));
        cmbCat_LProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnEdit_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnDelete_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnFin_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbCat_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(txtName_LProd))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtName_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCat_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(12, 12, 12))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFin_LProd)
                    .addComponent(btnEdit_LProd)
                    .addComponent(btnDelete_LProd))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFin_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin_LProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFin_LProdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cat = cmbCat_LProd.getSelectedItem().toString();
         control.busquedaCategoria(cat,tablaProducto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtName_LProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName_LProdKeyReleased
        String comodin = txtName_LProd.getText() + "%";
        control.busquedaPredictiva(comodin,tablaProducto);
    }//GEN-LAST:event_txtName_LProdKeyReleased

    private void btnEdit_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_LProdActionPerformed
        
        ModProducto window=new ModProducto(conexion);
        window.setVisible(true);
        control.modificarProd(tablaProducto,window);
    }//GEN-LAST:event_btnEdit_LProdActionPerformed

    private void btnDelete_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_LProdActionPerformed
        control.eliminarProd(tablaProducto);
    }//GEN-LAST:event_btnDelete_LProdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete_LProd;
    private javax.swing.JButton btnEdit_LProd;
    private javax.swing.JButton btnFin_LProd;
    private javax.swing.JComboBox cmbCat_LProd;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtName_LProd;
    // End of variables declaration//GEN-END:variables

    public JTable getTablaProducto() {
        return tablaProducto;
    }

    public void setTablaProducto(JTable tablaProducto) {
        this.tablaProducto = tablaProducto;
    }
    
}
