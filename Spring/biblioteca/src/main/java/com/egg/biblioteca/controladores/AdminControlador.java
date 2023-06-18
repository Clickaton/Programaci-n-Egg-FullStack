/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.servicios.ServiciosUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author chris
 */
@Controller
@RequestMapping("/admin")
public class AdminControlador {
    
    @Autowired
    private ServiciosUsuario serviciosUsuario;
    
    @GetMapping("/dashboard")
    public String panelAdministrativo(){
        return "panel.html";
    }
    
    @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
    List<Usuario> usuarios = serviciosUsuario.listarUsuarios();
    modelo.addAttribute("usuarios", usuarios);
    return "usuario_list.html";
    }
    
    @GetMapping("/modificarRol/{id}")
    public String cambiarRol (@PathVariable String id){
        serviciosUsuario.cambiarRol(id);
        return "redirect:/admin/usuarios";
    }

    
    
}
