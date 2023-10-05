package com.example.JardinHortensiasAR.Reserva;

import com.example.JardinHortensiasAR.Usuario.Usuario;
import com.example.JardinHortensiasAR.Visita.Visita;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
