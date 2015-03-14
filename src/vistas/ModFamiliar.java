/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.toedter.calendar.JDateChooser;
import controlador.ControladorGrupoFamiliar;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Familiar;

/**
 *
 * @author Mariana
 */
public class ModFamiliar extends javax.swing.JFrame {

    private Familiar familia;
    private ControladorGrupoFamiliar controlfam;
    /**
     * Creates new form GestionGrupoFamiliar
     */
    public ModFamiliar(Familiar flia, ControladorGrupoFamiliar conn) {
        familia = flia;
        controlfam = conn;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JComboBox getCmb_Discap_mod() {
        return cmb_Discap_mod;
    }

    public void setCmb_Discap_mod(JComboBox cmb_Discap_mod) {
        this.cmb_Discap_mod = cmb_Discap_mod;
    }

    public JComboBox getCmb_escolaridad_mod() {
        return cmb_escolaridad_mod;
    }

    public void setCmb_escolaridad_mod(JComboBox cmb_escolaridad_mod) {
        this.cmb_escolaridad_mod = cmb_escolaridad_mod;
    }

    public JComboBox getCmb_estCivil_mod() {
        return cmb_estCivil_mod;
    }

    public void setCmb_estCivil_mod(JComboBox cmb_estCivil_mod) {
        this.cmb_estCivil_mod = cmb_estCivil_mod;
    }

    public JComboBox getCmb_parentesco_mod() {
        return cmb_parentesco_mod;
    }

    public void setCmb_parentesco_mod(JComboBox cmb_parentesco_mod) {
        this.cmb_parentesco_mod = cmb_parentesco_mod;
    }

    public JTextField getTxt_dni_mod() {
        return txt_dni_mod;
    }

    public void setTxt_dni_mod(JTextField txt_dni_mod) {
        this.txt_dni_mod = txt_dni_mod;
    }

    public JDateChooser getTxt_fec_mod() {
        return txt_fec_mod;
    }

    public void setTxt_fec_mod(JDateChooser txt_fec_mod) {
        this.txt_fec_mod = txt_fec_mod;
    }

    public JTextField getTxt_idFam_mod() {
        return txt_idFam_mod;
    }

    public void setTxt_idFam_mod(JTextField txt_idFam_mod) {
        this.txt_idFam_mod = txt_idFam_mod;
    }

    public JTextField getTxt_nacion_mod() {
        return txt_nacion_mod;
    }

    public void setTxt_nacion_mod(JTextField txt_nacion_mod) {
        this.txt_nacion_mod = txt_nacion_mod;
    }

    public JTextField getTxt_nomF_mod() {
        return txt_nomF_mod;
    }

    public void setTxt_nomF_mod(JTextField txt_nomF_mod) {
        this.txt_nomF_mod = txt_nomF_mod;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cmb_parentesco_mod = new javax.swing.JComboBox();
        cmb_Discap_mod = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_dni_mod = new javax.swing.JTextField();
        txt_idFam_mod = new javax.swing.JTextField();
        txt_nomF_mod = new javax.swing.JTextField();
        txt_nacion_mod = new javax.swing.JTextField();
        txt_fec_mod = new com.toedter.calendar.JDateChooser();
        cmb_escolaridad_mod = new javax.swing.JComboBox();
        cmb_estCivil_mod = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        Aceptar_mod = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grupo Familiar");
        setBackground(new java.awt.Color(16, 165, 117));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Familiar"));

        jLabel10.setText("Escolaridad:");

        cmb_parentesco_mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "conyuge", "hijo", " " }));

        cmb_Discap_mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));

        jLabel9.setText("Discapacitado:");

        jLabel4.setText("DNI:");

        jLabel3.setText("Apellido y Nombre:");

        jLabel2.setText("ID Familiar:");

        jLabel8.setText("Estado Civil:");

        jLabel7.setText("Nacionalidad:");

        jLabel6.setText("Fecha Nacimiento:");

        jLabel5.setText("Parentesco:");

        txt_idFam_mod.setEnabled(false);

        cmb_escolaridad_mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primaria", "Secuandaria", "Universitaria", "Ninguna" }));

        cmb_estCivil_mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nomF_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dni_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idFam_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_parentesco_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_escolaridad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_estCivil_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Discap_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nacion_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txt_fec_mod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idFam_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nomF_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(cmb_escolaridad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_parentesco_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fec_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nacion_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cmb_Discap_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_estCivil_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Aceptar_mod.setText("Aceptar");
        Aceptar_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar_modActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Aceptar_mod)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar_mod)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clean(){
        txt_idFam_mod.setText(null);
        txt_dni_mod.setText(null);
        txt_fec_mod.setDateFormatString(null);
        txt_nacion_mod.setText(null);
        txt_nomF_mod.setText(null);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Aceptar_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar_modActionPerformed
        
    }//GEN-LAST:event_Aceptar_modActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar_mod;
    private javax.swing.JComboBox cmb_Discap_mod;
    private javax.swing.JComboBox cmb_escolaridad_mod;
    private javax.swing.JComboBox cmb_estCivil_mod;
    private javax.swing.JComboBox cmb_parentesco_mod;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_dni_mod;
    private com.toedter.calendar.JDateChooser txt_fec_mod;
    private javax.swing.JTextField txt_idFam_mod;
    private javax.swing.JTextField txt_nacion_mod;
    private javax.swing.JTextField txt_nomF_mod;
    // End of variables declaration//GEN-END:variables
}
