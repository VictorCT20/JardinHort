package com.example.JardinHortensiasAR.Calificacion;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICalificacion extends CrudRepository<Calificacion,Integer> {
    
    @Query(value="SELECT * FROM calificacion "
            + "INNER JOIN usuario ON calificacion.idUsuario = usuario.id "
            + "WHERE calificacion.idUsuario = ?1",nativeQuery=true)
    Optional<Calificacion> CalificacionUsuario(int id);
    
    @Query(value="SELECT c.calificado FROM calificacion c"
            + "INNER JOIN usuario u ON c.idUsuario = u.id "
            + "WHERE c.idUsuario = ?1",nativeQuery=true)
    int Calificado(int id);
    
}
