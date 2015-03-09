/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mariana
 */
public class Concepto {
    
     private int idConcepto; 
    private String descripcion;
    private float importe;
    private String tipo_concepto;

    public Concepto(int idConcepto, String descripcion, float importe, String tipo_concepto) {
        this.idConcepto = idConcepto;
        this.descripcion = descripcion;
        this.importe = importe;
        this.tipo_concepto = tipo_concepto;
    }

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getTipo_concepto() {
        return tipo_concepto;
    }

    public void setTipo_concepto(String tipo_concepto) {
        this.tipo_concepto = tipo_concepto;
    }  
}
