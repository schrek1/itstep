package cz.itstep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        divide(5, 0);
//        int result = fact(0);
//        if (result < 0) {
//            if (result == -1) {
//                System.err.println("Arg must be positive");
//            }
//        }

        try {
            divide(5, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Chyba deleni nulou");
        }


        System.out.println("KONEC PROGRAMU");
    }

    public static int fact(int a) {
        if (a <= 0) {
            return -1;
        }
        return 5; // some computation
    }

    public static double divide(int a, int b) {
        return a /b;
    }
}
