/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.util.Date; //Se debe importar el Date de la librerìa de java.
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class PooEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un año:");
        int anio = leer.nextInt()-1900;
        System.out.println("Ingrese un mes del 1 al 12:");
        int mes = leer.nextInt();
        System.out.println("ingrese un dìa");
        int dia = leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        System.out.println(fecha);
       
        int añosDeDiferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("Hay " + añosDeDiferencia + " años de diferencia entre las fechas.");
       
        
    }
    
}
