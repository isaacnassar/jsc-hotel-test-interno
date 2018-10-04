package com.esolutions.trainings.jsc2.model;

import org.springframework.stereotype.Component;

@Component
public class ReservationRequest {
    private String checkIn;
    private String checkOut;

    public ReservationRequest() {
    }
}
