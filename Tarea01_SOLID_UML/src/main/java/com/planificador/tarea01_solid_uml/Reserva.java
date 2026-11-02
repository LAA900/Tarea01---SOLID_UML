package com.planificador.tarea01_solid_uml;

import com.planificador.tarea01_solid_uml.enumerables.TipoReserva;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Reserva {
    private String idCliente;
    private final String idReserva;
    private String estadoPago;
    private TipoReserva tipoReserva;
    private final List<Reservable> servicios = new ArrayList<>();

    public Reserva() {
        this.idReserva = UUID.randomUUID().toString();
        this.estadoPago = "PENDIENTE";
    }

    public Reserva(String idCliente, TipoReserva tipoReserva) {
        this();
        setIdCliente(idCliente);
        setTipoReserva(tipoReserva);
    }

    public void agregarItem(Reservable reservable) {
        if (reservable == null) {
            throw new IllegalArgumentException("El servicio reservable no puede ser null.");
        }
        if ("PAGADO".equals(estadoPago)) {
            throw new IllegalStateException("No se pueden agregar servicios a una reserva pagada.");
        }
        servicios.add(reservable);
    }

    public void completarPago() {
        if ("PAGADO".equals(estadoPago)) {
            return;
        }
        if (idCliente == null || tipoReserva == null) {
            throw new IllegalStateException("La reserva debe tener cliente y tipo antes de completar el pago.");
        }
        if (servicios.isEmpty()) {
            throw new IllegalStateException("No se puede completar el pago de una reserva sin servicios.");
        }

        for (Reservable servicio : servicios) {
            if (!servicio.verificarDisponibilidad()) {
                throw new IllegalStateException("No todos los servicios de la reserva están disponibles.");
            }
        }

        for (Reservable servicio : servicios) {
            servicio.confirmarReserva();
        }
        estadoPago = "PAGADO";
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        if (idCliente == null || idCliente.isBlank()) {
            throw new IllegalArgumentException("El id del cliente es obligatorio.");
        }
        this.idCliente = idCliente;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public TipoReserva getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(TipoReserva tipoReserva) {
        if (tipoReserva == null) {
            throw new IllegalArgumentException("El tipo de reserva es obligatorio.");
        }
        this.tipoReserva = tipoReserva;
    }

    public List<Reservable> getServicios() {
        return Collections.unmodifiableList(servicios);
    }
}
