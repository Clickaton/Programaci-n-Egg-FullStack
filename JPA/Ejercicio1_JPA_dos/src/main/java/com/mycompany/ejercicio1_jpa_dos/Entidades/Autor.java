/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Julian_Velasco
 */
@Entity
public class Autor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Boolean alta;

    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
    private List<Libro> libros;

    public Autor() {
        this.alta = true;
    }

    public Autor(String nombre, Boolean alta, List<Libro> libros) {
        this.nombre = nombre;
        this.alta = alta;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String librosStr = "";
        for (Libro libro : libros) {
            librosStr += "\n" + libro.getTitulo();
        }
        return "Autor [id=" + id + ", nombre=" + nombre + ", alta=" + alta + "]"
                + "\nLibros asociados:" + librosStr;
    }

}
