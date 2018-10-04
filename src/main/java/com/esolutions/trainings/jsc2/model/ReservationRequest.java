package com.esolutions.trainings.jsc2.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReservationRequest {
    private Date checkIn;
    private Date checkOut;

    public ReservationRequest() {
    }
}
