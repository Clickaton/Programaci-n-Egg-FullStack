
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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     * 11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
     * pantalla el siguiente menú:
     * MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opc;
        String respuesta = "";
        boolean condicion = true;
      
        do {
        System.out.println("Menu:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));
                condicion=true;
                continue;
            case 2:
                System.out.println("La resta es: " + (num1 - num2));
                condicion=true;
                continue;
            case 3:
                System.out.println("La multiplicacion es: " + (num1 * num2));
                condicion=true;
                continue;
            case 4:
                System.out.println("La division es: " + (num1 / num2));
                condicion=true;
                continue;
            case 5:
                 System.out.println(" Está seguro que desea salir del programa (S/N)?");
             respuesta = leer.next();
             
            
              do {
           
                if (respuesta.equalsIgnoreCase("s")){ 
                    condicion=false;
           break;
               }else if(respuesta.equalsIgnoreCase("n")){ 
                  break;
               }else{
                   System.out.println("Respuesta incorrecta");
               break;
               }
              }while (!"n".equalsIgnoreCase(respuesta) || !"s".equalsIgnoreCase(respuesta));
          
              
           
              }
                
                
             
                   
        }while (condicion==true);
       
        
         //
        
      
           System.out.println("julian camilo velasco");
        
        }      
    
        

    }