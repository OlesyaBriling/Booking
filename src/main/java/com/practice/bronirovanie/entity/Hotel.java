package com.practice.bronirovanie.entity;


import java.util.ArrayList;

public class Hotel {

    private String NameHotel;
    private Room[] rooms;

    public Hotel(String nameHotel, Room[] rooms) {
        NameHotel = nameHotel;
        this.rooms = rooms;
    }



    public String getNameHotel() {
        return NameHotel;
    }

    public void setNameHotel(String nameHotel) {
        NameHotel = nameHotel;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

}
