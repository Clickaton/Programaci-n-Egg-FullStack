/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import com.mycompany.jpaej01.entidades.*;
import java.util.List;

/**
 *
 * @author chris
 */
public class EditorialCrud extends Crud<Editorial> {

    public EditorialCrud() {
        super();
    }

    @Override
    public void crear(Editorial edi) {
        super.crear(edi);
    }

    @Override
    public void modificar(Editorial edi) {
        super.modificar(edi);
    }

    @Override
    public void eliminar(Editorial edi) {
        super.eliminar(edi);
    }

            public List<Editorial> listarEditoriales(){
        super.conectar();
        List<Editorial> editoriales = em.createNamedQuery("Editorial.findAll").getResultList();
        super.desconectar();
        return editoriales;
    }
    
    public Editorial findId(Integer id){
        super.conectar();
        Editorial editorial = em.createNamedQuery("Editorial.findById", Editorial.class).setParameter("id", id).getSingleResult();
        super.desconectar();
        return editorial; 
    }
    
}