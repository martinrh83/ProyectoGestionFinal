/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Compra;
import controlador.ControladorCompra;
import controlador.ControladorRFactura;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author Casa
 */
public class NuevaCompra extends javax.swing.JFrame {

    private GestionConexion conexion;
    private ControladorCompra control;
    private Compra compra;
    private ControladorRFactura jasper;
    
           
    public NuevaCompra(ControladorCompra cont, GestionConexion conn, Compra cpra) {
        conexion = conn;
        control = cont;
        compra = cpra;
        initComponents();
        this.setLocationRelativeTo(null);
        control.GenerarNumeracion(txt_NumCpra);
        control.obtenerFecha(txt_FecCpra);
        control.setearUsuario(label_id);
        
       //control.llenarCB();
        control.llenarCB(cmb_ProvNvaCpra);

    }
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCpra = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_TotCpra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_NumCpra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_FecCpra = new javax.swing.JTextField();
        btn_DeleteLCpra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        btnBusProdLCpra = new javax.swing.JButton();
        label_id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_ConfComp = new javax.swing.JButton();
        btn_Comprobante = new javax.swing.JButton();
        btn_SalirComp = new javax.swing.JButton();
        cmb_ProvNvaCpra = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva Compra");

        jLabel3.setFont(new java.awt.Font("TSalvacion", 2, 18)); // NOI18N
        jLabel3.setText("AUTO SERVICIO \"RODRIGUEZ\"");

        tbCpra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbCpra);

        jLabel9.setText("Total");

        jLabel10.setText("Nº de Compra");

        jLabel12.setText("Fecha y Hora");

        jLabel13.setText("Usuario:");

        btn_DeleteLCpra.setText("Eliminar");
        btn_DeleteLCpra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteLCpraActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Cod Prod.");

        jLabel6.setText("Cantidad");

        btnBusProdLCpra.setText("OK");
        btnBusProdLCpra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProdLCpraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnBusProdLCpra)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusProdLCpra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_ConfComp.setText("Confirmar Compra");
        btn_ConfComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ConfCompMousePressed(evt);
            }
        });

        btn_Comprobante.setText("Comprobante");
        btn_Comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprobanteActionPerformed(evt);
            }
        });

        btn_SalirComp.setText("Salir");
        btn_SalirComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ConfComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SalirComp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ConfComp)
                    .addComponent(btn_Comprobante)
                    .addComponent(btn_SalirComp))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_NumCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_FecCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cmb_ProvNvaCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_DeleteLCpra)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_TotCpra, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_NumCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_FecCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_ProvNvaCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(label_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_DeleteLCpra)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_TotCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxt_TotCpra() {
        return txt_TotCpra;
    }

    public void setTxt_TotCpra(JTextField txt_TotCpra) {
        this.txt_TotCpra = txt_TotCpra;
    }

  

    public JTable getTbCpra() {
        return tbCpra;
    }

    public void setTbCpra(JTable tbCpra) {
        this.tbCpra = tbCpra;
    }

    public JComboBox getCmb_ProvNvaCpra() {
        return cmb_ProvNvaCpra;
    }

    public void setCmb_ProvNvaCpra(JComboBox cmb_ProvNvaCpra) {
        this.cmb_ProvNvaCpra = cmb_ProvNvaCpra;
    }

    private void btn_DeleteLCpraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteLCpraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DeleteLCpraActionPerformed

    private void btn_SalirCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirCompActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_SalirCompActionPerformed

    private void btnBusProdLCpraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProdLCpraActionPerformed
        int codigo = Integer.valueOf(txtCodProd.getText());
        String cant = txtCant.getText();
        control.aumentar(codigo, tbCpra, cant);
        control.calcular(tbCpra);
    }//GEN-LAST:event_btnBusProdLCpraActionPerformed

    private void btn_ComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprobanteActionPerformed
       String idComp=txt_NumCpra.getText();
         jasper=new ControladorRFactura(conexion);
       jasper.ejecutarReporteCompra(idComp);
    }//GEN-LAST:event_btn_ComprobanteActionPerformed

    private void btn_ConfCompMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ConfCompMousePressed
        compra.setIdCompra(Integer.valueOf(txt_NumCpra.getText()));
        compra.setFecCompra(txt_FecCpra.getText());
        compra.setImpTotal(Float.valueOf(txt_TotCpra.getText()));
        compra.setUsuario_idUsuario(Integer.valueOf(label_id.getText()));
        String datos=cmb_ProvNvaCpra.getSelectedItem().toString();        
        String[] parts = datos.split(":"); 
        String part1 = parts[0];
        compra.setProveedor_idProveedor(Integer.valueOf(part1));
        
        control.aumentarStock(tbCpra);
        control.agregarLCompra(tbCpra, txt_NumCpra);
        control.guardarCompra();
        
        btn_ConfComp.setEnabled(false);
    }//GEN-LAST:event_btn_ConfCompMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusProdLCpra;
    private javax.swing.JButton btn_Comprobante;
    private javax.swing.JButton btn_ConfComp;
    private javax.swing.JButton btn_DeleteLCpra;
    private javax.swing.JButton btn_SalirComp;
    private javax.swing.JComboBox cmb_ProvNvaCpra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    private javax.swing.JTable tbCpra;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txt_FecCpra;
    private javax.swing.JTextField txt_NumCpra;
    private javax.swing.JTextField txt_TotCpra;
    // End of variables declaration//GEN-END:variables
}
