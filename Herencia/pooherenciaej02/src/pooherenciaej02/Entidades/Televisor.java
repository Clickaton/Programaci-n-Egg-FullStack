/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooherenciaej02.Entidades;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Televisor extends Electrodomesticos {

    protected Integer resolucion;
    protected Boolean sintonizador_TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador_TDT, String nombre, Double precio, String color, char consumoEnergetico, double peso) {
        super(nombre, precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(Boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Televisor(String nombre, Double precio, String color, char consumoEnergetico, double peso) {
        super(nombre, precio, color, consumoEnergetico, peso);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("Ingrese la resolución de la TV: ");
        this.resolucion = leer.nextInt();
        int opc;
        System.out.println("¿El TV dispone de sintonizador TDT?");

        do {
            System.out.println("1.SI | 2.NO");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    this.sintonizador_TDT = true;
                    break;
                case 2:
                    this.sintonizador_TDT = false;
                    break;
                default:
                    System.out.println("Por favor, ingrese una respuesta válida.");
            }
        } while (opc != 1 || opc != 2);

    }

    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40 ) {
            this.precio = this.precio * 0.3;
        }
        if (this.sintonizador_TDT = true) {
            this.precio = this.precio + 500d;
        }
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void comprobarColor(String color) {
        super.comprobarColor(color); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void comprobarConsumoEnergetico(char letra) {
        super.comprobarConsumoEnergetico(letra); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

}
