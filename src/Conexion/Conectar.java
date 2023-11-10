/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author $
 */
public class Conectar {

    public static Connection c;
    private static Connection c2;
    public static Connection server_con;
    public static String MENSAJE = "";
    private String host = "localhost:5432";
    private String dbname = "prueba1";
    private String passwd = "ArFa0985";
    PreparedStatement sentencia;

    public java.sql.Connection conectaServidor() {
        try {
            MENSAJE = "";
            String url = "jdbc:postgresql://" + host;
            Class.forName("org.postgresql.Driver");
            server_con = java.sql.DriverManager.getConnection(url, "postgres", passwd);
        } catch (Exception ex) {
            MENSAJE = ex.getMessage();
        }
        return server_con;
    }

    public void creaBD(String stm) {
        try {
            MENSAJE = "";
            c2 = server_con;
            Statement s = c2.createStatement();
            s.executeUpdate(stm);
            c2.close();
        } catch (Exception ex) {
            MENSAJE = ex.getMessage();
        }
    }

    public java.sql.Connection conectaBD() {
        String url = "jdbc:postgresql://" + host + "/" + dbname;
        MENSAJE = "";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, "postgres", passwd);
        } catch (Exception ex) {
            MENSAJE = ex.getMessage();
        }
        return c;
    }

    public java.sql.ResultSet consulta(String consul) {
        java.sql.ResultSet r = null;
        MENSAJE = "";
        try {
            java.sql.Statement stm = c.createStatement();
            r = stm.executeQuery(consul);
        } catch (SQLException e) {
            MENSAJE = e.getMessage();
        }
        return r;
    }

    public void ejecutar(String stm) {

        try {
            MENSAJE = "";
            PreparedStatement s = c.prepareStatement(stm);
            s.executeUpdate(stm);
        } catch (Exception e) {
            MENSAJE = e.getMessage();
            System.out.println("");
        }
    }

}
