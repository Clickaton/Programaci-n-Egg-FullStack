/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.EditorialJpaController;
import com.mycompany.ejercicio1_jpa_dos.CRUD.LibroJpaController;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Editorial;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class servicioEditorial {

    Scanner sc = new Scanner(System.in);
    private LibroJpaController libcrud = new LibroJpaController();
    private EditorialJpaController editcrud = new EditorialJpaController();

    List<Editorial> listaEditoriales = new ArrayList();
    List<Libro> listaLibros = new ArrayList();

    public void findEditorialesList() {
        listaEditoriales = editcrud.findEditorialEntities();
    }

    /////// Crear
    public void crearEditorial() {
        try {
            Editorial editorial1 = new Editorial("Planeta", Boolean.TRUE, listaLibros);
            editcrud.create(editorial1);
            listaEditoriales.add(editorial1);
            Editorial editorial2 = new Editorial("Santillana", Boolean.TRUE, listaLibros);
            editcrud.create(editorial2);
            listaEditoriales.add(editorial2);
            Editorial editorial3 = new Editorial("Torre de Papel", Boolean.TRUE, listaLibros);
            editcrud.create(editorial3);
            listaEditoriales.add(editorial3);
        } catch (Exception e) {
        }
    }

    public void borrarEditorial(int id) {
        try {
            Editorial editorial = editcrud.find(id);
            if (editorial != null) {
                editorial.setAlta(Boolean.FALSE);
                listaEditoriales.remove(editorial);
                editcrud.delete(editorial);
                listaLibros = editorial.getLibros();
                for (Libro list : listaLibros) {
                    list.setEditorial(null);
                    libcrud.update(list);
                }
            } else {
                System.out.println("La editorial con el ID " + id + " no existe ");
            }
        } catch (Exception e) {
            System.out.println("Error al borrar la editorial.");
        }
    }

    public void editarEditorial(int id) {
        try {
            Editorial editorial = editcrud.find(id);
            if (editorial != null) {
                System.out.println("Cuál es el nuevo nombre de la editorial?");
                String nombre = sc.nextLine();
                editorial.setNombre(nombre);
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
                editcrud.update(editorial);
            } else {
                System.out.println("La editorial con el ID " + id + " no existe.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar la editorial.");
        }
    }
}
