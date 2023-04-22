/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class JpaPrueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

         //Creación de la carrera:
         LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
         
        Carrera carrera = new Carrera("Tectnicatura en Matemática", listaMaterias);
        //Guardado de la carrera en BD:
        control.crearCarrera(carrera);

        //Creación de alumno con carrera
        Alumno alu = new Alumno("Christian", "Martinez", carrera, new Date());
        //Guardado de la carrera en BD
        control.crearAlumno(alu);
        
        //Creación Materias:
        Materia mat = new Materia("Lógica", "cuatrimestral");
        Materia mat1 = new Materia("Pensamiento científico", "cuatrimestral");
        Materia mat2 = new Materia("Algebra", "Anual");
        //Guardado en BD:
        control.crearMateria(mat);
        control.crearMateria(mat1);
        control.crearMateria(mat2);
        
        //Creamos lista de materias y las agregamos
        
        listaMaterias.add(mat);
        listaMaterias.add(mat1);
        listaMaterias.add(mat2);
        
       

        //Vemos el resultado por pantalla:
        System.out.println("-----------Lista de Alumnos:----------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();

        for (Alumno listaAlumno : listaAlumnos) {
            System.out.println("El alumno es: " + listaAlumno.toString());
            System.out.println("El alumno: " + alu.getNombre() + " " + alu.getApellido() + " cursa la materia de: " + alu.getCarre().getNombre());
        }
        System.out.println("-----------Lista de Carreras:----------");
        ArrayList<Carrera> listaCarreras = control.traerListaCarreras();

        for (Carrera listaCarrera : listaCarreras) {
            System.out.println("La carrera es: " + listaCarrera.toString());
        }
        System.out.println("-------------------------------------");

//       
////       control.eliminarAlumno(1);
//
//        alu.setApellido("Pichicho y Adara");
//        control.editarAlumno(alu);
//   Alumno alu = control.traerAlumno(4);
//        System.out.println("---------Busqueda INDIVIDUAL----------");
//        System.out.println("El alumno es: " + alu);      
//   
//        System.out.println("-----------Busqueda de TODOS----------");
//        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
//        
//        for (Alumno listaAlumno : listaAlumnos) {
//            System.out.println("El alumno es: " + listaAlumno.toString());
//        }
//        System.out.println("----------------------------");
    }
}
