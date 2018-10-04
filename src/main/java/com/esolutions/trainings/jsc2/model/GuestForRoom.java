package com.esolutions.trainings.jsc2.model;

public class GuestForRoom {

    private int order;
    private int room;

    public GuestForRoom(int order, int room) {
        this.order = order;
        this.room = room;
    }

    public int getOrder() {
        return order;
    }

    public int getRoom() {
        return room;
    }

}
