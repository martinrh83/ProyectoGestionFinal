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
public class Compra {
    
    private int idCompra;
    private String fecCompra;
    private float impTotal;
    private float pcioComp;
    private int Proveedor_idProveedor;
    private int Usuario_idUsuario;
    

    public Compra() {
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecCompra() {
        return fecCompra;
    }

    public void setFecCompra(String fecCompra) {
        this.fecCompra = fecCompra;
    }

    public float getImpTotal() {
        return impTotal;
    }

    public float getPcioComp() {
        return pcioComp;
    }

    public void setPcioComp(float pcioComp) {
        this.pcioComp = pcioComp;
    }

    public void setImpTotal(float impTotal) {
        this.impTotal = impTotal;
    }

    public int getProveedor_idProveedor() {
        return Proveedor_idProveedor;
    }

    public void setProveedor_idProveedor(int Proveedor_idProveedor) {
        this.Proveedor_idProveedor = Proveedor_idProveedor;
    }

    public int getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(int Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

}