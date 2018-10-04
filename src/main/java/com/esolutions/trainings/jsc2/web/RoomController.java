package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.ReservationModel;
import com.esolutions.trainings.jsc2.model.ReservationRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @RequestMapping(value = "/floors/{floor}/rooms/{room}/book", method = RequestMethod.POST)
    public ReservationModel reservation(
            @PathVariable int floor,
            @PathVariable int room,
            @RequestBody ReservationRequest request) {



        ReservationModel reservationModel = new ReservationModel(false, 0.0);
        return reservationModel;
    }
}
