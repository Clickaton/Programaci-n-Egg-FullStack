
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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
     * dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros para calcular la suma de ambos:");        
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("La suma de " + num1 + " y " + num2 + " es : " + (num1+num2));
        
    }
    
}
