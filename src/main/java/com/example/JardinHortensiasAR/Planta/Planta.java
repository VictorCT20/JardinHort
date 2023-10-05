package com.example.JardinHortensiasAR.Planta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
