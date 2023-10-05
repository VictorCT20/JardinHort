package com.example.JardinHortensiasAR.Cuenta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cuentas/")
public class ControladorCuenta {
    
    String carpeta = "Cuenta/";
    
    @Autowired
    private ICuentaService service;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @GetMapping("/")
    public String Mostrar(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        List<Cuenta> usuarios = service.Listar();
        boolean isAdmin = userDetails.getAuthorities().stream()
                .anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));
        System.out.println("isAdmin: {}" + isAdmin);
        model.addAttribute("isAdmin", isAdmin);
        model.addAttribute("usuarios", usuarios);

        return carpeta + "listaUsuarios"; //listaEmpleados.html
    }
    
    
    
    
    
}
