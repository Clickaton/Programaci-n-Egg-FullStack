/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicios;

import Entidades.RazasPerros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    RazasPerros r1 = new RazasPerros();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> razas = new ArrayList();
    //Iterator<String> it = razas.iterator();
    

    public void crearRaza() {

        System.out.println("Ingrese la raza del perro:");
        r1.setRaza(leer.next());
        razas.add(r1.getRaza());

    }

    public void mostrarRaza() {

        for (String aux : razas) {
            System.out.println(aux);

        }
    }
    
    public void eliminarRaza(){
    
         //Se debe crear el iterador de forma local y no global sino tira error.
         Iterator<String> it = razas.iterator();
        System.out.println("Ingrese la raza que desea eliminar:");
        String rta = leer.next();
       while (it.hasNext()){
           String aux = it.next();
           if (aux.equalsIgnoreCase(rta)) {
               it.remove();
           }
       }
    
    }

    public void menu() {
        int opcion;

        do {

            System.out.println("MENU");
            System.out.println("01. Crear Raza");
            System.out.println("02. Eliminar raza");
            System.out.println("03. Salir");

            opcion = leer.nextInt();
            if (opcion != 1 && opcion != 2 && opcion!=3) {
                System.out.println("Por favor ingrese una opción correcta.");
                continue;
            } else {
                switch (opcion) {

                    case 1:
                        crearRaza();
                        break;
                    case 2:
                        eliminarRaza();
                        break;
                    case 3:
                        mostrarRaza();
                        break;    
                }
            }
        } while (opcion != 3);
    }
}
