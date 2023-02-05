/*
14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicios;

import Entidades.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Metodos {

    Movil Celular = new Movil();
    Scanner leer = new Scanner(System.in);

    public Movil CargarCelular() {
        System.out.println("Ingrese la marca del celular");
        Celular.setMarca(leer.next());
        System.out.println("Ingrese el precio del celular");
        Celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        Celular.setModelo(leer.next());
        System.out.println("Ingrese la memoria RAM");
        Celular.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        Celular.setAlmacenamiento(leer.nextInt());
        return Celular;
    }

    public void ingresarCodigo() {
         int cod[] = new int [7];
         for (int i = 0; i < 7; i++) {
             System.out.println("Ingrese el codigo");
             cod[i] = leer.nextInt();
        }Celular.setVector(cod);
        System.out.println(Arrays.toString(cod));
    }

}
