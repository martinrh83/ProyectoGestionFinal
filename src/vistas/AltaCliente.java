/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.Cliente;
import controlador.ControladorAlta;
import controlador.ControladorCliente;

/**
 *
 * @author Mariana
 */
public class AltaCliente extends javax.swing.JFrame {

    
   private Cliente cliente;
   private ControladorCliente altacli;

    public AltaCliente() {
        
    }
   
   public AltaCliente(java.awt.Frame parent, boolean modal,ControladorCliente altacli,Cliente cliente) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        this.altacli = altacli;
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnomyap = new javax.swing.JLabel();
        lbldni = new javax.swing.JLabel();
        lblcuil = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtap = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtcuil = new javax.swing.JTextField();
        txtdir = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnomyap.setText("Nombre y Apellido ");

        lbldni.setText("Dni");

        lblcuil.setText("Cuil");

        lbldir.setText("Dirección");

        txtnom.setText(" ");

        txtap.setText(" ");

        txtdni.setText(" ");

        txtcuil.setText(" ");

        txtdir.setText(" ");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbldir)
                                .addGap(18, 18, 18)
                                .addComponent(txtdir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcuil)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcuil))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbldni)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdni))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblnomyap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAgregar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomyap)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldni)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcuil)
                    .addComponent(txtcuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldir)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        cliente.setNombre(txtnom.getText());
        cliente.setApellido(txtap.getText());
        cliente.setDni(Integer.valueOf(txtdni.getText()));
        cliente.setCuil(Integer.valueOf(txtcuil.getText()));
        cliente.setDireccion(txtdir.getText());
        
        this.altacli.agregarCliente();
        this.dispose();
                
    }//GEN-LAST:event_btnAgregarActionPerformed

    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel lblcuil;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblnomyap;
    private javax.swing.JTextField txtap;
    private javax.swing.JTextField txtcuil;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}