package com.arquitectura.reporte.Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConsult {

    public static ResultSet consultDB(String sqlQuery) {
        Connection connection = DbConnection.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            return statement.executeQuery(sqlQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
