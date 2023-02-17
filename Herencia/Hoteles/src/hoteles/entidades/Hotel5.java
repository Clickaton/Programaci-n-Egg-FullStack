/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteles.entidades;

/**
 *
 * @author chris
 */
public final class Hotel5 extends Hotel4 { //Se utiliza el public final class para especificar que nada va a heredar esta clase, que va a ser la ultima
    
    protected boolean casino = true;
    protected boolean restaurant = true;

    public Hotel5(Double precio, double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
        
    }
    
    
}
