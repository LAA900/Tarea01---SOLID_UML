package com.planificador.tarea01_solid_uml;

import com.planificador.tarea01_solid_uml.enumerables.CanalNotificacion;

public class ServicioNotificacion {

    public void enviarNotificacion(Incidente incidente) {
        if (incidente == null) {
            throw new IllegalArgumentException("El incidente no puede ser null.");
        }
        if (incidente.getMensaje() == null || incidente.getMensaje().isBlank()) {
            throw new IllegalArgumentException("El incidente debe tener un mensaje.");
        }

        CanalNotificacion canal = incidente.getCanal();
        if (canal == null) {
            throw new IllegalArgumentException("El incidente debe tener un canal de notificación.");
        }

        switch (canal) {
            case CORREO_ELECTRONICO ->
                System.out.println("Simulación de notificación por correo electrónico: " + incidente.getMensaje());
            case APLICACION_MENSAJERIA ->
                System.out.println("Simulación de notificación por aplicación de mensajería: " + incidente.getMensaje());
        }
    }
}
