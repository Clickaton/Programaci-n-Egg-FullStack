
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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     * 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
     *   en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner(System.in);    
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        System.out.println("La frase en mayúscula es: " + frase.toUpperCase());
        System.out.println("La frase en minúscula es: " + frase.toLowerCase());
        
        
    }
    
}
