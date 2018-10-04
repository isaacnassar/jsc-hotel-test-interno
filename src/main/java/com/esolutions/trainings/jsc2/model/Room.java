package com.esolutions.trainings.jsc2.model;

import javax.persistence.*;

@Entity
@Table(name = "ROOMS")
public class Room {
    @Id
    private Long id;

    @Column(name = "nro_habitacion", nullable = false, unique = true)
    private String nroHabitacion;

    @Column(name = "nro_piso", nullable = false, unique = true)
    private String nroPiso;

    @Column(name = "tipo", nullable = false, unique = true)
    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
