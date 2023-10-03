package com.example.JardinHortensiasAR.Visita;

import com.example.JardinHortensiasAR.Usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "visita")
public class Visita {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fechaVisita;
    @ManyToOne()
    @JoinColumn(name="idUsuario") //fk
    private Usuario usuario;
    
}
