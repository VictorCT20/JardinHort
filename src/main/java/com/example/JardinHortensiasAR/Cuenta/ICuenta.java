package com.example.JardinHortensiasAR.Cuenta;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ICuenta  extends CrudRepository<Cuenta, Integer> {
    
    @Query(value = "SELECT * FROM cuenta "
            + "WHERE username = ?1 ", nativeQuery = true)
    Cuenta findUser(String dato);
    
    @Query(value = "SELECT username FROM cuenta ", nativeQuery = true)
    List<String> findUserName();
    
}
