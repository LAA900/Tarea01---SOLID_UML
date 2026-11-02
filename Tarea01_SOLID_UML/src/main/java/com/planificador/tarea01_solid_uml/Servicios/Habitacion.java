package com.planificador.tarea01_solid_uml.Servicios;

import com.planificador.tarea01_solid_uml.Reservable;
import com.planificador.tarea01_solid_uml.Servicios.Servicios;
import com.planificador.tarea01_solid_uml.enumerables.EstadoHabitacion;
import com.planificador.tarea01_solid_uml.enumerables.OpcionAdicional;
import com.planificador.tarea01_solid_uml.enumerables.TipoHabitacion;


public class Habitacion extends Servicios implements Reservable{
    
    private TipoHabitacion tipo;
    private OpcionAdicional opcionAdicional;
    private EstadoHabitacion estadoHabitacion;

    @Override
    public boolean verificarDisponibilidad() {
        
        return disponibilidad;
        
    }

    @Override
    public void confirmarReserva() {
        
    }

    @Override
    public void bloquearTemporalmente() {
        }

    @Override
    public void cambiarEstado() {
        
    }
    
    
    
    
    
}
