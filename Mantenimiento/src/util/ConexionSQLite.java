package util;

import java.sql.*;

public class ConexionSQLite {

    private static final String URL = "jdbc:sqlite:db/mantenimiento.db";
    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Error al conectar: "+ e.getMessage());
            return null;
        }
    }
    
}
