/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.ServiciosEditorial;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author chris
 */
@Controller
@RequestMapping("/editorial") //localhost:8080/editorial
public class EditorialControlador {

    @Autowired
    private ServiciosEditorial serviciosEditorial;

    @GetMapping("/registrar")
    public String registrar() {
        return "editorial_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) String nombre, ModelMap modelo) {
       
        try {
            serviciosEditorial.crearEditorial(nombre);
            
            modelo.put("exito", "El Editorial fue cargado correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            Logger.getLogger(EditorialControlador.class.getName()).log(Level.SEVERE, null, ex);
            
            return "editorial_form.html";
        }
     

        return "index.html";
    }
    
        @GetMapping("/lista")
    public String listar(ModelMap modelo){
    
        List<Editorial> editoriales = serviciosEditorial.listarEditorial();
    
        modelo.addAttribute("editoriales", editoriales);
        
        return "editorial_list.html";
        
    }
    
        @GetMapping("/modificar/{id}") //De esta manera vienen los datos precargados
    public String modificar(@PathVariable String id, ModelMap modelo){
        modelo.put("editorial", serviciosEditorial.getOne(id));
        return "editorial_modificar.html";
    }
    
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo){
        try {
            serviciosEditorial.modificarEditorial(id, nombre);     
            
            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "Editorial_modificar.html";
        }
    }
    

}


