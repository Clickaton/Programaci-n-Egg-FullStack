/*
 */
package hoteles;

import hoteles.entidades.*;
import java.util.*;

/**
 *
 * @author chris
 */
public class Hoteles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Hotel> hoteles = new ArrayList();
        //Es importante poner la d al lado del 1500 para que se entienda que es de tipo double, si no se pone, hace referencia a un integer.
        Hotel1 h1 = new Hotel1(1500d, 8, 10);
        Hotel2 h2 = new Hotel2(2500d, 12, 15);
        Hotel3 h3 = new Hotel3(3500d, 15, 20);
        Hotel4 h4 = new Hotel4(5000d, 20, 30);
        Hotel5 h5 = new Hotel5(10000d, 30, 50);

       //Agrego los hoteles a la lista.
        hoteles.add(h1);
        hoteles.add(h2);
        hoteles.add(h3);
        hoteles.add(h4);
        hoteles.add(h5);

        for (Hotel aux : hoteles) {
            
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println("Soy un hotel 5");
                continue;
            }
            
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println("Soy un hotel 4");
                continue;
            }
            
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println("Soy un hotel 3");
                continue;
            }
            
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println("Soy un hotel 2");
                continue;
            }
            
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println("Soy un hotel 1");
                
            }
        }
    }

}
