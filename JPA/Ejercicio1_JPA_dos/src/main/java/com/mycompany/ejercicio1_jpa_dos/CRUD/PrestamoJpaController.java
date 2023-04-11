/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import com.mycompany.ejercicio1_jpa_dos.Entidades.Prestamo;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Julian_Velasco
 */
public class PrestamoJpaController extends CRUD<Prestamo> {

    LibroJpaController libcont = new LibroJpaController();

    public PrestamoJpaController() {
        super();
    }

    public void delete(Prestamo prestamo) {
        super.delete(prestamo);
    }

    public void update(Prestamo prestamo) {
        super.update(prestamo);
    }

    public void create(Prestamo prestamo) {
        super.create(prestamo);
    }

    public List<Prestamo> findPrestamoEntities() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Prestamo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public Prestamo find(int id) {
        try {
            return em.find(Prestamo.class, id);
        } catch (Exception e) {
            System.out.println("Error al buscar el préstamo ");
            return null;
        }
    }

    public Libro findLibro(int isbn) {
        try {
            List<Libro> libros = libcont.libroIsbn(isbn);
            if (libros.isEmpty()) {
                return null;
            } else {
                return libros.get(0);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el libro");
            return null;
        }
    }

    public List<Prestamo> findPrestamoActivos(boolean soloActivos) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Prestamo> cq = cb.createQuery(Prestamo.class);
        Root<Prestamo> prestamo = cq.from(Prestamo.class);
        if (soloActivos) {
            cq.where(cb.isTrue(prestamo.get("alta")));
        }
        return em.createQuery(cq).getResultList();
    }
}
