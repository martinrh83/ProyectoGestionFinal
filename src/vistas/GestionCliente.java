/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Cliente;
import controlador.ControladorCliente;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.GestionConexion;

/**
 *
 * @author Mariana
 */
public class GestionCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private ControladorCliente altacli;
    private GestionConexion conn;

    public GestionCliente() {

    }

    public GestionCliente(java.awt.Frame parent, boolean modal, ControladorCliente altacli, Cliente cliente) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        this.altacli = altacli;
    }

    public JTable getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(JTable tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

    public void limpiar() {

        txtnom.setText(null);
        txtap.setText(null);
        txtdni.setText(null);
        txtcuil.setText(null);
        txttelefono.setText(null);
        txt_email.setText(null);

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
        txtnom = new javax.swing.JTextField();
        txtap = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtcuil = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        lblidcliente = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        jComboBox_tipoCliente = new javax.swing.JComboBox();
        txttelefono = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Cliente");
        setResizable(false);

        lblnomyap.setText("Nombre ");

        lbldni.setText("Dni:");

        lblcuil.setText("Cuil:");

        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });

        txtap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapKeyTyped(evt);
            }
        });

        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });

        txtcuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuilActionPerformed(evt);
            }
        });
        txtcuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcuilKeyTyped(evt);
            }
        });

        btnAgregar.setText("Agregar Cliente");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Apellido", "DNI", "CUIL", "Telefono", "Email", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        lblidcliente.setText("ID: ");

        lbltelefono.setText("Teléfono");

        lblemail.setText("Email");

        lbl_tipo.setText("Tipo");

        jComboBox_tipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mayorista", "Minorista", "Cuenta Corriente", " " }));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnomyap)
                                    .addComponent(lblidcliente))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txt_id))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblemail)
                                    .addComponent(lblcuil))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldni)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltelefono)
                                            .addComponent(lbl_tipo))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttelefono)
                                            .addComponent(jComboBox_tipoCliente, 0, 170, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcuil, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblidcliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomyap)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldni)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcuil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcuil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_tipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtnom.getText().trim().isEmpty()
                || txtap.getText().trim().isEmpty()
                || txtdni.getText().trim().isEmpty()
                || txtcuil.getText().trim().isEmpty()
                || txttelefono.getText().trim().isEmpty()
                || txt_email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos Vacios. Intoducir todos los datos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cliente.setIdCliente(Integer.valueOf(txt_id.getText()));
            cliente.setNombre(txtnom.getText());
            cliente.setApellido(txtap.getText());
            cliente.setDni(Integer.valueOf(txtdni.getText()));
            cliente.setCuil(Integer.valueOf(txtcuil.getText()));
            cliente.setTelefono(Integer.valueOf(txttelefono.getText()));
            cliente.setEmail(txt_email.getText());
            cliente.setTipo(jComboBox_tipoCliente.getSelectedItem().toString());
            this.altacli.agregarCliente();
            this.limpiar();
            this.altacli.Generarnumeracion();
            this.altacli.mostrarClientes();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        char car = evt.getKeyChar();
        if (txtdni.getText().length() >= 9) {
            JOptionPane.showMessageDialog(this, "Permitido hasta 9 digitos");
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtdniKeyTyped

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car != 'ñ' && car != 'Ñ') {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE)
                && car != 'ñ' && car != 'Ñ') {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_txtapKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        altacli.eliminarFilaCli(this);
        altacli.Generarnumeracion();
        altacli.mostrarClientes();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtcuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuilActionPerformed

    }//GEN-LAST:event_txtcuilActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ModCliente windown = new ModCliente(conn, cliente, altacli);
        windown.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }

    }//GEN-LAST:event_txttelefonoKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtcuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuilKeyTyped
        char car = evt.getKeyChar();
        if (txtdni.getText().length() >= 10) {
            JOptionPane.showMessageDialog(this, "Permitido hasta 10 digitos");
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtcuilKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox_tipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lblcuil;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblidcliente;
    private javax.swing.JLabel lblnomyap;
    private javax.swing.JLabel lbltelefono;
    public javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_id;
    private javax.swing.JTextField txtap;
    private javax.swing.JTextField txtcuil;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}
