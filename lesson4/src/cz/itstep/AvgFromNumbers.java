package cz.itstep;

import java.util.Locale;
import java.util.Scanner;

public class AvgFromNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double sum = 0.0;
        int count = 0;

        System.out.print("vstup: ");

        do {
            double input = scanner.nextDouble();
            sum += input;
            count++;
            System.out.print("vstup: ");
        } while (scanner.hasNextDouble());

        System.out.println("AVG of " + count + " numbers is " + sum / count);

        double avg = sum / count;
        System.out.printf("AVG of %d numbers is  %.2f", count, avg);

    }
}
