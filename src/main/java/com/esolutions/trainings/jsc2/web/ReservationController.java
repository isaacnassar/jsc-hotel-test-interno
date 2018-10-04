package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.ReservationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ReservationController {

    @Autowired
    public ReservationController() {
    }

    @GetMapping(value = "/floors/{floor}/rooms/{room}/book")
    public ReservationModel getGuestNumber(@PathVariable int floor, @PathVariable int room) {
        return new ReservationModel(true, 0.0);

    }
}
