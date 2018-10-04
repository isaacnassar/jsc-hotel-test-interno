package com.esolutions.trainings.jsc2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOMS")
public class Room {
    @Id
    private Long id;

    @Column(name = "nro_habitacion", nullable = false, unique = true)
    private String nroHabitacion;

    @Column(name = "nro_piso", nullable = false, unique = true)
    private String nroPiso;

    @Column(name = "guest", nullable = true, unique = true)
    private Guest guest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(String nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public String getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(String nroPiso) {
        this.nroPiso = nroPiso;
    }
}