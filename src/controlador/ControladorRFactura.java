/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.GestionConexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Martin
 */
public class ControladorRFactura {
    private GestionConexion conexion;
    public ControladorRFactura(GestionConexion conn) {
        conexion=conn;
    }
    
    public void ejecutarReporte(String ds){
        try {
            String dir="C:\\Users\\Martin\\Documents\\NetBeansProjects\\ProyectoFinalGestion\\ProyectoFinalGestion\\src\\vistas\\FacturaVenta.jrxml";
            JasperReport reporteJasper=JasperCompileManager.compileReport(dir);
            int idSearch=Integer.valueOf(ds);
            Map parametro=new HashMap();
            parametro.put("idFacturar", idSearch);
            
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporteJasper, parametro, conexion.getConnection());
        JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
            Logger.getLogger(ControladorRFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ejecutarReporteCompra(String ds){
        try {
            String dir="C:\\Users\\Martin\\Documents\\NetBeansProjects\\ProyectoFinalGestion\\ProyectoFinalGestion\\src\\vistas\\ReciboCompra.jrxml";
            JasperReport reporteJasper=JasperCompileManager.compileReport(dir);
            int idSearch=Integer.valueOf(ds);
            Map parametro=new HashMap();
            parametro.put("idImprimir", idSearch);
            
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporteJasper, parametro, conexion.getConnection());
        JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
            Logger.getLogger(ControladorRFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     public void ejecutarReporteLiquidacion(String ds){
        try {
            String dir="C:\\Users\\Martin\\Documents\\NetBeansProjects\\ProyectoFinalGestion\\ProyectoFinalGestion\\src\\vistas\\ReciboSueldo.jrxml";
            JasperReport reporteJasper=JasperCompileManager.compileReport(dir);
            int idSearch=Integer.valueOf(ds);
            Map parametro=new HashMap();
            parametro.put("idSueldo", idSearch);
            
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporteJasper, parametro, conexion.getConnection());
        JasperViewer.viewReport(jasperPrint);
        } catch (JRException ex) {
            Logger.getLogger(ControladorRFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
