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

    protected String nombre;
    protected Double precio = 1000d;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected double peso;
    protected List<Electrodomesticos> electrodomestico = new ArrayList();

    public Electrodomesticos() {
    }

    public Electrodomesticos(String nombre, Double precio, String color, char consumoEnergetico, double peso, List electrodomestico) {
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

    public List<Electrodomesticos> getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(List<Electrodomesticos> electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
