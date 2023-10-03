package com.example.JardinHortensiasAR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @GetMapping("/") 
    public String Index() {
        return "Index";
    }
    
    @GetMapping("/ar") 
    public String Ar() {
        return "Ar";
    }
    
}
