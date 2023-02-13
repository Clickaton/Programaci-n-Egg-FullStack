/*
 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicios;

import Entidades.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class servicioPerro {
    
    Scanner leer = new Scanner(System.in);
    
     public Perro crearPerro() {

        Perro p = new Perro();

        System.out.println("Ingrese el nombre de su perro");

        p.setNombre(leer.next());

        System.out.println("Ingrese la raza de su perro");

        p.setRaza(leer.next());

        System.out.println("Ingrese el tamaño de su perro (Pequeño/Mediano/Grande)");

        p.setTamaño(leer.next());

        System.out.println("Ingrese la edad de su perro");

        p.setEdad(leer.nextInt());

        return p;
    }
     
     
    
}
