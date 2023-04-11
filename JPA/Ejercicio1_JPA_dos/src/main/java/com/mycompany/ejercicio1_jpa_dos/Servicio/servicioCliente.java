/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.Servicio;

import com.mycompany.ejercicio1_jpa_dos.CRUD.ClienteJpaController;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Cliente;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Prestamo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian_Velasco
 */
public class servicioCliente {

    ClienteJpaController clicrud = new ClienteJpaController();
    List<Cliente> listaClientes = new ArrayList();
    List<Prestamo> listaPrestamos = new ArrayList();
   
    public void findClientesList() {
        listaClientes = clicrud.findClienteEntities();
    }
    
    public void crearCliente() {
        try {
            Cliente cliente1 = new Cliente(123, "Julian", "Velasco", "258", Boolean.TRUE, listaPrestamos);
            clicrud.create(cliente1);
            listaClientes.add(cliente1);
            Cliente cliente2 = new Cliente(1234, "Lihuen", "Lorenzo", "147", Boolean.TRUE, listaPrestamos);
            clicrud.create(cliente2);
            listaClientes.add(cliente2);
            Cliente cliente3 = new Cliente(12345, "Jorge", "Movilla", "369", Boolean.TRUE, listaPrestamos);
            clicrud.create(cliente3);
            listaClientes.add(cliente3);
        } catch (Exception e) {
        }
    }
}
