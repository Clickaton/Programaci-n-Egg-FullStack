
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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     * 6. Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para verificar si es par o impar:");
        double num = leer.nextDouble();
        if ((num % 2) == 0) {        //Se abre corchete 
        System.out.println("El número es par"); } //se cierra corchete del if
        else  { //se abre corchete del sino
        System.out.println("El número es impar");
    } // Se cierra corchete del sino
        
        
    }
    
}
