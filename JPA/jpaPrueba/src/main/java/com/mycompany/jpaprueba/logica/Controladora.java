/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.exceptions.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author chris
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Alumno
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }

    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    }

    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();
    }

    //Carrera
    
    
    public void crearCarrera(Carrera car) {
        controlPersis.crearCarrera(car);
    }

    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera car) {
        controlPersis.editarCarrera(car);
    }

    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        return controlPersis.traerListaCarreras();
    }

    //Materia
    
    
    public void crearMateria(Materia mat) {
        controlPersis.crearMateria(mat);
    }

    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }

    public void editarMateria(Materia mat) {
        controlPersis.editarMateria(mat);
    }

    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        return controlPersis.traerListaMaterias();
    }

}
