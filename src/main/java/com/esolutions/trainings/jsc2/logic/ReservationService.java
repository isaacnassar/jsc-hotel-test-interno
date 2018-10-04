package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.model.Guest;
import com.esolutions.trainings.jsc2.model.Reservation;
import com.esolutions.trainings.jsc2.model.ReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ReservationService {

    private final JpaRepository<Reservation, Long> repository;

    @Autowired
    public ReservationService(JpaRepository<Reservation, Long> repository) {
        this.repository = repository;
    }

    public void onlineReservation(ReservationRequest body, int floor, int room ){



    }

}
