/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.ServiciosAutor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author chris
 */
@Controller
@RequestMapping("/autor") //localhost:8080/autor
public class AutorControlador {
    
    @Autowired
    private ServiciosAutor serviciosAutor;
    
    
    @GetMapping("/registrar")
    public String registrar(){
    return "autor_form.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) String nombre, ModelMap modelo){
        try {
            serviciosAutor.crearAutor(nombre);
            modelo.put("exito", "El Autor fue cargado correctamente!");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "autor_form.html";
        }
        
        return "index.html";
    }
   
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
    
        List<Autor> autores = serviciosAutor.listarAutores();
    
        modelo.addAttribute("autores", autores);
        
        return "autor_list.html";
        
    }
    
}
