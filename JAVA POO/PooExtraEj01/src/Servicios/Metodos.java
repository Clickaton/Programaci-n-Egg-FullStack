/*
1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos { 
    Cancion c1 = new Cancion();
    Scanner leer = new Scanner(System.in);
    
    
    public void pedirYMostrarDatos(){
        System.out.println("Ingrese el título de la canción:");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de " + c1.getTitulo());
        c1.setAutor(leer.nextLine());
        
    }
    
}
