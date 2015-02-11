/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import modelo.Entidad;

/**
 *
 * @author Mariana
 */
public class Familiar {
    
    private double idFamiliar;
    private String nomYap;
    private int dni;
    private String fecha_nac;
    private String nacionalidad;
    private String parentesco;
    private String escolaridad;
    private String discapacidad;
    private String estado_civil;

    public Familiar(double idFamiliar, String nomYap, int dni, String fecha_nac, String nacionalidad, String parentesco, String escolaridad, String discapacidad, String estado_civil, String entidad, modelo.GestionConexion GestionConexion) {
 
        this.idFamiliar = idFamiliar;
        this.nomYap = nomYap;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.parentesco = parentesco;
        this.escolaridad = escolaridad;
        this.discapacidad = discapacidad;
        this.estado_civil = estado_civil;
    }


    public double getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(double idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public String getNomYap() {
        return nomYap;
    }

    public void setNomYap(String nomYap) {
        this.nomYap = nomYap;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    
}
