/*
 5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Entidades.Pais;
import java.util.*;


/**
 *
 * @author chris
 */
public class ServicioPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> paises = new TreeSet();

    public Pais ingresarPais() {
        //Nacimiento del objeto\\
        Pais p1 = new Pais();

        //Carga de atributo\\
        System.out.println("Ingrese el nombre del pais:");
        paises.add((leer.next()));
        
        
        System.out.println("¿Desea ingresar otro pais? S/N");
        String respuesta = leer.next().toUpperCase(); //Convierto respuesta a mayuscula
        do {
            if (respuesta.equals("S")) {
                ingresarPais();
            } else if (respuesta.equals("N")) {
                mostrarPaises(new Pais());
                break;
            } else {
                System.out.println("Por favor ingrese una respuesta valida.");
                System.out.println("¿Desea ingresar otro pais? S/N");
                respuesta = leer.next().toUpperCase(); //Convierto respuesta a mayuscula
            }
        } while (!"S".equals(respuesta) || (!"N".equals(respuesta)));

        p1.setPais(paises);
        return p1;
    }

//    public void compararPaises() {
//        //Iterator it = new Iterator();
//        Collections.sort(paises, cmprtr);

//    }

    public void mostrarPaises(Pais p1) {
         
        System.out.println("Los paises son: ");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }


}
