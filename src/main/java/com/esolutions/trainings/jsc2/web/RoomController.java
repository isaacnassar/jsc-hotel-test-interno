package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.ReservationModel;
import com.esolutions.trainings.jsc2.model.ReservationRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @RequestMapping(value = "/floors/{floor}/rooms/{room}", method = RequestMethod.GET)
    public ReservationModel reservation(
            @PathVariable int floor, int room,
            @RequestParam(value = "ReservationRequest", required = true) ReservationRequest request) {

        return new ReservationModel(false, 0.0);
    }
}
