/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.AutorJpaController;
import com.mycompany.ejercicio1_jpa_dos.CRUD.LibroJpaController;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Autor;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class servicioAutor {

    Scanner sc = new Scanner(System.in);
    private AutorJpaController autorcrud = new AutorJpaController();
    private LibroJpaController libcrud = new LibroJpaController();

    List<Autor> listaAutores = new ArrayList();
    List<Libro> listaLibros = new ArrayList();

    public void findAutoresList() {
        listaAutores = autorcrud.findAutorEntities();
    }

    /////// Crear
    public void crearAutor() {
        try {
            Autor autor1 = new Autor("Gabriel García Márquez", Boolean.TRUE, listaLibros);
            autorcrud.create(autor1);
            listaAutores.add(autor1);
            Autor autor2 = new Autor("William Golding", Boolean.TRUE, listaLibros);
            autorcrud.create(autor2);
            listaAutores.add(autor2);
            Autor autor3 = new Autor("Fiódor Dostoyevski ", Boolean.TRUE, listaLibros);
            autorcrud.create(autor3);
            listaAutores.add(autor3);
        } catch (Exception e) {
        }
    }

    public void borrarAutor(int id) {
        try {
            Autor autor = autorcrud.find(id);
            if (autor != null) {
                autor.setAlta(Boolean.FALSE);
                listaAutores.remove(autor);
                autorcrud.delete(autor);
                listaLibros = autor.getLibros();
                for (Libro list : listaLibros) {
                    list.setAutor(null);
                    libcrud.update(list);
                }
            } else {
                System.out.println("El autor con el ID " + id + " no existe ");
            }
        } catch (Exception e) {
            System.out.println("Error al borrar el autor");
        }
    }

    public void editarAutor(int id) {
        try {
            Autor autor = autorcrud.find(id);
            if (autor != null) {
                System.out.println("Cuál es el nuevo nombre del autor?");
                String nombre = sc.nextLine();
                autor.setNombre(nombre);
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
                autorcrud.update(autor);
            } else {
                System.out.println("El autor con el ID " + id + " no existe ");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar el autor ");
        }
    }

    public void autorNombre() {
        System.out.println("Ingrese el nombre del autor que desea encontrar");
        String nombreAutor = sc.nextLine();
        List<Autor> autoresEncontrados = autorcrud.autorNombre(nombreAutor);
        if (!autoresEncontrados.isEmpty()) {
            Autor autorEncontrado = autoresEncontrados.get(0);
            System.out.println("El autor solicitado tiene los siguientes datos:");
            System.out.println(autorEncontrado.toString());
        } else {
            System.out.println("No se ha encontrado el autor en la tabla");
        }
    }
}
