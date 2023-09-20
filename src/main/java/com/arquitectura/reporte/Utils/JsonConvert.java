package com.arquitectura.reporte.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JsonConvert {

    public static ArrayNode jsonReponse(ResultSet resultSet) {
        ResultSetMetaData rsmd = null;
        try {
            rsmd = resultSet.getMetaData();
            int[] colType = new int[rsmd.getColumnCount()];
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode jsonArray = objectMapper.createArrayNode();
            while (resultSet.next()) {
                ObjectNode objectNode = objectMapper.createObjectNode();
                for (int i = 0; i < colType.length; i++) {
                    objectNode.put(rsmd.getColumnName(i + 1), resultSet.getString(rsmd.getColumnName(i + 1)));
                }
                jsonArray.add(objectNode);
            }
            return jsonArray;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayNode jsonIdReporte(ResultSet resultSet) {
        ResultSetMetaData rsmd = null;
        try {
            rsmd = resultSet.getMetaData();
            int[] colType = new int[rsmd.getColumnCount()];
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayNode jsonArray = objectMapper.createArrayNode();
            while (resultSet.next()) {
                ObjectNode objectNode = objectMapper.createObjectNode();
                for (int i = 0; i < colType.length; i++) {
                    objectNode.put(rsmd.getColumnName(i + 1), resultSet.getString(rsmd.getColumnName(i + 1)));
                }
                jsonArray.add(objectNode);
            }
            return jsonArray;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
