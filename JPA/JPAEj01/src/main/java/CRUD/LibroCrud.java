/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import com.mycompany.jpaej01.entidades.Libro;
import java.util.List;

/**
 *
 * @author chris
 */
public class LibroCrud extends Crud <Libro> {

    public LibroCrud() {
    super();
    }

    @Override
    public void crear(Libro libro) {
        super.crear(libro);
    }

    @Override
    public void modificar(Libro libro) {
        super.modificar(libro);
    }

    @Override
    public void eliminar(Libro libro) {
        super.eliminar(libro);
    }
    
    public List<Libro> listarLibros(){
        super.conectar();
        List<Libro> libros = em.createNamedQuery("Libro.findAll").getResultList();
        super.desconectar();
        return libros;
    }
    
    public Libro findId(Long isbn){
        super.conectar();
        Libro libro = em.createNamedQuery("Libro.findById", Libro.class).setParameter("id", isbn).getSingleResult();
        super.desconectar();
        return libro; 
    }
}