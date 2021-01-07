package cz.itstep.example4;

import java.util.Locale;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Zadej cislo: ");
        double number = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Zadejte procento: ");
        double percentage = scanner.nextDouble();

        System.out.println();
        System.out.println();

        double partOfNumber = number * percentage / 100;

        System.out.println("cislo " + number + " procento " + percentage + " = " + partOfNumber);
    }
}
