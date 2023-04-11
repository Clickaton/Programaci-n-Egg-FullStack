/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.EditorialJpaController;
import com.mycompany.ejercicio1_jpa_dos.CRUD.LibroJpaController;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Autor;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Editorial;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class servicioLibro {

    Scanner sc = new Scanner(System.in);
    private LibroJpaController libcrud = new LibroJpaController();
    private servicioAutor servicioAutor = new servicioAutor();
    private EditorialJpaController editcrud = new EditorialJpaController();
    private servicioEditorial servicioEditorial = new servicioEditorial();

    List<Editorial> listaEditoriales = new ArrayList();
    List<Libro> listaLibros = new ArrayList();
    List<Autor> listaAutores = new ArrayList();

    /////// Crear
    public void crearLibro() {
        try {
            servicioAutor.findAutoresList();
            servicioEditorial.findEditorialesList();
            listaAutores = servicioAutor.listaAutores;
            listaEditoriales = servicioEditorial.listaEditoriales;
            Libro libro1 = new Libro("Cien Años de Soledad", 1967, 200, 190, 10, Boolean.TRUE, listaAutores.get(0), listaEditoriales.get(0));
            libcrud.create(libro1);
            listaLibros.add(libro1);
            Libro libro2 = new Libro("El señor de Las Moscas", 1954, 150, 100, 50, Boolean.TRUE, listaAutores.get(1), listaEditoriales.get(1));
            libcrud.create(libro2);
            listaLibros.add(libro2);
            Libro libro3 = new Libro("Crímen y Castigo", 1866, 100, 70, 30, Boolean.TRUE, listaAutores.get(2), listaEditoriales.get(2));
            libcrud.create(libro3);
            listaLibros.add(libro3);
        } catch (Exception e) {
        }
    }
    
    public void findLibrosList() {
        listaLibros = libcrud.findLibroEntities();
    }

    public void borrarLibro(int id) {
        try {
            Libro libro = libcrud.find(id);
            if (libro != null) {
                libro.setAlta(Boolean.FALSE);
                listaLibros.remove(libro);
                libcrud.delete(libro);
            } else {
                System.out.println("El autor con el ID " + id + " no existe ");
            }
        } catch (Exception e) {
            System.out.println("Error al borrar el autor");
        }
    }

    public void editarLibro(int isbn) {
        try {
            Libro libro = libcrud.find(isbn);
            if (libro != null) {
                System.out.println("Cuál es el nuevo nombre del libro?");
                String nombre = sc.nextLine();
                libro.setTitulo(nombre);
                System.out.println("Cuál es el nuevo año del libro ?");
                int anio = sc.nextInt();
                libro.setAnio(anio);
                System.out.println("A cuántos ejemplares desea actualizar?");
                int ejemplares = sc.nextInt();
                libro.setEjemplares(ejemplares);
                System.out.println("Actualizar ejemplares prestados?");
                int ejemplaresPrestadosd = sc.nextInt();
                libro.setEjemplaresPrestados(ejemplaresPrestadosd);
                System.out.println("Actualizar ejemplares restantes?");
                int ejemplaresRestantes = sc.nextInt();
                libro.setEjemplaresRestantes(ejemplaresRestantes);
                /*System.out.println("Cuál es el isbn del libro que desea cambiar?");
                int libroisbn = sc.nextInt();
                sc.nextLine();
                List<Libro> listaLibros = editorial.getLibros();
                for (Libro libro : listaLibros) {
                    if (libro.getIsbn()== libroisbn) {
                        System.out.println("Cuál es el nuevo isbn del libro?");
                        int nuevoId = sc.nextInt();
                        sc.nextLine();
                        libro.setIsbn(nuevoId);
                        libcrud.update(libro);
                        break;
                    }
                }*/
                libcrud.update(libro);
            } else {
                System.out.println("El libro con el ISBN " + isbn + " no existe.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar la editorial.");
        }
    }

    public void libroIsbn() {
        System.out.println("Ingrese el isbn del libro que desea consultar");
        Integer isbn = sc.nextInt();
        List<Libro> librosEncontrados = libcrud.libroIsbn(isbn);
        if (!librosEncontrados.isEmpty()) {
            Libro libroEncontrado = librosEncontrados.get(0);
            System.out.println("El libro solicitado tiene los siguientes datos:");
            System.out.println(libroEncontrado.toString());
        } else {
            System.out.println("No se ha encontrado el libro en la tabla");
        }
    }
    
    public void libroTitulo() {
        System.out.println("Ingrese el título del libro que desea consultar");
        String titulo = sc.next();
        List<Libro> librosEncontrados = libcrud.libroTitulo(titulo);
        if (!librosEncontrados.isEmpty()) {
            Libro libroEncontrado = librosEncontrados.get(0);
            System.out.println("El libro solicitado tiene los siguientes datos:");
            System.out.println(libroEncontrado.toString());
        } else {
            System.out.println("No se ha encontrado el libro en la tabla");
        }
    }
    
    public void libroAutor() {
        System.out.println("Indique el nombre del autor y desplegaremos los libros que tiene asociados");
        String nombre = sc.nextLine();
        List<Libro> librosEncontrados = libcrud.libroAutor(nombre);
        if (!librosEncontrados.isEmpty()) {
            Libro libroEncontrado = librosEncontrados.get(0);
            System.out.println("El autor tiene los siguientes libros asociados");
            System.out.println(libroEncontrado.toString());
        } else {
            System.out.println("No se ha encontrado ese autor en la tabla");
        }
    }
    
     public void libroEditorial() {
        System.out.println("Indique el nombre de la editorial y desplegaremos los libros que tiene asociados");
        String nombre = sc.nextLine();
        List<Libro> librosEncontrados = libcrud.libroEditorial(nombre);
        if (!librosEncontrados.isEmpty()) {
            Libro libroEncontrado = librosEncontrados.get(0);
            System.out.println("La editorial tiene los siguientes libros asociados");
            System.out.println(libroEncontrado.toString());
        } else {
            System.out.println("No se ha encontrado esa editorial en la tabla");
        }
    }
}
