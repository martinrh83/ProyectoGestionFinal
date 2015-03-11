/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.BuscarProducto;
import controlador.ControladorCategoria;
import controlador.ControladorProducto;
import controlador.ControladorUsuario;
import controlador.ControladorCliente;
import controlador.ControladorCompra;
import controlador.ControladorConceptoLiq;
import controlador.ControladorDomicilio;
import controlador.ControladorLiquidacionSueldo;
import controlador.ControladorProveedor;
import controlador.ControladorVenta;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class Principal extends javax.swing.JFrame {

    private GestionConexion conexion;

    public Principal(GestionConexion c) {
        conexion = c;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProducto = new javax.swing.JMenu();
        menuItAltaProd = new javax.swing.JMenuItem();
        menuIBuscarP = new javax.swing.JMenuItem();
        menuIAddCat = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuItNvaVenta = new javax.swing.JMenuItem();
        menuItListVenta = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuItNvaCpra = new javax.swing.JMenuItem();
        menuItNvaPedCpra = new javax.swing.JMenuItem();
        menuItListMCpra = new javax.swing.JMenuItem();
        menuProveedor = new javax.swing.JMenu();
        menuGestionProv = new javax.swing.JMenuItem();
        menuPersonal = new javax.swing.JMenu();
        menuItLiqSdoPer = new javax.swing.JMenuItem();
        menuItGConPer = new javax.swing.JMenuItem();
        menuItAltaPer = new javax.swing.JMenuItem();
        menuAltaDomicilio = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuIGestionCli = new javax.swing.JMenuItem();
        menuItListCli = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        changePass = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jMenuItem20.setText("jMenuItem20");

        jMenuItem24.setText("jMenuItem24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        menuProducto.setText("Producto");

        menuItAltaProd.setLabel("Alta");
        menuItAltaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItAltaProdActionPerformed(evt);
            }
        });
        menuProducto.add(menuItAltaProd);

        menuIBuscarP.setText("Buscar");
        menuIBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIBuscarPActionPerformed(evt);
            }
        });
        menuProducto.add(menuIBuscarP);

        menuIAddCat.setText("Alta Categoria");
        menuIAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIAddCatActionPerformed(evt);
            }
        });
        menuProducto.add(menuIAddCat);

        jMenuBar1.add(menuProducto);

        menuVenta.setText("Venta");

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

        menuItNvaCpra.setText("Nueva");
        menuItNvaCpra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItNvaCpraActionPerformed(evt);
            }
        });
        menuCompra.add(menuItNvaCpra);

        menuItNvaPedCpra.setText("Nuevo Pedido");
        menuCompra.add(menuItNvaPedCpra);

        menuItListMCpra.setText("Listado Mes");
        menuCompra.add(menuItListMCpra);

        jMenuBar1.add(menuCompra);

        menuProveedor.setText("Proveedores");

        menuGestionProv.setText("Gestion de Proveedor");
        menuGestionProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionProvActionPerformed(evt);
            }
        });
        menuProveedor.add(menuGestionProv);

        jMenuBar1.add(menuProveedor);

        menuPersonal.setText("Personal");

        menuItLiqSdoPer.setText("Liqudacion Sueldo");
        menuItLiqSdoPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItLiqSdoPerActionPerformed(evt);
            }
        });
        menuPersonal.add(menuItLiqSdoPer);

        menuItGConPer.setText("Gestion de Conceptos");
        menuItGConPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItGConPerActionPerformed(evt);
            }
        });
        menuPersonal.add(menuItGConPer);

        menuItAltaPer.setText("Gestión de Personal");
        menuItAltaPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItAltaPerActionPerformed(evt);
            }
        });
        menuPersonal.add(menuItAltaPer);

        menuAltaDomicilio.setText("Alta Domicilio");
        menuAltaDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltaDomicilioActionPerformed(evt);
            }
        });
        menuPersonal.add(menuAltaDomicilio);

        jMenuBar1.add(menuPersonal);

        menuCliente.setText("Cliente");

        menuIGestionCli.setText("Gestionar");
        menuIGestionCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIGestionCliActionPerformed(evt);
            }
        });
        menuCliente.add(menuIGestionCli);

        menuItListCli.setText("Listado");
        menuCliente.add(menuItListCli);

        jMenuBar1.add(menuCliente);

        menuUsuario.setText("Mi Cuenta");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laber_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laber_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItAltaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItAltaProdActionPerformed
        ControladorProducto contAlta = new ControladorProducto(conexion);

    }//GEN-LAST:event_menuItAltaProdActionPerformed

    private void menuItNvaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItNvaVentaActionPerformed
        String user = laber_usuario.getText();
        ControladorVenta venta = new ControladorVenta(conexion, user);

    }
    /*
        windowNewVenta.setVisible(true);    }//GEN-LAST:event_menuItNvaVentaActionPerformed
*/
    private void menuItAltaPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItAltaPerActionPerformed
        ControladorUsuario user = new ControladorUsuario(conexion);

    }//GEN-LAST:event_menuItAltaPerActionPerformed

    private void menuGestionProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionProvActionPerformed
        ControladorProveedor prov = new ControladorProveedor(conexion);
    }//GEN-LAST:event_menuGestionProvActionPerformed

    private void menuIBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIBuscarPActionPerformed
        BuscarProducto search = new BuscarProducto(conexion);
    }//GEN-LAST:event_menuIBuscarPActionPerformed

    private void menuIGestionCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIGestionCliActionPerformed
        ControladorCliente cliente = new ControladorCliente(this, conexion);
    }//GEN-LAST:event_menuIGestionCliActionPerformed

    private void menuItNvaCpraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItNvaCpraActionPerformed
        String user = laber_usuario.getText();
        ControladorCompra compra = new ControladorCompra(conexion, user);
    }//GEN-LAST:event_menuItNvaCpraActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        String user = laber_usuario.getText();
        ModPass window = new ModPass(conexion, user);
        window.setVisible(true);
    }//GEN-LAST:event_changePassActionPerformed

    private void menuAltaDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltaDomicilioActionPerformed
        ControladorDomicilio window = new ControladorDomicilio(conexion);
    }//GEN-LAST:event_menuAltaDomicilioActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        Login window = new Login(conexion);
        window.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void menuIAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIAddCatActionPerformed
        ControladorCategoria cat = new ControladorCategoria(conexion);
    }//GEN-LAST:event_menuIAddCatActionPerformed

    private void menuItGConPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItGConPerActionPerformed
        ControladorConceptoLiq concep = new ControladorConceptoLiq(conexion);
    }//GEN-LAST:event_menuItGConPerActionPerformed

    private void menuItLiqSdoPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItLiqSdoPerActionPerformed
        ControladorLiquidacionSueldo v1= new ControladorLiquidacionSueldo(conexion);
    }//GEN-LAST:event_menuItLiqSdoPerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem changePass;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem24;
    public javax.swing.JLabel laber_usuario;
    private javax.swing.JMenuItem menuAltaDomicilio;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenuItem menuGestionProv;
    private javax.swing.JMenuItem menuIAddCat;
    private javax.swing.JMenuItem menuIBuscarP;
    private javax.swing.JMenuItem menuIGestionCli;
    private javax.swing.JMenuItem menuItAltaPer;
    private javax.swing.JMenuItem menuItAltaProd;
    private javax.swing.JMenuItem menuItGConPer;
    private javax.swing.JMenuItem menuItLiqSdoPer;
    private javax.swing.JMenuItem menuItListCli;
    private javax.swing.JMenuItem menuItListMCpra;
    private javax.swing.JMenuItem menuItListVenta;
    private javax.swing.JMenuItem menuItNvaCpra;
    private javax.swing.JMenuItem menuItNvaPedCpra;
    private javax.swing.JMenuItem menuItNvaVenta;
    private javax.swing.JMenu menuPersonal;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenu menuProveedor;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenta;
    // End of variables declaration//GEN-END:variables
}
