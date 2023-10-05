package com.example.JardinHortensiasAR.Login;

import com.example.JardinHortensiasAR.Cuenta.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Cuenta, Long>  {
    
    Cuenta findByUsername(String user);
    
}
