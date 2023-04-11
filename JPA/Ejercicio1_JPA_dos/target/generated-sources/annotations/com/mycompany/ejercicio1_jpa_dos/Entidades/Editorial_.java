package com.mycompany.ejercicio1_jpa_dos.Entidades;

import com.mycompany.ejercicio1_jpa_dos.Entidades.Libro;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-04-02T12:42:31")
@StaticMetamodel(Editorial.class)
public class Editorial_ { 

    public static volatile ListAttribute<Editorial, Libro> libros;
    public static volatile SingularAttribute<Editorial, Boolean> alta;
    public static volatile SingularAttribute<Editorial, Integer> id;
    public static volatile SingularAttribute<Editorial, String> nombre;

}