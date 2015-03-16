/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.toedter.calendar.JDateChooser;
import controlador.BuscarProducto;
import java.awt.event.KeyEvent;
import modelo.Producto;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class ModProducto extends javax.swing.JFrame {
    private BuscarProducto control;
    //private Producto prod;
    private GestionConexion conexion;
    /**
     * Creates new form AltaProducto
     */
    public ModProducto(BuscarProducto c, GestionConexion conn) {
        conexion = conn;
        control=c;
        initComponents();
        this.setLocationRelativeTo(null);
 
    }
    
    public void limpiar(){
        txtCant_MProd.setText(null);
        txtDesc_MProd.setText(null);
        txtMarca_MProd.setText(null);
        txtName_MProd.setText(null);
        txtPMay.setText(null);
        txtPMin.setText(null);
        txtPCpra.setText(null);
    }

    public JDateChooser getFechaV() {
        return fechaV;
    }

    public void setFechaV(JDateChooser fechaV) {
        this.fechaV = fechaV;
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
        fechaV = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Producto");

        jLabel1.setText("Codigo");

        txtCod_MProd.setEnabled(false);

        btnMod_MProd.setText("Aceptar");
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

        txtName_MProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtName_MProdKeyTyped(evt);
            }
        });

        jLabel11.setText("Descripcion");

        jLabel12.setText("Fecha Vto");

        jLabel13.setText("Marca");

        jLabel16.setText("Cantidad");

        txtCant_MProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCant_MProdActionPerformed(evt);
            }
        });
        txtCant_MProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant_MProdKeyTyped(evt);
            }
        });

        jLabel17.setText("Categoria");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Precios"));

        jLabel7.setText("Minorista");

        txtPMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMinKeyTyped(evt);
            }
        });

        jLabel8.setText("Mayorista");

        txtPMay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMayKeyTyped(evt);
            }
        });

        jLabel19.setText("Compra");

        txtPCpra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPCpraKeyTyped(evt);
            }
        });

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPMin)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtPCpra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
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
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtCod_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnMod_MProd)
                                .addGap(62, 62, 62)
                                .addComponent(btnCanc_MProd)))
                        .addGap(78, 142, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName_MProd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesc_MProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtCant_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaV, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel17)
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnFin_MProd)
                                            .addComponent(cmbCatMProd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 27, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDesc_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtMarca_MProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(fechaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
        control.actualizarProd(this);
        this.dispose();
    }//GEN-LAST:event_btnMod_MProdActionPerformed

    private void btnFin_MProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin_MProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFin_MProdActionPerformed

    private void txtName_MProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName_MProdKeyTyped
       char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car !='ñ' && car !='Ñ') {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_txtName_MProdKeyTyped

    private void txtPMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMinKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car != '.' && ',' != car) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtPMinKeyTyped

    private void txtPMayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMayKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car != '.' && ',' != car) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtPMayKeyTyped

    private void txtPCpraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPCpraKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car != '.' && ',' != car) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtPCpraKeyTyped

    private void txtCant_MProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant_MProdKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtCant_MProdKeyTyped

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanc_MProd;
    private javax.swing.JButton btnFin_MProd;
    private javax.swing.JButton btnMod_MProd;
    private javax.swing.JComboBox cmbCatMProd;
    private com.toedter.calendar.JDateChooser fechaV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCant_MProd;
    private javax.swing.JTextField txtCod_MProd;
    private javax.swing.JTextField txtDesc_MProd;
    private javax.swing.JTextField txtMarca_MProd;
    private javax.swing.JTextField txtName_MProd;
    private javax.swing.JTextField txtPCpra;
    private javax.swing.JTextField txtPMay;
    private javax.swing.JTextField txtPMin;
    // End of variables declaration//GEN-END:variables
}
