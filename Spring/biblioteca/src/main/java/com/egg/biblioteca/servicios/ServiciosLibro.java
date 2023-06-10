/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.Date;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author chris
 */
@Service
public class ServiciosLibro {

    @Autowired //Comunicación con Spring para traer info y ahorrar código
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional //Cuando un método modifica la base de datos se le agrega Transactional.
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Libro libro = new Libro();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get(); //.get Transforma el tipo optional a Editorial
        Autor autor = autorRepositorio.findById(idAutor).get();
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);

        libro.setAlta(new Date());

        libroRepositorio.save(libro);

    }

    public List<Libro> listarLibros() {
        List<Libro> listaLibros = new ArrayList();
        listaLibros = libroRepositorio.findAll();
        return listaLibros;
    }

    @Transactional
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares) throws MiException {

        validar(isbn, titulo, ejemplares, idAutor, idEditorial);

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Editorial editorial = new Editorial();
        Autor autor = new Autor();

        if (respuestaEditorial.isPresent()) {
            editorial = respuestaEditorial.get();
        }

        if (respuestaAutor.isPresent()) {
            autor = respuestaAutor.get();
        }

        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setEjemplares(ejemplares);
            libro.setTitulo(titulo);
            libro.setEditorial(editorial);
            libro.setAutor(autor);
            libroRepositorio.save(libro);
        }       
    }
    
      @Transactional
  public void eliminarLibro(Long isbn) throws MiException {
    Optional<Libro> respuesta = libroRepositorio.findById(isbn);

    if (respuesta.isPresent()) {
      Libro libro = respuesta.get();
      libroRepositorio.delete(libro);
    } else {
      throw new MiException("El libro no existe");
    }
  }
    
    public Libro getOne(Long isbn){
        return libroRepositorio.getOne(isbn);
    }     

private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException {
    if (isbn == null) {
        throw new MiException("El isbn no puede ser nulo ni estar vacío");
    }
    if (titulo == null || titulo.isEmpty()) {
        throw new MiException("El título no puede ser nulo ni estar vacío");
    }
    if (ejemplares == null) {
        throw new MiException("Ejemplares no puede ser nulo");
    }
    if (idAutor == null || idAutor.isEmpty()) {
        throw new MiException("El autor no puede ser nulo ni estar vacío");
    }
    if (idEditorial == null || idEditorial.isEmpty()) {
        throw new MiException("El editorial no puede ser nulo ni estar vacío");
    }
  
    }
}
