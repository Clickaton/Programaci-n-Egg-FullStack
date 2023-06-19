/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.ServiciosUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public String panelAdministrativo() {
        return "panel.html";
    }

    @GetMapping("/usuarios")
    public String listar(ModelMap modelo) {
        List<Usuario> usuarios = serviciosUsuario.listarUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuario_list.html";
    }

    @GetMapping("/modificarRol/{id}")
    public String cambiarRol(@PathVariable String id) {
        serviciosUsuario.cambiarRol(id);
        return "redirect:/admin/usuarios";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/modificarUsuario/{id}")
    public String mostrarFormularioModificar(@PathVariable String id, ModelMap modelo) {
        Usuario usuario = serviciosUsuario.getOne(id);
        modelo.addAttribute("usuario", usuario);
        return "formulario_editar_usuario.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/modificarUsuario/{id}")
public String editarUsuario(@PathVariable String id, @RequestParam("archivo") MultipartFile archivo,
                            @RequestParam String nombre, @RequestParam String email,
                            @RequestParam String password, @RequestParam String password2,
                            ModelMap modelo) {
    try {
        serviciosUsuario.actualizar(archivo, id, nombre, email, password, password2);
        modelo.put("exito", "Usuario actualizado correctamente!");
        return "redirect:/admin/usuarios";
    } catch (MiException ex) {
        modelo.put("error", ex.getMessage());
        modelo.put("usuario", serviciosUsuario.getOne(id));
        modelo.put("nombre", nombre);
        modelo.put("email", email);
        return "formulario_editar_usuario.html";
    }
}
}