/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mascotapp;

import Servicios.Metodos;
import javapoo.entidades.Mascota;


public class Mascotapp {

    public static void main(String[] args) {
       Metodos m1 = new Metodos();
       m1.fabricaPichichos(140);
       m1.mostrarMascotas();
        
        
    }
    
}
