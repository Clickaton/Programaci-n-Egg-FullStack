/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    List<Alumno> alumnos = new ArrayList();

    public Alumno crearAlumno() {
        Alumno a1 = new Alumno();

        //Ingreso del nombre
        System.out.println("Ingrese el nombre del alumno:");
        a1.setNombre(leer.next());
        //Ingreso de notas
        int notas[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            notas[i] = leer.nextInt();
        }
        a1.setArray(notas);
        alumnos.add(a1);
        return a1;
    }

    public Float calcularNotaFinal(int notas[]) {

        float suma = 0;
        for (int nota : notas) {
            suma += nota;
        }

        return (suma / notas.length);
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que desee calcular el promedio");
        String nombre = leer.next();
        for (Alumno i : alumnos) {
            if (i.getNombre().equals(nombre)) {

                System.out.println("El alumno ingresado tiene una nota final de: " + calcularNotaFinal(i.getArray()));
                break;
            } else {
                System.out.println("El alumno ingresado no existe");
            }
        }
    }

    public void alumnos() {

        alumnos.add(crearAlumno());
    }

    public void mostrarAlumnos() {
        for (Alumno listaAlumnos : alumnos) {
            System.out.println("nombre " + listaAlumnos.getNombre());
            System.out.println("Notas: " + Arrays.toString(listaAlumnos.getArray()));

        }
    }

    public void menu() {

        int opcion;
        do {

            System.out.println("---------MENU---------");
            System.out.println("01. Crear alumno");
            System.out.println("02. Calcular notas");
            System.out.println("03. Mostrar Alumnos");
            System.out.println("04. Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    crearAlumno();
                    break;
                case 2:
                    notaFinal();
                    System.out.println("");
                    break;
                case 3:
                    mostrarAlumnos();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("La opción ingresada es erronea");

            }
        } while (opcion != 4);

    }

}
