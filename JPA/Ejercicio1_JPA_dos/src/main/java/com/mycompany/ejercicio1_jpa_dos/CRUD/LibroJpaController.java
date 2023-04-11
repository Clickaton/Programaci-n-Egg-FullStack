/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_jpa_dos.CRUD;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Julian_Velasco
 */
public class LibroJpaController extends CRUD<Libro> {

    public LibroJpaController() {
        super();
    }

    public void delete(Libro libro) {
        super.delete(libro);
    }

    public void update(Libro libro) {
        super.update(libro);
    }

    public void create(Libro libro) {
        super.create(libro);
    }

    public List<Libro> findLibroEntities() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Libro.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public Libro find(int isbn) {
        try {
            return em.find(Libro.class, isbn);
        } catch (Exception e) {
            System.out.println("Error al buscar el libro");
            return null;
        }
    }

    public List<Libro> libroIsbn(Integer isbn) {
        TypedQuery<Libro> query = em.createQuery("SELECT libro FROM Libro libro WHERE libro.isbn = :isbn", Libro.class);
        query.setParameter("isbn", isbn);
        return query.getResultList();
    }

    public List<Libro> libroTitulo(String titulo) {
        TypedQuery<Libro> query = em.createQuery("SELECT libro FROM Libro libro WHERE libro.titulo LIKE :titulo", Libro.class);
        query.setParameter("titulo", "%" + titulo + "%");
        return query.getResultList();
    }

    public List<Libro> libroAutor(String nombreAutor) {
        TypedQuery<Libro> query = em.createQuery("SELECT libro FROM Libro libro JOIN libro.autor autor WHERE autor.nombre = :nombreAutor", Libro.class);
        query.setParameter("nombreAutor", nombreAutor);
        return query.getResultList();
    }

    public List<Libro> libroEditorial(String nombreEditorial) {
        TypedQuery<Libro> query = em.createQuery("SELECT libro FROM Libro libro JOIN libro.editorial editorial WHERE editorial.nombre = :nombreEditorial", Libro.class);
        query.setParameter("nombreEditorial", nombreEditorial);
        return query.getResultList();
    }
}
