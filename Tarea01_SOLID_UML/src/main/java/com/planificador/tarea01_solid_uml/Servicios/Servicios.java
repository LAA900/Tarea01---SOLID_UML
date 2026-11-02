
package com.planificador.tarea01_solid_uml.Servicios;

import com.planificador.tarea01_solid_uml.PoliticasReservable;
import java.util.ArrayList;


public class Servicios {
    protected String descripcion;
    protected String nombre;
    protected boolean disponibilidad;
    protected String idServicio;
    public ArrayList<PoliticasReservable> politicas = new ArrayList<>();
    
    public Servicios(){
        
    }
    
    
    
}
