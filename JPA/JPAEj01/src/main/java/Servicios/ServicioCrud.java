/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import CRUD.*;
import com.mycompany.jpaej01.entidades.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class ServicioCrud {

    Scanner leer = new Scanner(System.in);

    public void menu() {

        int opc;

        do {
            System.out.println("///////////Menu///////////");
            System.out.println("1.       Crear");
            System.out.println("2.       Actualizar");
            System.out.println("3.       Mostrar");
            System.out.println("4.       Borrar");
            System.out.println("5.       Salir.");
            System.out.print("Seleccione una opción: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    do {
                        System.out.println("Ha seleccionado la opción Crear. ¿Qué entidad desea crear?");
                        System.out.println("1.       Autor");
                        System.out.println("2.       Editorial");
                        System.out.println("3.       Libro");
                        opc = leer.nextInt();

                        switch (opc) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Selección no válida. Intente de nuevo.");
                        }

                    } while (opc != 1 || opc != 2 || opc != 3);
                    break;
                case 2:
                    do {
                        System.out.println("Ha seleccionado la opción Actualizar. ¿Qué entidad desea actualizar?");
                        System.out.println("1.       Autor");
                        System.out.println("2.       Editorial");
                        System.out.println("3.       Libro");
                        opc = leer.nextInt();

                        switch (opc) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Selección no válida. Intente de nuevo.");
                        }

                    } while (opc != 1 || opc != 2 || opc != 3);
                    break;
                case 3:
                                       do {
                        System.out.println("Ha seleccionado la opción Mostrar. ¿Qué entidad desea Mostrar?");
                        System.out.println("1.       Autor");
                        System.out.println("2.       Editorial");
                        System.out.println("3.       Libro");
                        opc = leer.nextInt();
                        
                        switch (opc) {
                            case 1:
                                
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Selección no válida. Intente de nuevo.");
                        }

                    } while (opc != 1 || opc != 2 || opc != 3);
                    break;
                case 4:
                                        do {
                        System.out.println("Ha seleccionado la opción Eliminar. ¿Qué entidad desea eliminar?");
                        System.out.println("1.       Autor");
                        System.out.println("2.       Editorial");
                        System.out.println("3.       Libro");
                        opc = leer.nextInt();
                        
                        switch (opc) {
                            case 1:
                                
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Selección no válida. Intente de nuevo.");
                        }

                    } while (opc != 1 || opc != 2 || opc != 3);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Selección no válida. Intente de nuevo.");
                    break;
            }
        } while (opc != 5);

    }

    public Libro crearLibro() {
        Libro libro = new Libro();
        System.out.println("Ingrese el nombre del libro:");
        String título = leer.next();
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt();
        System.out.println("Ingrese el número de ejemplares:");
        int ejemplares = leer.nextInt();
        System.out.println("Ingrese el número de ejemplares prestados:");
        int ejemplaresPrestados = leer.nextInt();
        libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
        System.out.println("Ingrese el ID del Autor");
        LibroCrud lc = new LibroCrud();
        
        
        return null;
    }

}
