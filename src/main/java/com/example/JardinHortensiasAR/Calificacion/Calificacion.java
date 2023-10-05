package com.example.JardinHortensiasAR.Calificacion;

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
@Table(name = "calificacion")
public class Calificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne()
    @JoinColumn(name="idUsuario") //fk
    private Usuario usuario;
    
    private int numEstrella;
    private String comentario;
    private int calificado;
    
}
