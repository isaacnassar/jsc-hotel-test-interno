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
    private Long importeTotal;
}
