package com.arquitectura.reporte.Utils;

import java.sql.*;

public class DbConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(Constants.STRINGCONNECTION);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }


}
