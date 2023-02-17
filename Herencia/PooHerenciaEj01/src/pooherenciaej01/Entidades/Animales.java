/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 */
package pooherenciaej01.Entidades;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Animales {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public void alimentarse() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea alimentar al animal con su respectiva comida?  (1.SI / 2.NO)");
        int respuesta;

        do {
            respuesta = leer.nextInt();
            if (respuesta == 1) {
                System.out.println("Se alimenta con " + alimento);
                System.out.println("Comiendo...");
                System.out.println("El animal se encuentra satisfecho");
                System.out.println("");
                break;
            } else if (respuesta == 2) {
                System.out.println("El animal se encuentra ambriento. :(");
                System.out.println("");
                break;
            } else {
                System.out.println("Por favor ingrese una respuesta válida");
                System.out.println("");
                continue;
            }

        } while (respuesta != 1 || respuesta != 2);

    }

    public Animales() {
    }

    public Animales(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }

}
