/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooherenciaej02.Entidades;

import java.util.List;

/**
 *
 * @author chris
 */
public class Lavadora extends Electrodomesticos {
    protected Double carga;

    public Lavadora() {
    }
    
    public Lavadora(Double carga) {
        this.carga = carga;
    }

    public Lavadora(String nombre, Double precio, String color, char consumoEnergetico, double peso, List electrodomestico) {
        super(nombre, precio, color, consumoEnergetico, peso, electrodomestico);
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
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
    
    
    
}
