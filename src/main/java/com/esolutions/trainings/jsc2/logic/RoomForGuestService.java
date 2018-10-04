package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;

public class RoomForGuestService {

    private final JpaRepository<Guest, Long> repository;

    @Autowired
    public RoomForGuestService(JpaRepository<Guest, Long> repository) {
        this.repository = repository;
    }

    HashMap<Integer, Integer> hotelDistribution = new HashMap<Integer, Integer>();

    public void perfectSquaresRoomCalculation(int floor, int room) {
        populateHotel();

    }

    public HashMap<Integer, Integer> populateHotel() {

        for (int i = 1; i <= 50000; i++) {
            boolean notPut = true;
            while (notPut) {
                int lastfloor = 1;
                if (hotelDistribution.get(lastfloor) != null) {
                    if (isPerfectSquare(i + hotelDistribution.get(lastfloor))) {
                        hotelDistribution.put(lastfloor, i);
                        notPut = false;
                    } else {
                        lastfloor++;
                    }
                } else {
                    hotelDistribution.put(lastfloor, i);
                    notPut = false;
                }
            }
        }
        return hotelDistribution;
    }

    public boolean isPerfectSquare(double roomSum) {
        if (Math.sqrt(roomSum) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
