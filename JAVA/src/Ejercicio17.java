/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ej17 {

    /**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        System.out.println("Por favor, ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        Random random = new Random();
        for (i = 0; i < n; i++) {
            vector[i] = random.nextInt(99999);
            }
            for (i = 0; i < n; i++) {
                System.out.println("" + vector[i]);
            }
         for (i = 0; i < n; i++){
             if (vector[i]<10){
                 cont1++;
             } else if (vector[i]<100){
                 cont2++;
             } else if (vector[i]<1000){
                 cont3++;
             } else if(vector[i]<10000){
                 cont4++;
             }else if(vector[i]<100000){
                 cont5++;
             }
         }
        System.out.println("Un digito: " + cont1);
        System.out.println("Dos digito: " + cont2);
        System.out.println("Tres digito: " + cont3);
        System.out.println("Cuatro digito: " + cont4);
        System.out.println("Cinco digito: " + cont5);
    }

}
