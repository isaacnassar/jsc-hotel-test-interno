package com.esolutions.trainings.jsc2.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReservationRequest {
    private Date checkIn;
    private Date checkOut;

    public ReservationRequest() {
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
