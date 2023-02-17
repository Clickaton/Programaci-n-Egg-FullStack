/*
 4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.utilidades.Comparadores;
import static Entidades.utilidades.Comparadores.ordenarLista;
import static Entidades.utilidades.Comparadores.ordenarListaAlfa;
import static Entidades.utilidades.Comparadores.ordenarListaAlfaDirector;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author chris
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {
        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el título de la película:");
        p1.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del director:");
        p1.setDirector(leer.next());

        System.out.println("Ingrese la duración de la película en horas:");
        p1.setDuracion(leer.nextDouble());

        peliculas.add(p1);
        menu();
        return p1;
    }

    public void mostrarPelicula() {
        System.out.println("Las películas ingresadas son:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("El título de la película es: " + pelicula.getTitulo());
            System.out.println("El director de la película es: " + pelicula.getDirector());
            System.out.println("La duración de la película es: " + pelicula.getDuracion());
            System.out.println("");
        }
    }

    public void mayor1Hora() {
        Iterator<Pelicula> it = peliculas.iterator();
        System.out.println("películas de duración mayor a 1 hs:");
        while (it.hasNext()) { //Iterator toma la lista, desarma los objetos y los da en una fila para recorrerlos.
            Pelicula next = it.next();

            if (next.getDuracion() > 1) {
                System.out.println("El título de la película es: " + next.getTitulo());
                System.out.println("El director de la película es: " + next.getDirector());
                System.out.println("La duración de la película es: " + next.getDuracion());
                System.out.println("");
            }
        }

    }

    public void mayorAmenor() {
         Collections.sort(peliculas, Collections.reverseOrder(ordenarLista)); //De esta forma se hace la lista inversa.
        System.out.println("Orden de mayor a menor duración:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("El título de la película es: " + pelicula.getTitulo());
            System.out.println("El director de la película es: " + pelicula.getDirector());
            System.out.println("La duración de la película es: " + pelicula.getDuracion());
            System.out.println("");
        }
    }

    public void menorAmayor() {
        Collections.sort(peliculas, ordenarLista);//Ordeno la Lista de menor a mayor por su duración //Acordarse de importar la libreria
        System.out.println("Orden de menor a mayor duración:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("El título de la película es: " + pelicula.getTitulo());
            System.out.println("El director de la película es: " + pelicula.getDirector());
            System.out.println("La duración de la película es: " + pelicula.getDuracion());
            System.out.println("");

        }
    }

    public void ordenarAlfaTitulo() { ////Acordarse de importar la libreria // ordeno la lista por titulos alfabeticamente.
        Collections.sort(peliculas, ordenarListaAlfa);
        System.out.println("Orden por título alfabeticamente:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("El título de la película es: " + pelicula.getTitulo());
            System.out.println("El director de la película es: " + pelicula.getDirector());
            System.out.println("La duración de la película es: " + pelicula.getDuracion());
            System.out.println("");
        }
    }

    public void ordenarAlfaDirector() {
        Collections.sort(peliculas, ordenarListaAlfaDirector);
        System.out.println("Orden por director alfabeticamente:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("El título de la película es: " + pelicula.getTitulo());
            System.out.println("El director de la película es: " + pelicula.getDirector());
            System.out.println("La duración de la película es: " + pelicula.getDuracion());
            System.out.println("");
        }
    }

    public void menu() {

        System.out.println("¿Desea agregar otra película?");
        int respuesta;
        System.out.println("");
        System.out.println("---------MENU---------");
        System.out.println("01. Si");
        System.out.println("02. No");
        respuesta = leer.nextInt();

        switch (respuesta) {
            case 1:
                crearPelicula();
                break;
            case 2:
                break;
            default:
                System.out.println("Por favor ingrese una respuesta válida dentro del rango.");
                menu();
        }
        do { //El do siempre va arriba del MENU
            System.out.println("---------MENU---------");
            System.out.println("01. Mostrar películas.");
            System.out.println("02. Mostrar películas de duración mayor a 1 hs");
            System.out.println("03. Ordenar Lista de mayor a menor duración.");
            System.out.println("04. Ordenar Lista de menor a mayor duración.");
            System.out.println("05. Ordenar Lista por títulos Alfabeticamente");
            System.out.println("06. Ordenar Lista por autor Alfabeticamente.");
            System.out.println("07. Salir.");
            respuesta = leer.nextInt();
            /**
             * ordenar peliculas por titulo, alfabeticamente y print. ordenar
             * peliculas por director alfa y print*
             */

            switch (respuesta) {
                case 1:
                    mostrarPelicula();
                    break;
                case 2:
                    mayor1Hora();
                    break;
                case 3:
                    mayorAmenor();
                    break;
                case 4:
                    menorAmayor();
                    break;
                case 5:
                    ordenarAlfaTitulo();
                    break;
                case 6:
                    ordenarAlfaDirector();
                    break;
                case 7:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Por favor ingrese una respuesta válida dentro del rango.");
            }
        } while (respuesta != 7);
    }

}
