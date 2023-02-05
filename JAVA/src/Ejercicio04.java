
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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     * 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
     * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor para calcular los C°:");
        double grado = leer.nextDouble();
        System.out.println("Los " + grado + "C° es equivalente a " + (32 + (9 * grado / 5))+ "F°");
               
        
    }
    
}
