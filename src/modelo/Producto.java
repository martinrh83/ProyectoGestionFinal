/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author martinrh83
 */
public class Producto {

    private int codigoProd;
    private String nombreProd;
    private String descripcionProd;
    private int cantProd;
    private float precMay;
    private float precMin;
    private String marca;
    private String fechaVenc;
    private float pcioCpra;
    private int idCategoria;
    
    
    public Producto() {
    }

    public int getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(int codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public float getPrecMay() {
        return precMay;
    }

    public void setPrecMay(float precMay) {
        this.precMay = precMay;
    }

    public float getPrecMin() {
        return precMin;
    }

    public void setPrecMin(float precMin) {
        this.precMin = precMin;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public float getPcioCpra() {
        return pcioCpra;
    }

    public void setPcioCpra(float pcioCpra) {
        this.pcioCpra = pcioCpra;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
}
