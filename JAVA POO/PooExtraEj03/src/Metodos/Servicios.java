/*
3. Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Metodos;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Servicios {

    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);

    public Raices creaRaices() {

        Raices r1 = new Raices();

        System.out.println("Ingrese a");

        r1.setA(leer.nextDouble());

        System.out.println("Ingrese b");

        r1.setB(leer.nextDouble());

        System.out.println("Ingrese c");

        r1.setC(leer.nextDouble());
        return r1;
    }

    public double getDiscriminante(Raices r1) {
        // Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
        double resultado = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        System.out.println(resultado);

        return resultado;
    }

    public boolean tieneRaices(Raices r1) {
        // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
        boolean condicion;
        if (getDiscriminante(r1) >= 0) { //Esa es la forma correcta de traer el metodo sin usar parámetros.
            condicion = true;
        } else {
            condicion = false;
        }
        System.out.println("¿Tiene mas de una raiz? " + condicion);
        return condicion;
    }

    public boolean tieneRaiz(Raices r1) {
        //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
        boolean condicion;
        if (getDiscriminante(r1) == 0) { //Esa es la forma correcta de traer el metodo sin usar parámetros.
            condicion = true;
        } else {
            condicion = false;
        }
        System.out.println(condicion);
        return condicion;
    }

    public void obtenerRaices(Raices r1) {
        //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
        double raiz1;
        double raiz2;
        if (tieneRaices(r1)) {
            raiz1 = (-r1.getB() + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            raiz2 = (-r1.getB() - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println(raiz1);
            System.out.println(raiz2);
        } else {
            System.out.println("No tiene dos raices");
        }
    }

    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1)) {
            double raiz = (-r1.getB() / (2 * r1.getA()));
            System.out.println(raiz);
        } else {
            System.out.println("No tiene una sola raiz");
        }
    }

    public void calcular(Raices r1) {
        //Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
        if (tieneRaices(r1)) {
            obtenerRaices(r1);
        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);
        } else {
            System.out.println("No tiene ninguna raiz");
        }
    }

    public void menu(Raices r1) {
        int opcion;

        do {
            System.out.println("1.Calcular Discriminante");
            System.out.println("2.Verificar si tiene raices");
            System.out.println("3.Verificar si tiene raiz");
            System.out.println("4.Obtiene raices");
            System.out.println("5.Obtener raiz");
            System.out.println("6.Calcular");
            System.out.println("7.Salir");
            System.out.println("");

            System.out.println("Ingrese una opción");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    getDiscriminante(r1);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    tieneRaices(r1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    tieneRaiz(r1);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    obtenerRaices(r1);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    obtenerRaiz(r1);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    calcular(r1);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Usted salió");
                    System.out.println("");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }

        } while (opcion != 7);

    }
}
