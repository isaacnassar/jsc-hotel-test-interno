package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class RoomForGuestService {

    private final JpaRepository<Guest, Long> repository;

    @Autowired
    public RoomForGuestService(JpaRepository<Guest, Long> repository) {
        this.repository = repository;
    }

}
