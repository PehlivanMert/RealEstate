package org.example.model;

abstract public class House {
private double price;
private double squareMeter;
private int roomCount;
private int livingRoomCount;

public House(double price, double squareMeter, int roomCount, int livingRoomCount) {
    this.price = price;
    this.squareMeter = squareMeter;
    this.roomCount = roomCount;
    this.livingRoomCount = livingRoomCount;
}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }
}
