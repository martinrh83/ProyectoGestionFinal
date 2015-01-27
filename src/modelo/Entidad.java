/*
 * Entidad.java
 * Clase abstracta para manejar entidades
 * @autor Fernando Araujo
 */
package modelo;

import java.sql.ResultSet;

public abstract class Entidad {
    private String entidad;
    private GestionConexion GestionConexion;

    /**
     * Constrcutor Entidad
     */
    public Entidad() {
    } // end Entidad()

    public Entidad(String entidad, GestionConexion GestionConexion) {
        this.entidad = entidad;
        this.GestionConexion = GestionConexion;
    } // end Entidad()

    public GestionConexion getGestionConexion() {
        return GestionConexion;
    } // end getGestionConexion()

    public void setGestionConexion(GestionConexion GestionConexion) {
        this.GestionConexion = GestionConexion;
    } // end setGestionConexion()

    /**
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    } // end getEntidad()

    /**
     * @param entidad
     *            the entidad to set
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad// <editor-fold defaultstate="collapsed" desc="comment">
                ;// </editor-fold>
    } // end setEntidad()

    // Metodo que entrega un string entre comillas simples
    // necesario para comandos MySQL
    public static String quotate(String content) {
        return "'" + content + "'";
    } // end quotate()

    public static String quotate(int content) {
        return "'" + content + "'";
    } // end quotate()

    public static String quotate(char content) {
        return "'" + content + "'";
    } // end quotate()

  
    public abstract void eliminar();
    
    public abstract void grabar();

    public abstract ResultSet leer();

} // end Entidad

