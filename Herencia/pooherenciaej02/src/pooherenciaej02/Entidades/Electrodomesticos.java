/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooherenciaej02.Entidades;

import java.util.*;

/**
 *
 * @author chris
 */
public class Electrodomesticos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombre;
    protected Double precio = 1000d;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected double peso;
    

    public Electrodomesticos() {
    }

    public Electrodomesticos(String nombre, Double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        //Agrego lógica al constructor para que sólo se puedan ingresar los colores (blanco, negro, rojo, azul y gris.)
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            this.color = color;
        }

        //Agrego lógica al constructor para que sólo se pueda ingresar de la A hasta la F.
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
            this.consumoEnergetico = consumoEnergetico;
        }
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método que pide el ejercicio. (Creado en el constructor)
    public void comprobarConsumoEnergetico(char letra) {
        if (this.consumoEnergetico != 'A' || this.consumoEnergetico != 'B' || this.consumoEnergetico != 'C' || this.consumoEnergetico != 'D' || this.consumoEnergetico != 'E' || this.consumoEnergetico != 'F') {
            System.out.println("La letra ingresada es incorrecta");
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    //Metodos que pide el ejercicio. (Creado en el constructor).
    public void comprobarColor(String color) {
        if (!this.color.equals("blanco") || !this.color.equals("negro") || !this.color.equals("rojo") || !this.color.equals("azul") || !this.color.equals("gris")) {
            System.out.println("El color ingresado es incorrecto. ");
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el nombre del electrodoméstico: ");
        this.nombre = (leer.next().toLowerCase());
        this.precio = 1000d;
        System.out.println("Ingrese el color del electrodoméstico: ");
        this.color = leer.next();
        System.out.println("Ingrese el consumo energético del electrodoméstico: ");
        this.consumoEnergetico = (leer.next().toUpperCase().charAt(0)); //Se utiliza la extensión charAt para poder ingresar el char a travez del scanner con el indice 0.
        System.out.println("Ingrese el peso del electrodoméstico: ");
        this.peso = (leer.nextDouble());
    }

    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio = (this.precio + 1000);
                break;
            case 'B':
                this.precio = (this.precio + 800);
                break;
            case 'C':
                this.precio = (this.precio + 600);
                break;
            case 'D':
                this.precio = (this.precio + 500);
                break;
            case 'E':
                this.precio = (this.precio + 300);
                break;
            case 'F':
                this.precio = (this.precio + 100);
                break;
            default:
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio = (this.precio + 100);
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio = (this.precio + 500);
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio = (this.precio + 800);
        } else if (this.peso >= 80) {
            this.precio = (this.precio + 1000);
        }
    }
    

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
