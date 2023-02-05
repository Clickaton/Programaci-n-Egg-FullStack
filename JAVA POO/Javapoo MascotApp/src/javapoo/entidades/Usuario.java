/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Usuario {
    
    public String nombre;
    private String apellido;
    private int dni;
    private Date nacimiento;
    private String pais;

    //private Mascota mascota;
   private List<Mascota> mascotas;
    
   public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
    
}

