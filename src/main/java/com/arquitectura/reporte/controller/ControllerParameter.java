package com.arquitectura.reporte.controller;

import com.arquitectura.reporte.service.ServicioParameters;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerParameter {
    private final ServicioParameters myService;

    @Autowired
    public ControllerParameter(ServicioParameters myService) {
        this.myService = myService;
    }

    @GetMapping("/getrubro")
    public ArrayNode getRubro() {
        return myService.getParameter("rubro");
    }

    @GetMapping("/getsubregion")
    public ArrayNode getSubregion() {
        return myService.getParameter("subregion");
    }

    @GetMapping("/getanio")
    public ArrayNode getanio() {
        return myService.getParameter("anio");
    }
}
