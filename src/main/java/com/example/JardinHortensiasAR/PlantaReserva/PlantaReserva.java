package com.example.JardinHortensiasAR.PlantaReserva;

import com.example.JardinHortensiasAR.Planta.Planta;
import com.example.JardinHortensiasAR.Reserva.Reserva;
import com.example.JardinHortensiasAR.Usuario.Usuario;
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
