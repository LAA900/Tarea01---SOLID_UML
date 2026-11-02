package com.planificador.tarea01_solid_uml;

import com.planificador.tarea01_solid_uml.enumerables.CanalNotificacion;
import java.util.UUID;

public class Incidente {
    private final String idNotificacion;
    private String mensaje;
    private CanalNotificacion canal;

    public Incidente() {
        this.idNotificacion = UUID.randomUUID().toString();
    }

    public Incidente(String mensaje, CanalNotificacion canal) {
        this();
        setMensaje(mensaje);
        setCanal(canal);
    }

    public String getIdNotificacion() {
        return idNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        if (mensaje == null || mensaje.isBlank()) {
            throw new IllegalArgumentException("El mensaje del incidente es obligatorio.");
        }
        this.mensaje = mensaje;
    }

    public CanalNotificacion getCanal() {
        return canal;
    }

    public void setCanal(CanalNotificacion canal) {
        if (canal == null) {
            throw new IllegalArgumentException("El canal de notificación es obligatorio.");
        }
        this.canal = canal;
    }
}
