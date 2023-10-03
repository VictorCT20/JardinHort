package com.example.JardinHortensiasAR.Planta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "planta")
public class Planta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePlanta;
    private String nombreEspecie;
    private String Origen;
    private String tiempoVida;
    private String propiedades;
    private String detalle;
    private String curiosidad;
    private float precio;
    private String img;
    
}
