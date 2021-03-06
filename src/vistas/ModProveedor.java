/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorProveedor;
import modelo.Proveedor;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.GestionConexion;

/**
 *
 * @author Casa
 */
public class ModProveedor extends javax.swing.JFrame {
    private GestionConexion connection;
    private Proveedor proveedor;
    private ControladorProveedor control;
    
    public ModProveedor(ControladorProveedor cont, GestionConexion conn, Proveedor prov) {
        control = cont;
        connection = conn;
        proveedor = prov;
        initComponents();
        this.setLocationRelativeTo(null);
        control.modificarProv(this);
    }
    
    public void limpiar(){
            txt_cuitMProv.setText(null);
            txt_mailMProv.setText(null);
            txt_nombreMProv.setText(null);
            txt_telMProv.setText(null);
    }

    public JComboBox getCombo_rsMProv() {
        return combo_rsMProv;
    }

    public void setCombo_rsMProv(JComboBox combo_rsMProv) {
        this.combo_rsMProv = combo_rsMProv;
    }

    public JTextField getTxt_cuitMProv() {
        return txt_cuitMProv;
    }

    public void setTxt_cuitMProv(JTextField txt_cuitMProv) {
        this.txt_cuitMProv = txt_cuitMProv;
    }

    public JTextField getTxt_mailMProv() {
        return txt_mailMProv;
    }

    public void setTxt_mailMProv(JTextField txt_mailMProv) {
        this.txt_mailMProv = txt_mailMProv;
    }

    public JTextField getTxt_nombreMProv() {
        return txt_nombreMProv;
    }

    public void setTxt_nombreMProv(JTextField txt_nombreMProv) {
        this.txt_nombreMProv = txt_nombreMProv;
    }

    public JTextField getTxt_telMProv() {
        return txt_telMProv;
    }

    public void setTxt_telMProv(JTextField txt_telMProv) {
        this.txt_telMProv = txt_telMProv;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_telMProv = new javax.swing.JTextField();
        txt_cuitMProv = new javax.swing.JTextField();
        txt_mailMProv = new javax.swing.JTextField();
        combo_rsMProv = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idProv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombreMProv = new javax.swing.JTextField();
        btn_confModProv = new javax.swing.JButton();
        btn_cancModProd = new javax.swing.JButton();
        btn_finModProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Proveedor");
        setResizable(false);

        txt_cuitMProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuitMProvKeyTyped(evt);
            }
        });

        combo_rsMProv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S.R.L.", "S.A.", "C.S.", "S.H." }));

        jLabel1.setText("Nombre");

        jLabel4.setText("Razon Social");

        txt_idProv.setEnabled(false);

        jLabel5.setText("Id Proveedor");

        jLabel6.setText("C.U.I.T.");

        jLabel8.setText("Mail");

        jLabel9.setText("Telefono");

        btn_confModProv.setText("Confirmar");
        btn_confModProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confModProvActionPerformed(evt);
            }
        });

        btn_cancModProd.setText("Cancelar");
        btn_cancModProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancModProdActionPerformed(evt);
            }
        });

        btn_finModProd.setText("Finalizar");
        btn_finModProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finModProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_telMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_idProv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(txt_cuitMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_mailMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombreMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_rsMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_confModProv)
                .addGap(45, 45, 45)
                .addComponent(btn_cancModProd)
                .addGap(40, 40, 40)
                .addComponent(btn_finModProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_cuitMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_rsMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_telMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_mailMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confModProv)
                    .addComponent(btn_cancModProd)
                    .addComponent(btn_finModProd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cuitMProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuitMProvKeyTyped
        char car = evt.getKeyChar();
        if (txt_cuitMProv.getText().length() >= 10) {
            JOptionPane.showMessageDialog(this, "Permitido hasta 10 digitos");
            evt.consume();
        }
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(this, "Solo numeros");
            evt.consume();
        }
    }//GEN-LAST:event_txt_cuitMProvKeyTyped

    private void btn_confModProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confModProvActionPerformed
        proveedor.setIdProveedor(Integer.valueOf(txt_idProv.getText()));
        proveedor.setCuitProv(Integer.valueOf(txt_cuitMProv.getText()));
        proveedor.setNombreProv(txt_nombreMProv.getText());
        proveedor.setTelefonoProv(Integer.valueOf(txt_telMProv.getText()));
        proveedor.setRazonSocProv(combo_rsMProv.getSelectedItem().toString());
        proveedor.setEmailProv(txt_mailMProv.getText());
        
        control.updateProv(proveedor);
        control.mostrarProveedores();
        this.dispose();
    }//GEN-LAST:event_btn_confModProvActionPerformed

    private void btn_cancModProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancModProdActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btn_cancModProdActionPerformed

    private void btn_finModProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finModProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_finModProdActionPerformed
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancModProd;
    private javax.swing.JButton btn_confModProv;
    private javax.swing.JButton btn_finModProd;
    private javax.swing.JComboBox combo_rsMProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_cuitMProv;
    public javax.swing.JTextField txt_idProv;
    private javax.swing.JTextField txt_mailMProv;
    private javax.swing.JTextField txt_nombreMProv;
    private javax.swing.JTextField txt_telMProv;
    // End of variables declaration//GEN-END:variables
}
