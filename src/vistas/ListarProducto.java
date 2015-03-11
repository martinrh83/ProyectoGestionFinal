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

    public ListarProducto(BuscarProducto buscar, GestionConexion c) {
        conexion = c;
        control = buscar;
        initComponents();
        this.setLocationRelativeTo(null);
        txtName_LProd.setEnabled(false);
        cmbCat_LProd.setEnabled(false);
        btnBuscar.setEnabled(false);
        control.llenarCB(cmbCat_LProd);
    }

    public void limpiar() {
        txtName_LProd.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.ButtonGroup();
        btnFin_LProd = new javax.swing.JButton();
        btnEdit_LProd = new javax.swing.JButton();
        btnDelete_LProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rb_BusCat = new javax.swing.JRadioButton();
        rb_BusNom = new javax.swing.JRadioButton();
        txtName_LProd = new javax.swing.JTextField();
        cmbCat_LProd = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliga tipo de busqueda"));

        busqueda.add(rb_BusCat);
        rb_BusCat.setText("Buscar por Categoria");
        rb_BusCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_BusCatActionPerformed(evt);
            }
        });

        busqueda.add(rb_BusNom);
        rb_BusNom.setText("Buscar por Nombre");
        rb_BusNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_BusNomActionPerformed(evt);
            }
        });

        txtName_LProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtName_LProdKeyReleased(evt);
            }
        });

        cmbCat_LProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_BusCat)
                    .addComponent(rb_BusNom))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbCat_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addComponent(txtName_LProd))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_BusNom)
                    .addComponent(txtName_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_BusCat)
                    .addComponent(cmbCat_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnEdit_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnDelete_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnFin_LProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFin_LProd)
                    .addComponent(btnEdit_LProd)
                    .addComponent(btnDelete_LProd))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFin_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin_LProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFin_LProdActionPerformed

    private void btnEdit_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_LProdActionPerformed
        ModProducto window = new ModProducto(conexion);
        window.setVisible(true);
        control.modificarProd(tablaProducto, window);
    }//GEN-LAST:event_btnEdit_LProdActionPerformed

    private void btnDelete_LProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_LProdActionPerformed
        control.eliminarProd(tablaProducto);
    }//GEN-LAST:event_btnDelete_LProdActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cat = cmbCat_LProd.getSelectedItem().toString();
        control.busquedaCategoria(cat, tablaProducto);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtName_LProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName_LProdKeyReleased
        String comodin = txtName_LProd.getText() + "%";
        control.busquedaPredictiva(comodin, tablaProducto);
    }//GEN-LAST:event_txtName_LProdKeyReleased

    private void rb_BusNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_BusNomActionPerformed
        if (rb_BusNom.isSelected()) {
            this.limpiar();
            txtName_LProd.setEnabled(true);
            cmbCat_LProd.setEnabled(false);
            btnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_rb_BusNomActionPerformed

    private void rb_BusCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_BusCatActionPerformed
        if (rb_BusCat.isSelected()) {
            
            this.limpiar();
            cmbCat_LProd.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtName_LProd.setEnabled(false);
        }
    }//GEN-LAST:event_rb_BusCatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDelete_LProd;
    private javax.swing.JButton btnEdit_LProd;
    private javax.swing.JButton btnFin_LProd;
    private javax.swing.ButtonGroup busqueda;
    private javax.swing.JComboBox cmbCat_LProd;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_BusCat;
    private javax.swing.JRadioButton rb_BusNom;
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
