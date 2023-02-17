/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 */
package pooherenciaej01;

import pooherenciaej01.Entidades.*;

/**
 *
 * @author chris
 */
public class PooHerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Declaración del objeto Perro
        Animales perro1 = new Perro("Paquita", "Croquetas de perro", 1, "mestiza");
        System.out.println(perro1.getNombre());
        perro1.alimentarse();
        //Declaración de otro objeto Perro
        Animales perro2 = new Perro("Ringo", "Croquetas de perro y carne", 7, "mestizo");
        System.out.println(perro2.getNombre());
        perro2.alimentarse();
        //Declaración del objeto Gato
        Animales gato1 = new Gato("Adara", "Croquetas de gato", 6, "Europea Común");
        System.out.println(gato1.getNombre());
        gato1.alimentarse();
        //Declaración del objeto Caballo
        Animales caballo1 = new Caballo("Tiro al blanco", "Alfalfa", 3, "Lipizzano");
        System.out.println(caballo1.getNombre());
        caballo1.alimentarse();
    }

}
