/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoteles.entidades;

/**
 *
 * @author chris
 */
public class Hotel {
    
    protected Integer cantidadHabitaciones; //El atributo protected hace referencia a que el atriburo es público para la familia y privado para los externos a la misma mediante la herencia.

    public Hotel(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
   
    
}
