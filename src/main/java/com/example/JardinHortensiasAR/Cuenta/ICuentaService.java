package com.example.JardinHortensiasAR.Cuenta;

import java.util.List;
import java.util.Optional;

public interface ICuentaService {
    
    public List<Cuenta> Listar();
    public Cuenta BuscarA(String dato);
    public List<String> ComproUsername();
    
}
