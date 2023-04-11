/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Julian_Velasco
 */
public class CRUD<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public CRUD() {
        emf = Persistence.createEntityManagerFactory("Persistencia");
        em = emf.createEntityManager();
    }

    public void connect() {
        try {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("No es posible conectarse");
        }
    }

    public void disconnect() {
        try {
            if (em.isOpen()) {
                em.close();
            }
        } catch (Exception e) {
            System.out.println("No es posible desconectarse");
        }
    }

    public void create(T object) {
        try {
            connect();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            disconnect();
        }
    }

    public void update(T object) {
        try {
            connect();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } finally {
            disconnect();
        }
    }

    public void delete(T object) {
        connect();
        try {
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit(); 
        } finally {
            disconnect();
        }
    }
    
    public List<T> findEntities(Class<T> entityClass) {
        connect();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(entityClass));
            Query q = em.createQuery(cq);
            return q.getResultList();
        } finally {
            disconnect();
        }
    }

}

