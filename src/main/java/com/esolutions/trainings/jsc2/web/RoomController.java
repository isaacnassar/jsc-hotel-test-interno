package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.ReservationModel;
import com.esolutions.trainings.jsc2.model.ReservationRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
public class RoomController {

    private static final Gson JSON = new Gson();

    @RequestMapping(value = "/floors/{floor}/rooms/{room}/book", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String reservation(
            @PathVariable int floor,
            @PathVariable int room,
            @RequestBody ReservationRequest request) {

        return JSON.toJson(new ReservationModel(false, 0.0));
    }
}
