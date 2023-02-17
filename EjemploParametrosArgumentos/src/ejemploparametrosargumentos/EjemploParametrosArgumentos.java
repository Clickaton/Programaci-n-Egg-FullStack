/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparametrosargumentos;

import Servicios.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class EjemploParametrosArgumentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número:"));
        
        Metodos metodo1 = new Metodos(); //Creo objeto de tipo método
        metodo1.sumar(n1, n2);
        metodo1.restar(n1, n2);
        metodo1.multiplicacion(n1, n2);
        metodo1.division(n1, n2);
        metodo1.mostrarResultados();
        
    }
    
}
