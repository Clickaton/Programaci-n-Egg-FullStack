/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class servicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final servicioPerro Servp = new servicioPerro(); //finales solo se usan en aquellos valores que sabemos de antemano que no van a variar, o sea, que permanecerán constantes durante la ejecución del programa.

    public Persona crearPersona() {

        Persona p = new Persona();

        System.out.println("Ingrese su nombre");

        p.setNombre(leer.next());

        System.out.println("Ingrese su apellido");

        p.setApellido(leer.next());

        System.out.println("Ingrese su edad");

        p.setEdad(leer.nextInt());

        System.out.println("Ingrese su documento");

        p.setDocumento(leer.next());

        System.out.println("-------Ingrese los datos de su mascota-------");

        p.setPerro(Servp.crearPerro());

        return p;
    }
}
