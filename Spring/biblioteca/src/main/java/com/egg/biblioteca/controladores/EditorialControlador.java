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
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


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
    public String listar(ModelMap modelo) {

        List<Editorial> editoriales = serviciosEditorial.listarEditorial();

        modelo.addAttribute("editoriales", editoriales);

        return "editorial_list.html";

    }

    @GetMapping("/modificar/{id}") //De esta manera vienen los datos precargados
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("editorial", serviciosEditorial.getOne(id));
        return "editorial_modificar.html";
    }

    @PostMapping("/modificacion/{id}")
    public String modificar(@PathVariable String id, @RequestParam(required = false) String nombre, ModelMap modelo) {
        try {
            System.out.println(nombre);
            serviciosEditorial.modificarEditorial(id, nombre);
            modelo.put("exito", "El Editorial fue cargado correctamente");
            modelo.put("editorial", serviciosEditorial.getOne(id));
            return "editorial_modificar.html";
        } catch (MiException ex) {
            modelo.put("editorial", serviciosEditorial.getOne(id)); //Necesario mandar el objeto para que lo encuentre.
            modelo.put("error", ex.getMessage());
            return "editorial_modificar.html";
        }
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo){
        try {
            serviciosEditorial.eliminarEditorial(id);
            modelo.put("exito", "La editorial fue eliminada correctamente");
            return "redirect:/editorial/lista";
        }catch (DataIntegrityViolationException ex) {
            modelo.put("error", "No se puede eliminar la editorial porque existen libros asociados a ella, debe eliminar primero el libro asociado.");
            return "editorial_modificar.html";
        }
    }

}
