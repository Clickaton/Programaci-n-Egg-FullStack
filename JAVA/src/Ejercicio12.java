
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner (System.in);
        String frase;
        int cont = 0, cont2 = 0;
      
        do {
        System.out.println("ingrese secuencias que inicien con x y finalicen en o, maximo 5 caracteres");
        frase = sc.nextLine();
        if (frase.substring(0,1).equalsIgnoreCase("x") && frase.substring(frase.length()-1).equalsIgnoreCase("o") && frase.length()<=5) {
         cont++;  
        } else if (!"&&&&&".equals(frase)) {
         cont2++;
        } 
        
        } while(!"&&&&&".equals(frase));
        System.out.println("correctas" + cont);
        System.out.println("incorrectas" + cont2);
        }

    
}
