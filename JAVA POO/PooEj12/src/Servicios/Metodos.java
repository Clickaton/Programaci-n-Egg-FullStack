/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    Persona persona = new Persona(); //Creo el objeto para trabajar con él.
    Scanner leer = new Scanner(System.in); //Creo el Scanner para introducir datos.
    Date fechaActual = new Date(); //Creo la variable global para tomarla en los demas métodos

    public void crearPersona() { //Creo el método para ingresar los datos.
        int anio, mes, dia;
        System.out.println("Ingrese el nombre y apellido de la persona:");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento de " + persona.getNombre());
        System.out.println("El año de nacimiento:");
        anio = leer.nextInt();
        System.out.println("El mes de nacimiento:");
        mes = leer.nextInt();
        System.out.println("El día de nacimiento:");
        dia = leer.nextInt();
        Date aux = new Date(anio - 1900, mes - 1, dia); //Creo un Date auxiliar para transferirle los datos al Date original.
        persona.setFechaNacimiento(aux);
    }

    public void calcularEdad() {
        Date fechaPersona = persona.getFechaNacimiento();
        int aniosDeDiferencia = fechaActual.getYear() - fechaPersona.getYear();
        System.out.println(persona.getNombre() + " tiene " + aniosDeDiferencia + " años.");
        System.out.println("");
    }

    public boolean menorQue(int edad) {
        int edadActual = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
        boolean resultado;
        if (edadActual < edad) {
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }

    public void mostrarPersona() {
        System.out.println(persona.getNombre());
        System.out.println("Su fecha de nacimiento es " + persona.getFechaNacimiento());
        System.out.println("Su edad es de " + (fechaActual.getYear() - persona.getFechaNacimiento().getYear()) + " años");
        System.out.println("");

    }

    public void menu() {
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1.Calcular edad");
            System.out.println("2.Comparar edades");
            System.out.println("3.Mostrar información");
            System.out.println("4.Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    calcularEdad();
                    break;
                case 2: {
                    System.out.println("Ingrese la edad a comparar");
                    int edad = leer.nextInt();
                    System.out.println("La persona es mayor que la edad ingresada?");
                    boolean r = menorQue(edad); //Creo variable boolean para mostrar el resultado
                    System.out.println(r); //Imprimo el resultado.
                    System.out.println("");
                    break;
                }
                case 3:
                    mostrarPersona();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Está seguro que desea salir?");
                    int opc2;
                    System.out.println("");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    opc2 = leer.nextInt();
                    if (opc2 == 2) {
                        menu();
                        break;
                    }
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        } while (opcion != 4);

    }

}
