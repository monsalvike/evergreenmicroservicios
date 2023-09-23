package com.arquitectura.reporte.controller;

import com.arquitectura.reporte.Utils.Dbsave;
import com.arquitectura.reporte.models.ReporteInfo;
import com.arquitectura.reporte.service.ServicioData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reporte")
public class ControllerData {
    private final ServicioData myService;

    @Autowired
    public ControllerData(ServicioData myService) {
        this.myService = myService;
    }

    @GetMapping
    public ArrayNode index(@RequestParam(value = "rubro", required = false) String rubro,
                           @RequestParam(value = "subregion", required = false) String subregion,
                           @RequestParam(value = "anio", required = false) String ano,
                           @RequestParam(value = "id", required = true) String id) {
        return myService.getData(rubro, subregion, ano, id);
    }

    @PostMapping("/solicitud")
    public ArrayNode guardarinfo(@RequestBody ReporteInfo reporteInfo) throws JsonProcessingException {
        return Dbsave.withinfo(reporteInfo);
    }
}
