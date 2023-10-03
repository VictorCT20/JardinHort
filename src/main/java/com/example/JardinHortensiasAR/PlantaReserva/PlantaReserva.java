package com.example.JardinHortensiasAR.PlantaReserva;

import com.example.JardinHortensiasAR.Planta.Planta;
import com.example.JardinHortensiasAR.Reserva.Reserva;
import com.example.JardinHortensiasAR.Usuario.Usuario;
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
@Table(name = "plantaReserva")
public class PlantaReserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    @ManyToOne()
    @JoinColumn(name="idReserva") //fk
    private Reserva reserva;
    @ManyToOne()
    @JoinColumn(name="idPlanta") //fk
    private Planta planta;
    
}
