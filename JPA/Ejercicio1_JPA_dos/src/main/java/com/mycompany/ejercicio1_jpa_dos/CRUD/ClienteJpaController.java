/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Cliente;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Julian_Velasco
 */
public class ClienteJpaController extends CRUD<Cliente> {

    public ClienteJpaController() {
        super();
    }

    public void delete(Cliente cliente) {
        super.delete(cliente);
    }

    public void update(Cliente cliente) {
        super.update(cliente);
    }

    public void create(Cliente cliente) {
        super.create(cliente);
    }

    public List<Cliente> findClienteEntities() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cliente.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
    
    public Cliente find(int id) {
        try {
            return em.find(Cliente.class, id);
        } catch (Exception e) {
            System.out.println("Error al buscar el cliente ");
            return null;
        }
    }
}
