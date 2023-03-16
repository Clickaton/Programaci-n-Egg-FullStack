/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooherenciaej02.Metodos;

import java.util.*;
import pooherenciaej02.Entidades.*;

/**
 *
 * @author chris
 */
public class Servicios {

    List<Electrodomesticos> listaElectrodomesticos = new ArrayList();
    Electrodomesticos e1 = new Electrodomesticos();
    Lavadora l1 = new Lavadora();
    Televisor t1 = new Televisor();

    public Electrodomesticos llenarLista() {
        
        l1.crearLavadora();
        l1.precioFinal();
        System.out.println("El nombre de la lavadora es: " + l1.getNombre());
        System.out.println("El precio de la lavadora es: " + l1.getPrecio());
        System.out.println("El color de la lavadora es: " + l1.getColor());
        System.out.println("El consumo energético de la lavadora es: " + l1.getConsumoEnergetico());
        System.out.println("El color de la lavadora es: " + l1.getPeso());
        System.out.println("");
        System.out.println("");
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println("El nombre del televisor es: " + l1.getNombre());
        System.out.println("El precio del televisor es: " + l1.getPrecio());
        System.out.println("El color del televisor es: " + l1.getColor());
        System.out.println("El consumo energético del televisor es: " + l1.getConsumoEnergetico());
        System.out.println("El color del televisor es: " + l1.getPeso());

        return e1;
    }

}
