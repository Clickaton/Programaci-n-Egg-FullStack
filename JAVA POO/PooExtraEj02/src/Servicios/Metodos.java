/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    Puntos p1 = new Puntos();
    Scanner leer = new Scanner(System.in);

    public void crearPuntos() {
        System.out.println("Ingrese el punto X:");
        p1.setX1(leer.nextInt());
        System.out.println("Ingrese el punto Y:");
        p1.setY1(leer.nextInt());
    }

    public void calcularDistancia() {
        
        
        
    }
}
