package cz.itstep.practice1;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {

    private final Scanner scanner;

    public ConsoleReader() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    public int readZeroToNine() throws ConsoleReadingProblem {
        String lineWithNumber = scanner.nextLine();

        int integer;
        try {
            integer = Integer.parseInt(lineWithNumber.trim());
        } catch (NumberFormatException numberFormatException) {
            throw new ConsoleReadingProblem("input has bad format - not integer");
        }

        if (integer < 0 || integer > 9) {
            throw new ConsoleReadingProblem("number out of required bounds <0;9>");
        }

        return integer;
    }
}
