package com.practice.bronirovanie;

import com.practice.bronirovanie.entity.Bill;
import com.practice.bronirovanie.entity.Client;
import com.practice.bronirovanie.entity.Hotel;
import com.practice.bronirovanie.entity.Room;
import com.practice.bronirovanie.service.BookingService;


public class Main {

    public static void main(String[] args) {

        Bill barryBill = new Bill(3000);
        Client barryAccount = new Client("Barry", "Scavo", "+79003456745", "bill@mail.ru", barryBill);

        Bill olesyaBill = new Bill(5000);
        Client olesyaAccount = new Client("Olesya", "Briling", "89063456723","olesya@mail.ru", olesyaBill);

        Room[] volgaHotelRooms = new Room[]
        {new Room(1,1000, true),
        new Room(2, 2000, true),
        new Room(4, 3500, true)};

        Hotel volgaHotel = new Hotel("Volga", volgaHotelRooms);

        Room[] seligerHotelRooms = new Room[]{
        new Room(1, 2000, true),
        new Room(2, 3000, true),
        new Room(6, 6000, true)};

        Hotel seligerHotel = new Hotel("Seliger", seligerHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.BookRoom(volgaHotel, olesyaAccount, 2);
        System.out.println("\n");
        bookingService.BookRoom(seligerHotel, olesyaAccount, 5);
        System.out.println("\n");
        bookingService.BookRoom(volgaHotel, barryAccount, 4);
    }

}
