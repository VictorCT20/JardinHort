package com.example.JardinHortensiasAR.Cuenta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService implements ICuentaService {

    @Autowired
    private ICuenta data;
    
    @Override
    public List<Cuenta> Listar() {
        return (List<Cuenta>) data.findAll();
    }

    @Override
    public Cuenta BuscarA(String dato) {
        return data.findUser(dato);
    }

    @Override
    public List<String> ComproUsername() {
        return data.findUserName();
    }
    
}
