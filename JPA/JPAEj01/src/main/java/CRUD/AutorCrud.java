/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author chris
 */

import com.mycompany.jpaej01.entidades.*;
import java.util.List;


public class AutorCrud extends Crud<Autor> {

    public AutorCrud() {
      super();
    }
   
    @Override
    public void crear(Autor autor) {
        super.crear(autor);
    }

    @Override
    public void modificar(Autor autor) {
        super.modificar(autor);
    }

    @Override
    public void eliminar(Autor autor) {
        super.eliminar(autor);
    }
    

        public List<Autor> listarAutores(){
        super.conectar();
        List<Autor> autores = em.createNamedQuery("Autor.findAll").getResultList();
        super.desconectar();
        return autores;
    }
    
    public Autor findId(Integer id){
        super.conectar();
        Autor autor = em.createNamedQuery("Autor.findById", Autor.class).setParameter("id", id).getSingleResult();
        super.desconectar();
        return autor; 
    }
    
}