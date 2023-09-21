package com.arquitectura.reporte.service;

import com.arquitectura.reporte.Utils.Constants;
import com.arquitectura.reporte.Utils.DbConsult;
import com.arquitectura.reporte.Utils.Dbsave;
import com.arquitectura.reporte.Utils.JsonConvert;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.stereotype.Service;

@Service
public class ServicioData {

    public ArrayNode getData(String rubro, String subregion, String ano, String id) {
        StringBuilder queryBuilder = new StringBuilder(Constants.SQLCONSULTPARAMS);

        if (rubro != null) {
            queryBuilder.append(Constants.WHERE).append(Constants.RUBRO).append("'").append(rubro).append("'");
        }

        if (subregion != null) {
            appendCondition(queryBuilder);
            queryBuilder.append(Constants.SUBREGION).append("'").append(subregion).append("'");
        }

        if (ano != null) {
            appendCondition(queryBuilder);
            queryBuilder.append(Constants.ANIO).append(ano);
        }
        Dbsave.updateSolicitud(queryBuilder.toString(), id);
        return JsonConvert.jsonReponse(DbConsult.consultDB(queryBuilder.toString()));
    }

    private void appendCondition(StringBuilder queryBuilder) {
        if (queryBuilder.toString().contains(Constants.WHERE)) {
            queryBuilder.append(Constants.AND);
        } else {
            queryBuilder.append(Constants.WHERE);
        }
    }

    public ArrayNode getParameter(String parameter) {
        String sql = "select distinct " + parameter + " from cultivos_agricolas group by " + parameter;
        return JsonConvert.jsonReponse(DbConsult.consultDB(sql));
    }

}
