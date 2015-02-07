/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorProveedor;
import controlador.Proveedor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.GestionConexion;

/**
 *
 * @author Casa
 */
public class ModProveedor extends javax.swing.JFrame {
    private GestionConexion connection;
    private Proveedor proveedor;
    private ControladorProveedor control;
    
    public ModProveedor(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_dirMProv = new javax.swing.JTextField();
        txt_telMProv = new javax.swing.JTextField();
        txt_cuitMProv = new javax.swing.JTextField();
        txt_mailMProv = new javax.swing.JTextField();
        combo_rsMProv = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idProv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombreMProv = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar Proveedor");

        txt_cuitMProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuitMProvKeyTyped(evt);
            }
        });

        combo_rsMProv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S.R.L.", "S.A.", "C.S.", "S.H." }));

        jLabel1.setText("Nombre");

        jLabel4.setText("Razon Social");

        jLabel5.setText("Id Proveedor");

        jLabel6.setText("C.U.I.T.");

        jLabel7.setText("Direccion");

        jLabel8.setText("Mail");

        jLabel9.setText("Telefono");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_dirMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(txt_cuitMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mailMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_rsMProv, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2)
                        .addGap(92, 92, 92))))
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
                    .addComponent(jLabel7)
                    .addComponent(txt_dirMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_mailMProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //control.modificarProv(this);
    }//GEN-LAST:event_jButton1ActionPerformed
        public void limpiar(){
            txt_cuitMProv.setText(null);
            txt_dirMProv.setText(null);
            txt_mailMProv.setText(null);
            txt_nombreMProv.setText(null);
            txt_telMProv.setText(null);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_rsMProv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_cuitMProv;
    private javax.swing.JTextField txt_dirMProv;
    public javax.swing.JTextField txt_idProv;
    private javax.swing.JTextField txt_mailMProv;
    private javax.swing.JTextField txt_nombreMProv;
    private javax.swing.JTextField txt_telMProv;
    // End of variables declaration//GEN-END:variables
}
