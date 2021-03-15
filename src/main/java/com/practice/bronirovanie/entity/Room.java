package com.practice.bronirovanie.entity;

public class Room {

    private int numberOfPeople;
    private int price;
    private boolean status;

    public Room(int numberOfPeople, int price, boolean status) {
        this.numberOfPeople = numberOfPeople;
        this.price = price;
        this.status = status;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
