package com.arquitectura.reporte.Utils;

import java.sql.*;

public class DbConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/arquitectura";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(Constants.DNSDATABASE, Constants.USUARIO, Constants.PASS);
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }


}
