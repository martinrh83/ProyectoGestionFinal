/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;


/**
 *
 * @author Martin
 */
public class Venta {
    
    private int idVenta;
    private String fechaVta;
    private String tipoVta;
    private float porcMarc;
    private float impTotal;
    private int Cliente_idCliente;
    private int Usuario_idUsuario;

    public Venta() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVta() {
        return fechaVta;
    }

    public void setFechaVta(String fechaVta) {
        this.fechaVta = fechaVta;
    }

    public String getTipoVta() {
        return tipoVta;
    }

    public void setTipoVta(String tipoVta) {
        this.tipoVta = tipoVta;
    }

    public float getPorcMarc() {
        return porcMarc;
    }

    public void setPorcMarc(float porcMarc) {
        this.porcMarc = porcMarc;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public int getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(int Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

    public float getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(float impTotal) {
        this.impTotal = impTotal;
    }
    
    
}
