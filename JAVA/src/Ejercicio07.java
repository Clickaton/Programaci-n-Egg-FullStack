
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     * 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
     * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
     * la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine(), eure = "eureka";
        
        if (frase.equals(eure))  {          // Si usamos el frase == eure El resultado será falso porque
            System.out.println("Correcto");}// son objetos diferentes porque ocupan lugares distintos en memoria
        else {                              // EL equals se utilzia cuando el atributo de identificación es el mismo.
            System.out.println("Incorrecto"); }          // ==       (Compara objetos)
                                                         // equals() (Compara cadenas)
       
        
        
        
    }
    
}
