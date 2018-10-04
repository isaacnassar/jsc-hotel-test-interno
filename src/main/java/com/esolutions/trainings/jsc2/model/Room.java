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

    @Column(name = "nroHabitacion", nullable = false, unique = true)
    private String nroHabitacion;

    @Column(name = "nroPiso", nullable = false, unique = true)
    private String nroPiso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
