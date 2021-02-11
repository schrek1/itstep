package cz.itstep;

import java.time.LocalDate;

import java.time.Period;

public class Main {


    public static void main(String[] args) {
        Object object1 = new Car("Skoda Octavia", "stribrna");

        Car car = new Car("Skoda Octavia", "stribrna");

        Person p1 = new Person();
        p1.setFirstName("Jan");
        p1.setLastName("Novak");
        p1.setBorn(LocalDate.of(2000, 1, 1));
        p1.setAge(21);
        p1.setCar(car);

        Person p2 = new Person();
        p2.setFirstName("Jan");
        p2.setLastName("Novak");
        p2.setBorn(LocalDate.of(2000, 1, 1));
        p2.setAge(21);

        System.out.println(p1.hashCode());
        System.out.println("zmena");
        p1.setFirstName(p1.getFirstName() + " ");
        System.out.println(p1.hashCode());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

//        Object[] objects = new Object[]{object1, p1, p2};


        Person p3 = p1.clone();
        p3.setFirstName("Karel");

        Car p1Car = p1.getCar();

        Car p1UpgradedCar = new Car(p1Car.getType(), "red");
        p1.setCar(p1UpgradedCar);


        System.out.println(p1);


    }
}
