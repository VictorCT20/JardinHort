package com.example.JardinHortensiasAR.Calificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/calificacion/")
@Controller
public class ControladorCalificacion {
    
    String carpeta = "Calificacion/";

    @Autowired
    private ICalificacionService service;
    
    
}
