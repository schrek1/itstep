package cz.itstep.p2;

import cz.itstep.p2.Car;

public class Main {
    public static void main(String[] args) {
        /*
        Task 6
        Implement the Car class. The following must be stored in the class fields:
         car name,
          manufacturer,
           manufacture year,
            engine capacity.
            Implement constructors and methods of the class to input and output data, implement the access to specific fields via class methods.
            Use the method overloading mechanism
         */

        // 0
        Car lambo1 = new Car("Gallardo", "Lamborghini", 2003);
        // 1
        Car lambo2 = new Car("Reventón", "Lamborghini", 2008, 6.438);
        // 2

        System.out.println(lambo1);
        System.out.println(lambo2);

        lambo1.setEngineCapacity(5);
        System.out.println(lambo1);

    }
}
