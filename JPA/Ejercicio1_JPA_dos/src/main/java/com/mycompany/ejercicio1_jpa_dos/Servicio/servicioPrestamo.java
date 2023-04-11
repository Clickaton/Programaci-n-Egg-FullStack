/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.ClienteJpaController;
import com.mycompany.ejercicio1_jpa_dos.CRUD.PrestamoJpaController;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Cliente;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Prestamo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class servicioPrestamo {

    Scanner sc = new Scanner(System.in);
    PrestamoJpaController precrud = new PrestamoJpaController();
    ClienteJpaController clicrud = new ClienteJpaController();
    servicioLibro sLibro = new servicioLibro();
    servicioCliente sCliente = new servicioCliente();
    List<Libro> listaLibros = new ArrayList();
    List<Prestamo> listaPrestamos = new ArrayList();
    List<Cliente> listaClientes = new ArrayList();

    public void crearPrestamo() {
        try {
            sLibro.findLibrosList();
            listaLibros = sLibro.listaLibros;
            sCliente.findClientesList();
            listaClientes = sCliente.listaClientes;
            LocalDate fechaInicio1 = LocalDate.of(2023, 5, 5);
            LocalDate fechaFin1 = LocalDate.of(2023, 5, 15);
            Prestamo prestamo1 = new Prestamo(fechaInicio1, fechaFin1, Boolean.TRUE, listaLibros.get(0), listaClientes.get(0));
            precrud.create(prestamo1);
            listaPrestamos.add(prestamo1);
            LocalDate fechaInicio2 = LocalDate.of(2022, 10, 12);
            LocalDate fechaFin2 = LocalDate.of(2023, 1, 15);
            Prestamo prestamo2 = new Prestamo(fechaInicio2, fechaFin2, Boolean.TRUE, listaLibros.get(1), listaClientes.get(1));
            precrud.create(prestamo2);
            listaPrestamos.add(prestamo2);
            LocalDate fechaInicio3 = LocalDate.of(2022, 12, 22);
            LocalDate fechaFin3 = LocalDate.of(2023, 3, 28);
            Prestamo prestamo3 = new Prestamo(fechaInicio3, fechaFin3, Boolean.TRUE, listaLibros.get(2), listaClientes.get(2));
            precrud.create(prestamo3);
            listaPrestamos.add(prestamo3);
        } catch (Exception e) {
        }
    }

    public void prestarLibro(int isbn_libro) {
        Libro libro = precrud.findLibro(isbn_libro);
        if (libro == null) {
            System.out.println("El libro no existe");
        } else {
            try {
                Prestamo prestamo = new Prestamo();
                prestamo.setLibro(libro);
                System.out.print("Ingrese el ID del cliente: ");
                int id_cliente = sc.nextInt();
                Cliente cliente = clicrud.find(id_cliente);
                if (cliente == null) {
                    System.out.println("El cliente no existe");
                } else {
                    prestamo.setCliente(cliente);
                    prestamo.setFechaPrestamo(LocalDate.now());
                    prestamo.setAlta(true);
                    precrud.create(prestamo);
                    System.out.println("El libro " + libro.getTitulo() + " ha sido prestado a " + cliente.getNombre());
                }
            } catch (Exception e) {
                System.out.println("Error al prestar el libro: " + e.getMessage());
            }
        }
    }

    public void devolverLibro(int id_prestamo) {
        Prestamo prestamo = precrud.find(id_prestamo);
        if (prestamo == null) {
            System.out.println("El préstamo no existe");
        } else {
            try {
                prestamo.setAlta(false);
                precrud.update(prestamo);
                System.out.println("El libro " + prestamo.getLibro().getTitulo() + " ha sido devuelto exitosamente por " + prestamo.getCliente().getNombre());
            } catch (Exception e) {
                System.out.println("Error al devolver el libro: " + e.getMessage());
            }
        }
    }

    public void prestamosClientes() {
        listaPrestamos = precrud.findPrestamoActivos(true);
        List<Prestamo> prestamosActivosCliente = new ArrayList<>();
        System.out.print("Ingrese el ID del cliente: ");
        int id_cliente = sc.nextInt();
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCliente().getId() == id_cliente && prestamo.isAlta()) {
                prestamosActivosCliente.add(prestamo);
            }
        }
        if (!prestamosActivosCliente.isEmpty()) {
            System.out.println("Los préstamos activos del cliente son:");
            for (Prestamo prestamo : prestamosActivosCliente) {
                System.out.println("- Libro: " + prestamo.getLibro().getTitulo() + " | Fecha de inicio: " + prestamo.getFechaPrestamo() + " | Fecha de fin: " + prestamo.getFechaDevolucion());
            }
        } else {
            System.out.println("El cliente no tiene préstamos activos");
        }
    }

}
