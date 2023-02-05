/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.utilidades;

import Entidades.Pelicula;
import java.util.Comparator;


/**
 *
 * @author chris
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarLista = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuracion().compareTo(t1.getDuracion()); //Tomo la duración como atributo principal a trabajar.
        }
    };

    public static Comparator<Pelicula> ordenarListaAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo()); //Tomo el título como atributo principal a trabajar.
        }
    };

    public static Comparator<Pelicula> ordenarListaAlfaDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector()); //Tomo el título como atributo principal a trabajar.
        }
    };
    
}
