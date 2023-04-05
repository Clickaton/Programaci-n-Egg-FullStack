/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaej01;

import CRUD.AutorCrud;
import CRUD.EditorialCrud;
import CRUD.LibroCrud;
import com.mycompany.jpaej01.entidades.*;
import java.util.*;






/**
 *
 * @author chris
 */
public class JPAEj01 {

    public static void main(String[] args) {
 
        LibroCrud lib01 = new LibroCrud();
        EditorialCrud edi01 = new EditorialCrud();
        AutorCrud aut01 = new AutorCrud();
        ArrayList<Libro>libros = new ArrayList();
        
        Autor autor = new Autor("pepe", true, libros);
        aut01.crear(autor);
        Editorial editorial = new Editorial("yellow", true, libros);
        edi01.crear(editorial);
        Libro libro = new Libro("asd", 1998,5, 3, 2, true, autor, editorial);
        libros.add(libro);
        lib01.crear(libro);

    
        
        
    }
}
