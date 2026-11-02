/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.planificador.tarea01_solid_uml;

import com.planificador.tarea01_solid_uml.Servicios.Habitacion;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Hotel {
    private String idHotel;
    private String nombre;
    private String ubiacion;
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    
    public Hotel(ArrayList<Habitacion> habitaciones){
        if (habitaciones == null) {
            throw new IllegalArgumentException("Un Hotel debe tener almenos una habitacion");
        }
        habitaciones = habitaciones;
    }
    
    public ArrayList<Habitacion> ofrecerHabitaciones(){
        return habitaciones;
        
    }
    
}
