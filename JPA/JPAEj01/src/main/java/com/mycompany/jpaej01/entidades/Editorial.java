/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaej01.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author chris
 */
@NamedQueries({
@NamedQuery(name="Editorial.findAll", query="SELECT a FROM Editorial a"),
@NamedQuery(name="Editorial.findById", query= "SELECT a from Editorial a.id = :id") 
})
@Entity
public class Editorial implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Basic //No es obligatorio (Es para mostrar que no posee nada importante)
    private String nombre;
    private Boolean alta;
    @OneToMany(mappedBy = "editorial")
    private ArrayList<Libro> libro;
    
//@Temporal(TemporalType.DATE) para trabajar con fechas.

    public Editorial() {
    }

    public Editorial(String nombre, Boolean alta, ArrayList<Libro> libro) {
        this.nombre = nombre;
        this.alta = alta;
        this.libro = libro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }

    
    
}
