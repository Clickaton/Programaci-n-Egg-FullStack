
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     * 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
     * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int limite = leer.nextInt(); 
        //System.out.println("Ingresa un número a la lista de suma");
        int i, suma=0; //= leer.nextInt(); // i es el valor auxiliar que se irà sumando
        
     // for (i= leer.nextInt();i<limite;i++)
        
        
        do{
         System.out.println("Ingresa un número a la lista de suma");
         i = leer.nextInt();
         suma+=i;
        }while (suma <= limite); //preguntar por que mayor o igual
        
        
    }
    
}
