package com.example.JardinHortensiasAR.Reserva;

import com.example.JardinHortensiasAR.Usuario.Usuario;
import com.example.JardinHortensiasAR.Visita.Visita;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne()
    @JoinColumn(name="idVisita") //fk
    private Visita visita;
    
    
}
