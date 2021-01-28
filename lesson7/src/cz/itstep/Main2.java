package cz.itstep;

public class Main2 {

    public static void main(String[] args) {
        int seats = 5;
        String name = "Skoda Felicia";

        Car felica = new Car(name, seats);
        Car octavia = new Car("Skoda Octavia");

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());

        System.out.println();

//        felica.occupiedSeats = 2;

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());

        System.out.println();

//        felica.occupiedSeats = 10;

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());
    }

}
