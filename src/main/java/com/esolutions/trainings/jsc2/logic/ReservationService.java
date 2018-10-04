package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.db.ReservationRepository;
import com.esolutions.trainings.jsc2.db.RoomRepository;
import com.esolutions.trainings.jsc2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;


    @Autowired
    public ReservationService(ReservationRepository reservationRepository,
                              RoomRepository roomRepository) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
    }

    public ReservationModel onlineReservation(ReservationRequest body, int floor, int room ){
        List<Reservation> list = this.reservationRepository.findAll();
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
            Room habitacion = this.roomRepository.findByFloorAndRoom(floor,room);
            importe = 10.0;

            reservationRepository.save(new Reservation(body.getCheckIn(), body.getCheckOut(),habitacion, importe));


        }

        return new ReservationModel(alreadyBooked, importe);
    }

}
