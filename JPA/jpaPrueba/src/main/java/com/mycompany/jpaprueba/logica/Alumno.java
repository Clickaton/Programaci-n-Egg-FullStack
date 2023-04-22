/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author chris
 */

@Entity
public class Alumno implements Serializable {
@Id    
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    @OneToOne
    private Carrera carre;

@Temporal(TemporalType.DATE)    
    private Date fechaNac;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Carrera carre, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carre = carre;
        this.fechaNac = fechaNac;
    }

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", carre=" + carre + ", fechaNac=" + fechaNac + '}';
    }


    
    
    
}
