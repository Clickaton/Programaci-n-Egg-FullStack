/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import javapoo.entidades.Mascota;

/**
 *
 * @author Christian
 */
public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mascota m1 = new Mascota();
    private ArrayList<Mascota> mascotas;

    public Metodos() {
        this.mascotas = new ArrayList();

    }

    public void crearMascotaCompleto() {

        System.out.println("Ingrese el nombre de la mascota:");
        m1.setNombre(leer.next());
        System.out.println("Ingrese el apodo de la mascota:");
        m1.setApodo(leer.next());
        System.out.println("Ingrese el tipo de mascota:");
        m1.setTipo(leer.next());
        System.out.println("Ingrese el color de la mascota:");
        m1.setColor(leer.next());
        System.out.println("Ingrese la edad de la mascota");
        m1.setEdad(leer.nextInt());
        System.out.println("La mascota tiene cola?");
        m1.setCola(leer.nextBoolean());
        System.out.println("Ingrese la raza de la mascota:");
        m1.setRaza(leer.next());

    }

    public Mascota crearMascota() {
        System.out.println("Ingrese el nombre de la mascota:");
        String nombre = (leer.next());
        System.out.println("Ingrese el apodo de la mascota:");
        String apodo = (leer.next());
        System.out.println("Ingrese el tipo de mascota:");
        String tipo = (leer.next());

        Mascota m = new Mascota(nombre, apodo, tipo);
        mascotas.add(m);

        return new Mascota(nombre, apodo, tipo);
    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales en la lista de Mascotas son:");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size()); //Para mostrar la cantidad de items dentro del array.
    }

    //cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
    public void fabricaPichichos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Pichicho", "Pichi", "gato"));
        }
    }
//Crea mascotas pidiendo datos por teclado.

    public void fabricaMascotas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();

            System.out.println(mascotaCreada.toString());
        }
    }
}
