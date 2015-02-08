/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GestionConexion {

    private Connection connection;
    private Statement statement;
    private String driver;
    private String protocolo;
    private String servidor;
    private String database;
    private String user;
    private String password;

    public GestionConexion() {
        System.out.println("Constructor Conexion por defecto a MySql.");
        this.driver = "com.mysql.jdbc.Driver";
        this.protocolo = "jdbc:mysql";
        this.servidor = "localhost";
        this.database = "finalgestion";
        this.user = "root";
        this.password = "";
    }

    public GestionConexion(String dbms, String servidor, String database, String user,
            String password) {
        if (dbms.toUpperCase().equals("MYSQL")) {
            this.driver = "com.mysql.jdbc.Driver";
            this.protocolo = "jdbc:mysql";
        } else if (dbms.toUpperCase().equals("POSTGRES")) {
            this.driver = "org.postgresql.Driver";
            this.protocolo = "jdbc:postgresql";
        }
        this.servidor = servidor;
        this.database = database;
        this.user = user;
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Connection getConnection() {
        return connection;
    } // end getConection()

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Statement getStatement() {
        return statement;
    }

    public String getDatabase() {
        return database;
    } // end getDatabase()

    public void setDatabase(String database) {
        this.database = database;
    }//end setDatabase();

    public void setConnection(Connection connection) {
        this.connection = connection;
    } // end setConnection()

    public String getServidor() {
        return servidor;
    } // end getServidor()

    public String getUser() {
        return user;
    } // end getUser()

    public String getPassword() {
        return password;
    } // end getPassword()

    public boolean isDriver() {
        try {
            Class.forName(getDriver());
        } catch (ClassNotFoundException ex) {
            return false;
        }
        return true;
    }

    public void conectar() throws SQLException, ClassNotFoundException {
        System.out.println("Conectando ...");
        if (isDriver()) {
            String url = getProtocolo() + "://" + getServidor() + "/" + getDatabase();
            try {
                setConnection(DriverManager.getConnection(url, getUser(), getPassword()));
                setStatement(getConnection().createStatement());
            } catch (SQLException ex) {
                System.err.println("No puede conectar a la Base de Datos.");
                System.err.println(ex.getMessage());
                throw (ex);
            }
        } else {
            System.err.println("No encuentra el Driver.");
            JOptionPane.showMessageDialog(null,
                    "Error Driver Base de Datos...", "ADVERTENCIA",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public void cerrar() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println("No puede cerrar conexion a la Base de Datos.");
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error Cerrar BD...",
                    "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

  
}
