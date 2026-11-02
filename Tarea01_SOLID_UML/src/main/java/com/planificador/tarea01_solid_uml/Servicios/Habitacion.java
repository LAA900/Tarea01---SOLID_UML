/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.planificador.completotareauml.Servicios;

import com.planificador.completotareauml.Reservable;
import com.planificador.completotareauml.Servicios.Servicios;
import com.planificador.completotareauml.enumerables.EstadoHabitacion;
import com.planificador.completotareauml.enumerables.OpcionAdicional;
import com.planificador.completotareauml.enumerables.TipoHabitacion;

/**
 *
 * @author aleja
 */
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
