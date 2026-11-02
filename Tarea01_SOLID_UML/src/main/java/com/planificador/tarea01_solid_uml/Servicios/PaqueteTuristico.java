
package com.planificador.tarea01_solid_uml.Servicios;

import com.planificador.tarea01_solid_uml.Reservable;
import com.planificador.tarea01_solid_uml.Servicios.Servicios;
import com.planificador.tarea01_solid_uml.enumerables.ServicioAdicional;
import com.planificador.tarea01_solid_uml.enumerables.EstadoPaseoTuristico;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class PaqueteTuristico extends Servicios implements Reservable{
    
    private EstadoPaseoTuristico EstadoPaquete;
    ArrayList<Reservable> servicios = new ArrayList<>();
    ArrayList<ServicioAdicional> serviciosAdicionales = new ArrayList<>();
    ArrayList<Descuento> descuentos = new ArrayList<>();
    
    
    public PaqueteTuristico(){
        
    }
    

    @Override
    public boolean verificarDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public void confirmarReserva() {
        
    }
    
    public void combinarServicios(Reservable servicio){
        servicios.add(servicio);
    }

    @Override
    public void bloquearTemporalmente() {
         
    }

    @Override
    public void cambiarEstado() {
       
    }
    
    
    
}
