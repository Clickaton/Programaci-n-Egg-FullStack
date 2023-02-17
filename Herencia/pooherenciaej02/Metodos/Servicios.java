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
    Electrodomesticos e1 = new Electrodomesticos();
    Lavadora l1 = new Lavadora();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List <Electrodomesticos> listaElectrodomestico = new ArrayList(); 
    
    public Electrodomesticos crearElectrodomestico(){
        System.out.println("Ingrese el nombre del electrodoméstico: ");
        e1.setNombre(leer.next().toLowerCase());
        System.out.println("Ingrese el precio del electrodoméstico: ");
        e1.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el consumo energético del electrodoméstico: ");
        e1.setConsumoEnergetico(leer.next().toUpperCase().charAt(0)); //Se utiliza la extensión charAt para poder ingresar el char a travez del scanner con el indice 0.
        System.out.println("Ingrese el peso del electrodoméstico: ");
        e1.setPeso(leer.nextDouble());
        if ("lavadora".equals(e1.getNombre())) {
            System.out.println("Ingrese la carga máxima de la lavadora: ");
            l1.setCarga(leer.nextDouble());
        }
//precio, color, consumo energético (letras entre A y F) y peso.
//• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000. 
    listaElectrodomestico.add(e1);
    e1.setElectrodomestico(listaElectrodomestico);
    return e1;
    }
    
    public void crearLavadora(){
     
        crearElectrodomestico();
    }
    
   }
