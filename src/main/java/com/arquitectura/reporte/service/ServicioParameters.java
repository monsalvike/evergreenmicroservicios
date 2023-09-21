package com.arquitectura.reporte.service;

import com.arquitectura.reporte.Utils.DbConsult;
import com.arquitectura.reporte.Utils.JsonConvert;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.stereotype.Service;

@Service
public class ServicioParameters {

    public ArrayNode getParameter(String parameter) {
        String sql = "select distinct " + parameter + " from Tbl_Cultivos_Agricolas group by " + parameter;
        System.out.println(sql);
        return JsonConvert.jsonReponse(DbConsult.consultDB(sql));
    }

}
