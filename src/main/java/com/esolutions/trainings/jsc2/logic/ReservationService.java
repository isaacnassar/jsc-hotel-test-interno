package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ReservationService {

    private final JpaRepository<Reservation, Long> repository;

    @Autowired
    public ReservationService(JpaRepository<Reservation, Long> repository) {
        this.repository = repository;
    }

    public ReservationModel onlineReservation(ReservationRequest body, int floor, int room ){
        List<Reservation> list = this.repository.findAll();
        boolean alreadyBooked = false;
        double importe = 0.0;

        for (Reservation reservation: list
             ) {
            Room habitacion = reservation.getRoom();
            if(habitacion.getFloor() == floor && habitacion.getRoom() == room){
                if ( (body.getCheckIn().after(reservation.getDateOfCheckIn())
                        && body.getCheckIn().before(reservation.getDateOfCheckOut()))
                        || (body.getCheckOut().after(reservation.getDateOfCheckIn())
                        && body.getCheckOut().before(reservation.getDateOfCheckOut()))){
                    alreadyBooked = true;
                    break;
                }

            }
        }

        if (!alreadyBooked){

        }

        return new ReservationModel(alreadyBooked, importe);
    }

}
