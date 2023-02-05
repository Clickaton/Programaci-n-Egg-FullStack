
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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     * 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
     * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " Es :" + num*2 + ". El triple es : " + num*3 + ". Y la raíz cuadrada es : " + Math.sqrt(num));
        
    }
    
}
