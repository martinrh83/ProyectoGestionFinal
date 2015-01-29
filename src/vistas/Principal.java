/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorAlta;
import modelo.GestionConexion;

/**
 *
 * @author martinrh83
 */
public class Principal extends javax.swing.JFrame {

    private GestionConexion conexion;
    
    public Principal(GestionConexion c) {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProducto = new javax.swing.JMenu();
        menuItAltaProd = new javax.swing.JMenuItem();
        menuItBajaProd = new javax.swing.JMenuItem();
        menuItModProd = new javax.swing.JMenuItem();
        menuItListProd = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuItNvaVenta = new javax.swing.JMenuItem();
        menuItListVenta = new javax.swing.JMenuItem();
        menuCompra = new javax.swing.JMenu();
        menuItNvaCpra = new javax.swing.JMenuItem();
        menuItNvaPedCpra = new javax.swing.JMenuItem();
        menuItListMCpra = new javax.swing.JMenuItem();
        menuProveedor = new javax.swing.JMenu();
        menuItAltaProv = new javax.swing.JMenuItem();
        menuItBajaProv = new javax.swing.JMenuItem();
        menuItModProv = new javax.swing.JMenuItem();
        menuItListProv = new javax.swing.JMenuItem();
        menuPersonal = new javax.swing.JMenu();
        menuItLiqSdoPer = new javax.swing.JMenuItem();
        menuItGConPer = new javax.swing.JMenuItem();
        menuItAltaPer = new javax.swing.JMenuItem();
        menuItBajaPer = new javax.swing.JMenuItem();
        menuItModPer = new javax.swing.JMenuItem();
        menuItListPer = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItAltaCli = new javax.swing.JMenuItem();
        menuItBajaCli = new javax.swing.JMenuItem();
        menuItModCli = new javax.swing.JMenuItem();
        menuItListCli = new javax.swing.JMenuItem();

        jMenuItem20.setText("jMenuItem20");

        jMenuItem24.setText("jMenuItem24");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuProducto.setText("Producto");

        menuItAltaProd.setLabel("Alta");
        menuItAltaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItAltaProdActionPerformed(evt);
            }
        });
        menuProducto.add(menuItAltaProd);

        menuItBajaProd.setText("Baja");
        menuProducto.add(menuItBajaProd);

        menuItModProd.setText("Modificacion");
        menuProducto.add(menuItModProd);

        menuItListProd.setText("Listado");
        menuProducto.add(menuItListProd);

        jMenuBar1.add(menuProducto);

        menuVenta.setText("Venta");

        menuItNvaVenta.setText("Nueva");
        menuVenta.add(menuItNvaVenta);

        menuItListVenta.setText("Listado");
        menuVenta.add(menuItListVenta);

        jMenuBar1.add(menuVenta);

        menuCompra.setText("Compra");

        menuItNvaCpra.setText("Nueva");
        menuCompra.add(menuItNvaCpra);

        menuItNvaPedCpra.setText("Nuevo Pedido");
        menuCompra.add(menuItNvaPedCpra);

        menuItListMCpra.setText("Listado Mes");
        menuCompra.add(menuItListMCpra);

        jMenuBar1.add(menuCompra);

        menuProveedor.setText("Proveedores");

        menuItAltaProv.setText("Alta");
        menuProveedor.add(menuItAltaProv);

        menuItBajaProv.setText("Baja");
        menuProveedor.add(menuItBajaProv);

        menuItModProv.setText("Modificacion");
        menuProveedor.add(menuItModProv);

        menuItListProv.setText("Listado");
        menuProveedor.add(menuItListProv);

        jMenuBar1.add(menuProveedor);

        menuPersonal.setText("Personal");

        menuItLiqSdoPer.setText("Liqudacion Sueldo");
        menuPersonal.add(menuItLiqSdoPer);

        menuItGConPer.setText("Gestion de Conceptos");
        menuPersonal.add(menuItGConPer);

        menuItAltaPer.setText("Alta");
        menuPersonal.add(menuItAltaPer);

        menuItBajaPer.setText("Baja");
        menuPersonal.add(menuItBajaPer);

        menuItModPer.setText("Modificacion");
        menuItModPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItModPerActionPerformed(evt);
            }
        });
        menuPersonal.add(menuItModPer);

        menuItListPer.setText("Listado");
        menuPersonal.add(menuItListPer);

        jMenuBar1.add(menuPersonal);

        menuCliente.setText("Cliente");

        menuItAltaCli.setText("Alta");
        menuCliente.add(menuItAltaCli);

        menuItBajaCli.setText("Baja");
        menuCliente.add(menuItBajaCli);

        menuItModCli.setText("Modificacion");
        menuItModCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItModCliActionPerformed(evt);
            }
        });
        menuCliente.add(menuItModCli);

        menuItListCli.setText("Listado");
        menuCliente.add(menuItListCli);

        jMenuBar1.add(menuCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItAltaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItAltaProdActionPerformed
       ControladorAlta contAlta= new ControladorAlta(this, conexion);
       
    }//GEN-LAST:event_menuItAltaProdActionPerformed

    private void menuItModPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItModPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItModPerActionPerformed

    private void menuItModCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItModCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItModCliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuCompra;
    private javax.swing.JMenuItem menuItAltaCli;
    private javax.swing.JMenuItem menuItAltaPer;
    private javax.swing.JMenuItem menuItAltaProd;
    private javax.swing.JMenuItem menuItAltaProv;
    private javax.swing.JMenuItem menuItBajaCli;
    private javax.swing.JMenuItem menuItBajaPer;
    private javax.swing.JMenuItem menuItBajaProd;
    private javax.swing.JMenuItem menuItBajaProv;
    private javax.swing.JMenuItem menuItGConPer;
    private javax.swing.JMenuItem menuItLiqSdoPer;
    private javax.swing.JMenuItem menuItListCli;
    private javax.swing.JMenuItem menuItListMCpra;
    private javax.swing.JMenuItem menuItListPer;
    private javax.swing.JMenuItem menuItListProd;
    private javax.swing.JMenuItem menuItListProv;
    private javax.swing.JMenuItem menuItListVenta;
    private javax.swing.JMenuItem menuItModCli;
    private javax.swing.JMenuItem menuItModPer;
    private javax.swing.JMenuItem menuItModProd;
    private javax.swing.JMenuItem menuItModProv;
    private javax.swing.JMenuItem menuItNvaCpra;
    private javax.swing.JMenuItem menuItNvaPedCpra;
    private javax.swing.JMenuItem menuItNvaVenta;
    private javax.swing.JMenu menuPersonal;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenu menuProveedor;
    private javax.swing.JMenu menuVenta;
    // End of variables declaration//GEN-END:variables
}
