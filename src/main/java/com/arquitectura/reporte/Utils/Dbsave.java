package com.arquitectura.reporte.Utils;

import com.arquitectura.reporte.models.ReporteInfo;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dbsave {

    public static ArrayNode withinfo(ReporteInfo info) {
        Connection connection = DbConnection.getConnection();
        String sql = info.toString();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();
            return JsonConvert.jsonReponse(DbConsult.consultDB(Constants.SQLCONSULTIDREPORTE));
        } catch (SQLException e) {
            return null;
        }
    }

    public static void updateSolicitud(String sqlQuery, String id) {

        Connection connection = DbConnection.getConnection();
        String sql = "UPDATE solicitud_reporte SET stringconsulta  = '" + sqlQuery.replace("'", " ") + "' WHERE id = " + id;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
