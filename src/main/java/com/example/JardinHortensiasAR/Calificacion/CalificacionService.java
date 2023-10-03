package com.example.JardinHortensiasAR.Calificacion;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private ICalificacion data;
    
    @Override
    public List<Calificacion> Listar() {
        return (List<Calificacion>) data.findAll();
    }

    @Override
    public Optional<Calificacion> ConsultarId(int id) {
        return data.findById(id);
    }

    @Override
    public Optional<Calificacion> ConsultarUsuId(int id) {
        return data.CalificacionUsuario(id);
    }

    @Override
    public void Guardar(Calificacion c) {
        data.save(c);
    }

    @Override
    public void Eliminar(int id) {
        data.deleteById(id);
    }

    @Override
    public int ConsultarCalificado(int id) {
        return data.Calificado(id);
    }

    
}
