package cz.itstep;

import java.util.UUID;

public class Car {

    public static final int WHEELS_COUNT = 4;


    public final int seats;
    public final String name;
    public final String vin;
    private int occupiedSeats;

    public final double motorCubature = 0;

    public Car(String name) {
        this(name, 5);
    }

    public Car(String name, int seats) {
        this.seats = seats;
        this.name = name;
        vin = UUID.randomUUID().toString();
    }

    public String getInfo() {
        return "name: " + name + "\n" +
                "vin: " + vin + "\n" +
                "motorCubature: " + motorCubature + "\n" +
                "seats: " + occupiedSeats + "/" + seats;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setOccupiedSeats(int occupiedSeats) {
        if (occupiedSeats <= seats) {
            this.occupiedSeats = occupiedSeats;
        }
    }

    public static String getCarInfo(Car car) {
        if (car == null) {
            return "car info not found due to bad function arg";
        }
        return "name: " + car.name + "\n" +
                "vin: " + car.vin + "\n" +
                "motorCubature: " + car.motorCubature + "\n" +
                "seats: " + car.occupiedSeats + "/" + car.seats;
    }
}
