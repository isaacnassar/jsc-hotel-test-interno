package com.esolutions.trainings.jsc2.model;

import javax.persistence.*;

@Entity
@Table(name = "ROOMS")
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "room", nullable = false, unique = true)
    private int room;

    @Column(name = "floor", nullable = false, unique = true)
    private int floor;

    @Column(name = "tipo", nullable = false, unique = true)
    private String tipo;

    public Room(int room, int floor, String tipo) {
        this.room = room;
        this.floor = floor;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
