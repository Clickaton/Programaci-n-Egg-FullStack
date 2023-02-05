import java.util.*; //Este código importa ambas librerías
//import java.util.Random;
//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
        System.out.println("Defina un tamaÃ±o del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int buscado, i, cont = 0;
        for (i = 0; i < n - 1; i++){
            vector[i] = new Random().nextInt(n);
        }
        for (i = 0; i < n; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("Que numero quieres buscar?");
        buscado = leer.nextInt();
        for (i = 0; i < n; i++){
            if (vector[i] == buscado){
                cont++;
                System.out.println("El numero buscado " + buscado + " se encuentra en la posicion " + i);
            }
        }
        if (cont >= 1){
            System.out.println("El numero aparece " + cont + " veces");
        }else{
            System.out.println("El numero buscado no esta en el vector");
        }
       
    }
    
}
