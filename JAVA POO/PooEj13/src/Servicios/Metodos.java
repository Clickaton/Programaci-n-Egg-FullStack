/*
 13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    Curso c1 = new Curso(); //Creamos el objeto
    Scanner leer = new Scanner(System.in);
    String[] vector = new String[5]; //Creamos el vector con tamaño 5

    public void cargarAlumnos() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno: " +( i+1));
            vector[i] = leer.nextLine();
            c1.setAlumnos(vector);
        }    
    }
    
    public void turno(){
    
    }

    public void crearCurso() {
        cargarAlumnos();

        System.out.println("¿Qué cantidad de horas por día tendrá el curso?");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("¿Qué cantidad de días por semana tendrá el curso?");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("¿A qué turno corresponde el curso? ¿Tarde (T) o mañana (m)?");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora:");
        c1.setPrecioPorHora(leer.nextDouble());
    }

    public void calcularGananciaSemanal() {
        double precio;
        precio = c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getCantidadDiasPorSemana()*5; 
        System.out.println("Se obtiene una ganancia semanal de: "+"$"+precio);

    }
}
