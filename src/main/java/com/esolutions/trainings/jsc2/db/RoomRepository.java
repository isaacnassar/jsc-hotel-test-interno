package com.esolutions.trainings.jsc2.db;

import com.esolutions.trainings.jsc2.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT t FROM Room t WHERE t.room = ?1 AND t.floor = ?2")
    Room findByFloorAndRoom(int floor, int room);
}
