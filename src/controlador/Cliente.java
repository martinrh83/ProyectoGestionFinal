/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Mariana
 */
public class Cliente {
        private int idCliente;
        private String nombre;
        private String apellido;
        private int dni;
        private int cuil;
        private String direccion;

    public Cliente() {
    }

   
        

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * Get the value of cuil
     *
     * @return the value of cuil
     */
    public int getCuil() {
        return cuil;
    }

    /**
     * Set the value of cuil
     *
     * @param cuil new value of cuil
     */
    public void setCuil(int cuil) {
        this.cuil = cuil;
    }


    /**
     * Get the value of dni
     *
     * @return the value of dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * Set the value of dni
     *
     * @param dni new value of dni
     */
    public void setDni(int dni) {
        this.dni = dni;
    }


    /**
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    
}
