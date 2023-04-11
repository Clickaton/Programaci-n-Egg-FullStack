/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.EditorialJpaController;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Servicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    int opcion;
    servicioAutor sAutor = new servicioAutor();
    private EditorialJpaController editcrud = new EditorialJpaController();
    private servicioEditorial sEditorial = new servicioEditorial();
    private servicioLibro sLibro = new servicioLibro();
    private servicioPrestamo sPrestamo = new servicioPrestamo();
    private servicioCliente sCliente = new servicioCliente();

    public void Menu() {
        do {
            System.out.println("============= MENÚ ====================");
            System.out.println(" Ingrese la consulta que desea ejecutar ");
            System.out.println("1. Crear un autor ");
            System.out.println("2. Crear una editorial ");
            System.out.println("3. Crear un libro (Debe existir de antemano un autor y una editorial) ");
            System.out.println("4. Borrar un autor ");
            System.out.println("5. Borrar una editorial ");
            System.out.println("6. Borrar un libro ");
            System.out.println("7. Editar un autor ");
            System.out.println("8. Editar una editorial ");
            System.out.println("9. Editar un libro");
            System.out.println("10. Búsqueda de un Autor por nombre ");
            System.out.println("11. Búsqueda de un libro por ISBN ");
            System.out.println("12. Búsqueda de un libro por Título ");
            System.out.println("13. Búsqueda de un libro/s por nombre de Autor ");
            System.out.println("14. Búsqueda de un libro/s por nombre de Editorial ");
            System.out.println("15. Crear un cliente ");
            System.out.println("16. Crear un préstamo (Deebe existir un cliente creado de antemano ");
            System.out.println("17. Prestar un libro");
            System.out.println("18. Devolver un libro");
            System.out.println("19. Consultar préstamos de un cliente");
            System.out.println("20. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sAutor.crearAutor();
                    break;
                case 2:
                    sEditorial.crearEditorial();
                    break;
                case 3:
                    sLibro.crearLibro();
                    break;
                case 4:
                    System.out.print("Ingrese el ID del autor que desea eliminar: ");
                    int id_autor = sc.nextInt();
                    sAutor.borrarAutor(id_autor);
                    System.out.println("Autor eliminado con éxito.");
                    break;
                case 5:
                    System.out.print("Ingrese el ID de la editorial que desea eliminar: ");
                    int id_edit = sc.nextInt();
                    sEditorial.borrarEditorial(id_edit);
                    System.out.println("Editorial eliminada con éxito.");
                    break;
                case 6:
                    System.out.print("Ingrese el ID del libro que desea eliminar: ");
                    int id_lib = sc.nextInt();
                    sLibro.borrarLibro(id_lib);
                    System.out.println("Libro eliminado con éxito.");
                    break;
                case 7:
                    System.out.print("Ingrese el ID del autor que desea editar: ");
                    int id_autor1 = sc.nextInt();
                    sAutor.editarAutor(id_autor1);
                    System.out.println("Autor editado con éxito.");
                    break;
                case 8:
                    System.out.print("Ingrese el ID de la editorial que desea editar: ");
                    int id_edit1 = sc.nextInt();
                    sEditorial.editarEditorial(id_edit1);
                    System.out.println("Editorial editada con éxito.");
                    break;
                case 9:
                    System.out.print("Ingrese el ID del libro que desea editar: ");
                    int id_lib1 = sc.nextInt();
                    sLibro.editarLibro(id_lib1);
                    System.out.println("Libro editado con éxito.");
                    break;
                case 10:
                    sAutor.autorNombre();
                    break;
                case 11:
                    sLibro.libroIsbn();
                    break;
                case 12:
                    sLibro.libroTitulo();
                    break;
                case 13:
                    sLibro.libroAutor();
                    break;
                case 14:
                    sLibro.libroEditorial();
                    break;
                case 15:
                    sCliente.crearCliente();
                    break;
                case 16:
                    sPrestamo.crearPrestamo();
                    break;
                case 17:
                    System.out.print("Ingrese el ISBN del libro que desea prestar: ");
                    int isbn_libro = sc.nextInt();
                    sPrestamo.prestarLibro(isbn_libro);
                    break;
                case 18:
                    System.out.print("Ingrese el ID del préstamo que desea devolver: ");
                    int id_prestamo = sc.nextInt();
                    sPrestamo.devolverLibro(id_prestamo);
                    break;
                case 19:
                    sPrestamo.prestamosClientes();
                    break;    
                case 20:
                    System.out.println("Ha salido con éxito");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 20);
    }
}
