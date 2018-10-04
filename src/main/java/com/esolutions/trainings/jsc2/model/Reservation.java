package com.esolutions.trainings.jsc2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATIONS")
public class Reservation {
    @Id
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "check_in")
    private Date dateOfCheckIn;

    @Temporal(TemporalType.DATE)
    @Column(name = "chech_out")
    private Date dateOfCheckOut;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Guest guest;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private Room room;

    @Column(name = "importe_total", nullable = false, unique = true)
    private double importeTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfCheckIn() {
        return dateOfCheckIn;
    }

    public void setDateOfCheckIn(Date dateOfCheckIn) {
        this.dateOfCheckIn = dateOfCheckIn;
    }

    public Date getDateOfCheckOut() {
        return dateOfCheckOut;
    }

    public void setDateOfCheckOut(Date dateOfCheckOut) {
        this.dateOfCheckOut = dateOfCheckOut;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
}
