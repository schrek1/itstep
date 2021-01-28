package cz.itstep;

public class Main1 {

    public static void main(String[] args) {
        int seats = 5;
        String name = "Skoda Felicia";

        Car felica = new Car(name, seats);
        Car octavia = new Car("Skoda Octavia");

        printCarInfo(felica);
        System.out.println();
        printCarInfo(octavia);

        System.out.println();

//        felica.occupiedSeats = 2;

        printCarInfo(felica);
        System.out.println();
        printCarInfo(octavia);

        System.out.println();

//        felica.occupiedSeats = 10;

        printCarInfo(felica);
        System.out.println();
        printCarInfo(octavia);

        felica.getInfo();
        Car.getCarInfo(felica);


        System.out.println(felica.name);

    }

    public static void printCarInfo(Car car) {
        if (car == null) {
            System.out.println("Blby argument...zadna akce");
            return;
        }
        System.out.println(
                "name: " + car.name + "\n" +
                        "vin: " + car.vin + "\n" +
                        "seats: " + car.getOccupiedSeats() + "/" + car.seats
        );
    }

}
