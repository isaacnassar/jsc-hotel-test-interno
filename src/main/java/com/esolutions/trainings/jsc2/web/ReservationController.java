package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Reservation;
import com.esolutions.trainings.jsc2.model.ReservationModel;
import com.esolutions.trainings.jsc2.model.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class ReservationController {

    @Autowired
    public ReservationController() {
    }

    @RequestMapping(value = "/floors/{floor}/rooms/{room}/book", method = RequestMethod.POST)
    public ReservationModel getGuestNumber(
            @PathVariable int floor,
            @PathVariable int room,
            @RequestParam(value = "date", required = true) ReservationRequest request) {


        return new ReservationModel(true, 0.0);
    }
}
