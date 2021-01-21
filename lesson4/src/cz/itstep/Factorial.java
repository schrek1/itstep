package cz.itstep;

public class Factorial {

    public static void main(String[] args) {
        int base = 5;

        int i = 1;
        int fact = 1;

        while (i <= base) {
            System.out.print(i + (i != base ? "*" : ""));
            fact *= i;
            i++;
        }

        System.out.println();

        System.out.println(base + "! = " + fact);
    }
}
