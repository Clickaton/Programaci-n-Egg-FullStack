/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author chris
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Crud<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public Crud() {
        emf = Persistence.createEntityManagerFactory("PU");
        em = emf.createEntityManager();
    }

    public void conectar() {
        try {
            if (!em.isOpen()) {
                emf.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("Problemas de conexión");
        }
    }

    public void desconectar() {
        try {
            if (em.isOpen()) {
                em.close();
            }
        } catch (Exception e) {
            System.out.println("Problemas de desconexión");
        }
    }

    public void crear(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problemas en la creación de datos");
        } finally {
            desconectar();
        }
    }

    public void modificar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problemas en la modificación de datos");
        } finally {
            desconectar();
        }
    }

    public void eliminar(T objeto) {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Problemas en la eliminación de datos");
        } finally {
            desconectar();
        }
    }


}
