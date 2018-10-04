package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.model.Guest;
import com.esolutions.trainings.jsc2.model.GuestForRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;

public class RoomForGuestService {

    private final JpaRepository<Guest, Long> repository;

    @Autowired
    public RoomForGuestService(JpaRepository<Guest, Long> repository) {
        this.repository = repository;
    }

    HashMap<Integer, GuestForRoom> hotelDistribution = new HashMap<Integer, GuestForRoom>();

    public void perfectSquaresRoomCalculation(int floor, int room) {
        populateHotel();

    }

    public HashMap<Integer, GuestForRoom> populateHotel() {

        for (int i = 1; i <= 50000; i++) {
            boolean notPut = true;
            while (notPut) {
                int lastFloor = 1;
                if (hotelDistribution.get(lastFloor) != null) {
                    if (isPerfectSquare(i + hotelDistribution.get(lastFloor).getOrder())) {
                        hotelDistribution.put(lastFloor, new GuestForRoom(i, hotelDistribution.get(lastFloor).getRoom() + 1));
                        notPut = false;
                    } else {
                        lastFloor++;
                    }
                } else {
                    hotelDistribution.put(lastFloor, new GuestForRoom(i, 1));
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
