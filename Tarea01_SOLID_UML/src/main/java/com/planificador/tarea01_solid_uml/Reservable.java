/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.planificador.completotareauml;

/**
 *
 * @author aleja
 */
public interface Reservable {
    
    public boolean verificarDisponibilidad();
    
    public void bloquearTemporalmente();
    
    public void confirmarReserva();
    
    public void cambiarEstado();
}
