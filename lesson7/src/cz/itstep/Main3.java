package cz.itstep;

public class Main3 {

    public static void main(String[] args) {
        int seats = 5;
        String name = "Skoda Felicia";

        Car felica = new Car(name, seats);
        Car octavia = new Car("Skoda Octavia");

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());

        System.out.println();

        felica.setOccupiedSeats(2);

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());

        System.out.println();

        felica.setOccupiedSeats(10);

        System.out.println(felica.getInfo());
        System.out.println();
        System.out.println(octavia.getInfo());
    }

}
