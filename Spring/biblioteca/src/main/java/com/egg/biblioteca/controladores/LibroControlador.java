/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.servicios.ServiciosAutor;
import com.egg.biblioteca.servicios.ServiciosEditorial;
import com.egg.biblioteca.servicios.ServiciosLibro;
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
@RequestMapping("/libro") //localhost:8080/libro
public class LibroControlador {

    @Autowired
    private ServiciosLibro serviciosLibro;
    @Autowired
    private ServiciosAutor serviciosAutor;
    @Autowired
    private ServiciosEditorial serviciosEditorial;

    @GetMapping("/registrar")
    public String registrar(ModelMap modelo) {
        List<Autor> autores = serviciosAutor.listarAutores();
        List<Editorial> editoriales = serviciosEditorial.listarEditorial();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    @PostMapping("/registro") //En todos los metodos que exista un RequestParam se utiliza el required = false para 
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares,
            @RequestParam(required = false) String idAutor, @RequestParam(required = false) String idEditorial, ModelMap modelo) {

        try {
            serviciosLibro.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);

            modelo.put("exito", "El libro fue cargado correctamente");

        } catch (MiException ex) {
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, ex);
            List<Autor> autores = serviciosAutor.listarAutores();
            List<Editorial> editoriales = serviciosEditorial.listarEditorial();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());
            return "libro_form.html";
        }

        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = serviciosLibro.listarLibros();
        modelo.addAttribute("librs", libros);

        return "libro_list.html";
    }

    @GetMapping("/modificar/{isbn}") //De esta manera vienen los datos precargados
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
        modelo.put("libro", serviciosLibro.getOne(isbn));

        List<Autor> autores = serviciosAutor.listarAutores();
        List<Editorial> editoriales = serviciosEditorial.listarEditorial();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        modelo.put("exito", "El libro fue cargado correctamente");

        return "libro_modificar.html";
    }

    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable @RequestParam(required = false) Long isbn, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares,
            @RequestParam(required = false) String idAutor, @RequestParam(required = false) String idEditorial, ModelMap modelo) {
        try {
            
            List<Autor> autores = serviciosAutor.listarAutores();
            List<Editorial> editoriales = serviciosEditorial.listarEditorial();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            serviciosLibro.modificarLibro(isbn, titulo, idAutor, idEditorial, ejemplares);

            return "redirect:../lista";
        } catch (MiException ex) {
            List<Autor> autores = serviciosAutor.listarAutores();
            List<Editorial> editoriales = serviciosEditorial.listarEditorial();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());
            
            return "libro_modificar.html";
        }
    }

}
