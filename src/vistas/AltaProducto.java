/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorProducto;
import controlador.Producto;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class AltaProducto extends javax.swing.JFrame {

    private Producto producto;
    private ControladorProducto alta;
    private GestionConexion conexion;
    /**
     * Creates new form AltaProducto
     */
    public AltaProducto(ControladorProducto cAlta, Producto produ,GestionConexion conn) {

        initComponents();
        this.setLocationRelativeTo(null);
        conexion=conn;
        producto = produ;
        alta = cAlta;
        //alta.generarNumeracion();
    }

    public void limpiar(){
        txtCant_Prod.setText(null);
        txtCod_Prod.setText(null);
        txtDesc_Prod.setText(null);
        txtMarca_Prod.setText(null);
        txtName_Prod.setText(null);
        txtPMay_Prod.setText(null);
        txtPMin_Prod.setText(null);
        jDateChooser2.setDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName_Prod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDesc_Prod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPMin_Prod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPMay_Prod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCant_Prod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca_Prod = new javax.swing.JTextField();
        btnAgregar_Prod = new javax.swing.JButton();
        btnCancelar_Prod = new javax.swing.JButton();
        btnFin_Prod = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        combo_cat = new javax.swing.JComboBox();
        txtCod_Prod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Producto");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        txtName_Prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtName_ProdKeyTyped(evt);
            }
        });

        jLabel3.setText("Descripcion");

        jLabel4.setText("Fecha Vto");

        jLabel5.setText("Pcio Minorista");

        jLabel6.setText("Pcio Mayorista");

        jLabel7.setText("Cantidad");

        txtCant_Prod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCant_ProdKeyTyped(evt);
            }
        });

        jLabel8.setText("Categoria");

        jLabel9.setText("Marca");

        btnAgregar_Prod.setText("Agregar");
        btnAgregar_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_ProdActionPerformed(evt);
            }
        });

        btnCancelar_Prod.setText("Cancelar");
        btnCancelar_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_ProdActionPerformed(evt);
            }
        });

        btnFin_Prod.setText("Finalizar");
        btnFin_Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin_ProdActionPerformed(evt);
            }
        });

        combo_cat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Limpieza", "Bebidas", "Lacteos", "Golosinas", "Alimentos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesc_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(17, 17, 17)
                                        .addComponent(txtPMin_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCant_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(93, 93, 93))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMarca_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(combo_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPMay_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAgregar_Prod)
                        .addGap(62, 62, 62)
                        .addComponent(btnCancelar_Prod)
                        .addGap(52, 52, 52)
                        .addComponent(btnFin_Prod)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtMarca_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDesc_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPMin_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(txtPMay_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtCant_Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar_Prod)
                    .addComponent(btnCancelar_Prod)
                    .addComponent(btnFin_Prod))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_ProdActionPerformed
        // Producto prod = new Producto();
        producto.setCodigoProd(Integer.valueOf(txtCod_Prod.getText()));
        producto.setNombreProd(txtName_Prod.getText());
        producto.setDescripcionProd(txtDesc_Prod.getText());
        producto.setCantProd(Integer.valueOf(txtCant_Prod.getText()));
        producto.setMarca(txtMarca_Prod.getText());
        producto.setPrecMin(Float.valueOf(txtPMin_Prod.getText()));
        producto.setPrecMay(Float.valueOf(txtPMay_Prod.getText()));
        producto.setCatProd(combo_cat.getSelectedItem().toString());
        Date fechaVenc = jDateChooser2.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        producto.setFechaVenc(formato.format(fechaVenc));
        this.alta.agregarProducto();

        this.dispose();
    }//GEN-LAST:event_btnAgregar_ProdActionPerformed

    private void txtCant_ProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCant_ProdKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números");
            evt.consume();
        }
    }//GEN-LAST:event_txtCant_ProdKeyTyped

    private void txtName_ProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName_ProdKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && (car != (char) KeyEvent.VK_SPACE) && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            evt.consume();
        }
    }//GEN-LAST:event_txtName_ProdKeyTyped

    private void btnCancelar_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_ProdActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnCancelar_ProdActionPerformed

    private void btnFin_ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin_ProdActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFin_ProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_Prod;
    private javax.swing.JButton btnCancelar_Prod;
    private javax.swing.JButton btnFin_Prod;
    private javax.swing.JComboBox combo_cat;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCant_Prod;
    public javax.swing.JTextField txtCod_Prod;
    private javax.swing.JTextField txtDesc_Prod;
    private javax.swing.JTextField txtMarca_Prod;
    private javax.swing.JTextField txtName_Prod;
    private javax.swing.JTextField txtPMay_Prod;
    private javax.swing.JTextField txtPMin_Prod;
    // End of variables declaration//GEN-END:variables
}
