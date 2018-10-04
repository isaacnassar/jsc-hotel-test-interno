package com.esolutions.trainings.jsc2.model;

import org.springframework.stereotype.Component;

@Component
public class Reservation {

    private boolean booked;
    private double price;

    public Reservation(boolean booked, double price) {
        this.booked = booked;
        this.price = price;
    }
}
