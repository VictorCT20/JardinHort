package com.example.JardinHortensiasAR.Calificacion;

import java.util.List;
import java.util.Optional;

public interface ICalificacionService {
    
    public List<Calificacion> Listar();
    public Optional<Calificacion> ConsultarId(int id);
    public Optional<Calificacion> ConsultarUsuId(int id);
    public int ConsultarCalificado(int id);
    public void Guardar(Calificacion c);
    public void Eliminar(int id);
    
}
