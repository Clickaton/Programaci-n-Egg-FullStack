/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Autor;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Julian_Velasco
 */
public class AutorJpaController extends CRUD<Autor> {

    public AutorJpaController() {
        super();
    }

    public void delete(Autor autor) {
        super.delete(autor);
    }

    public void update(Autor autor) {
        super.update(autor);
    }

    public void create(Autor autor) {
        super.create(autor);
    }

    public Autor find(int id) {
        try {
            return em.find(Autor.class, id);
        } catch (Exception e) {
            System.out.println("Error al buscar la editorial.");
            return null;
        }
    }

    public List<Autor> findAutorEntities() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Autor.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public List<Autor> autorNombre(String nombre) {
        TypedQuery<Autor> query = em.createQuery("SELECT autor FROM Autor autor WHERE autor.nombre = :nombre", Autor.class);
        query.setParameter("nombre", nombre);
        return query.getResultList();
    }

}
