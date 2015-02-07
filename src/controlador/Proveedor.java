/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Casa
 */
public class Proveedor {
    private int idProveedor;
    private String nombreProv;
    private int cuitProv;
    private String razonSocProv;
    private String direccionProv;
    private String emailProv;
    private int telefonoProv;
    
    
    public Proveedor(){
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getCuitProv() {
        return cuitProv;
    }

    public void setCuitProv(int cuitProv) {
        this.cuitProv = cuitProv;
    }

    public String getRazonSocProv() {
        return razonSocProv;
    }

    public void setRazonSocProv(String razonSocProv) {
        this.razonSocProv = razonSocProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public int getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(int telefonoProv) {
        this.telefonoProv = telefonoProv;
    }
        
        
}


