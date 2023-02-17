/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Christian
 */
public class Metodos {
    //Atributos: (VARIABLES GLOBALES)
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos: (Los parámetros van en la declaración del método)
    
    //Método para sumar numeros
    public void sumar(int num1, int num2){ //(VARIABLES LOCALES)
    suma = num1 + num2;
    }
   
    //Método para restar números
    public void restar(int num1, int num2){
        resta= num1 + num2;
    
    }
    
    //Método para multiplicar números
    public void multiplicacion(int num1, int num2){
        multiplicacion = num1*num2;
    
    }
    
    //Metodo para dividir números
    public void division(int num1, int num2){
        division=num1/num2;
   
    }
    
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
