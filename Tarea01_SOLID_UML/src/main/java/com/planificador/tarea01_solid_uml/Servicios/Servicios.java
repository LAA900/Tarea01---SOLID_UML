/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.planificador.completotareauml.Servicios;

import com.planificador.completotareauml.PoliticasReservable;
import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Servicios {
    protected String descripcion;
    protected String nombre;
    protected boolean disponibilidad;
    protected String idServicio;
    public ArrayList<PoliticasReservable> politicas = new ArrayList<>();
    
    public Servicios(){
        
    }
    
    
    
}
