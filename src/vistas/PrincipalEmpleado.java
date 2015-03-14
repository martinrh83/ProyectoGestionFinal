/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.BuscarProducto;
import controlador.ControladorProducto;
import controlador.ControladorUsuario;
import controlador.ControladorCliente;
import controlador.ControladorCompra;
import controlador.ControladorProveedor;
import controlador.ControladorVenta;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class PrincipalEmpleado extends javax.swing.JFrame {

    private GestionConexion conexion;
    
    public PrincipalEmpleado(GestionConexion c) {
        conexion=c;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        laber_usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProducto = new javax.swing.JMenu();
        menuItAltaProd = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuItNvaVenta = new javax.swing.JMenuItem();
        menuItListVenta = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuItNvaCpra = new javax.swing.JMenuItem();
        menuItListMCpra = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuIGestionCli = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        changePass = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jMenuItem20.setText("jMenuItem20");

        jMenuItem24.setText("jMenuItem24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        laber_usuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        menuProducto.setText("Producto");
        menuProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        menuItAltaProd.setLabel("Alta");
        menuItAltaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItAltaProdActionPerformed(evt);
            }
        });
        menuProducto.add(menuItAltaProd);

        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuProducto.add(jMenuItem1);

        jMenuBar1.add(menuProducto);

        menuVenta.setText("Venta");
        menuVenta.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        menuItNvaVenta.setText("Nueva");
        menuItNvaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItNvaVentaActionPerformed(evt);
            }
        });
        menuVenta.add(menuItNvaVenta);

        menuItListVenta.setText("Listado");
        menuVenta.add(menuItListVenta);

        jMenuBar1.add(menuVenta);

        menuCompra.setText("Compra");
        menuCompra.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        menuItNvaCpra.setText("Nueva");
        menuItNvaCpra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItNvaCpraActionPerformed(evt);
            }
        });
        menuCompra.add(menuItNvaCpra);

        menuItListMCpra.setText("Listado");
        menuCompra.add(menuItListMCpra);

        jMenuBar1.add(menuCompra);

        menuCliente.setText("Cliente");
        menuCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        menuIGestionCli.setText("Gestionar Cliente");
        menuIGestionCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIGestionCliActionPerformed(evt);
            }
        });
        menuCliente.add(menuIGestionCli);

        jMenuBar1.add(menuCliente);

        menuUsuario.setText("Mi Cuenta");
        menuUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        changePass.setText("Cambiar Contraseña");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        menuUsuario.add(changePass);

        exit.setText("Cerrar Sesión");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuUsuario.add(exit);

        jMenuBar1.add(menuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laber_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(490, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laber_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItAltaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItAltaProdActionPerformed
       ControladorProducto contAlta= new ControladorProducto(conexion);
       
    }//GEN-LAST:event_menuItAltaProdActionPerformed

    private void menuItNvaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItNvaVentaActionPerformed
        String user=laber_usuario.getText();
        ControladorVenta venta = new ControladorVenta (conexion,user);
        
    }
    /*
        windowNewVenta.setVisible(true);    }//GEN-LAST:event_menuItNvaVentaActionPerformed
*/
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BuscarProducto search= new BuscarProducto(conexion);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuIGestionCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIGestionCliActionPerformed
        ControladorCliente cliente = new ControladorCliente(this, conexion);
    }//GEN-LAST:event_menuIGestionCliActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        String user = laber_usuario.getText();
        ModPass window = new ModPass(conexion, user);
        window.setVisible(true);
    }//GEN-LAST:event_changePassActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        Login window = new Login(conexion);
        window.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void menuItNvaCpraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItNvaCpraActionPerformed
        String user = laber_usuario.getText();
        ControladorCompra compra = new ControladorCompra(conexion, user);
    }//GEN-LAST:event_menuItNvaCpraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changePass;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel laber_usuario;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenuItem menuIGestionCli;
    private javax.swing.JMenuItem menuItAltaProd;
    private javax.swing.JMenuItem menuItListMCpra;
    private javax.swing.JMenuItem menuItListVenta;
    private javax.swing.JMenuItem menuItNvaCpra;
    private javax.swing.JMenuItem menuItNvaVenta;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenta;
    // End of variables declaration//GEN-END:variables
}
