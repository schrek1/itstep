package cz.itstep.example3;

import java.util.Locale;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Zadej prvni cislo: ");
        double firstNumber = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Zadej druhe cislo: ");
        double secondNumber = scanner.nextDouble();

        System.out.println();
        System.out.println();

        System.out.println("Vysledek:");
        System.out.println("a+b=" + (firstNumber + secondNumber));
        System.out.println("a-b=" + (firstNumber - secondNumber));
        System.out.format(java.util.Locale.US, "a/b=%.2f%n", (firstNumber / secondNumber));
        System.out.println("a/b=" + (firstNumber / secondNumber));
        System.out.println("a*b=" + (firstNumber * secondNumber));

    }
}
