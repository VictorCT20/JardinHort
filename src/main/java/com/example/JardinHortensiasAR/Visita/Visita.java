package com.example.JardinHortensiasAR.Visita;

import com.example.JardinHortensiasAR.Usuario.Usuario;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
