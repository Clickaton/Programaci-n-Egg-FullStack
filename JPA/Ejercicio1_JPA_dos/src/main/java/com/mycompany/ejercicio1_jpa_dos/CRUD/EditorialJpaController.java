/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Julian_Velasco
 */
public class EditorialJpaController extends CRUD<Editorial> {

    public EditorialJpaController() {
    }

    public void delete(Editorial editorial) {
        super.delete(editorial);
    }

    public void update(Editorial editorial) {
        super.update(editorial);
    }

    public void create(Editorial editorial) {
        super.create(editorial);
    }

    public List<Editorial> findEditorialEntities() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Editorial.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public Editorial find(int id) {
        try {
            return em.find(Editorial.class, id);
        } catch (Exception e) {
            System.out.println("Error al buscar la editorial.");
            return null;
        }
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
