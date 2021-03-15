package com.practice.bronirovanie.service;


import com.practice.bronirovanie.entity.Bill;
import com.practice.bronirovanie.entity.Client;
import com.practice.bronirovanie.entity.Hotel;
import com.practice.bronirovanie.entity.Room;


import java.util.ArrayList;

public class BookingService {

    public void BookRoom(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFree = false;
        for (Room r : rooms) {
            if (r.isStatus() ) {
                isFree = true;
            }
        }
            if (!isFree) {
                System.out.println("Свободных номеров в отеле " + hotel.getNameHotel() + " нет");
            }

            booking (hotel, client, numberOfPerson, rooms);
        }


    private void booking(Hotel hotel, Client client, int numberOfPerson, Room[] rooms) {
        boolean success = false;
        for (Room room : rooms) {
            if (room.getNumberOfPeople() == numberOfPerson) {
                success = true;
                if (client.getBill().getSum() >= room.getPrice()) {
                    Bill clientBill = client.getBill();
                    clientBill.setSum(clientBill.getSum() - room.getPrice());
                    room.setStatus(false);
                    System.out.println("Поздравляем, вы забронировали номер на " + room.getNumberOfPeople() + " человек в отеле " + hotel.getNameHotel() +
                            " на имя " + client.getName());
                } else {
                    System.out.println("Недостаточно средств для бронирования");
                }
            }
        }

              if (!success) {
                    System.out.println("Не нашлось подходящего номера");
                }
            }
        }

