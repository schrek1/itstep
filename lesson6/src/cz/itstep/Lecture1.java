package cz.itstep;

import java.util.Arrays;


public class Lecture1 {
    public static void main(String[] args) {
        A.hello(); // method call
        String name = "Jan";
        printToConsole(name);

        int[] ints = new int[3];
        fillArray(ints, 3);
        System.out.println(Arrays.toString(ints));

        int[] intsReturned = fillArrayWithReturn(new int[3], 3);
        System.out.println(Arrays.toString(intsReturned));
    }

    public static void fillArray(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = value;
        }
    }

    public static int[] fillArrayWithReturn(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = value;
        }
        return ints;
    }

    public static double sumOf(double a, double b) {
        double result = a + b;
        return result;
    }

    public static void printToConsole(String name) {
        if (name == null) {
            return;
        }
        name = "bbb";
        System.out.println("Hello " + name + "!");
    }
}

class A {

    public static void hello() {
        System.out.println("Hello world!");
    }
}
