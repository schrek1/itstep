package cz.itstep.homework2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    static {
        scanner.useLocale(Locale.US);
    }

    public static void main(String[] args) throws NegativeNumberException {
        System.out.print("Zadejte cislo: ");
        int integer = readInteger();
        System.out.println("Nactene cislo - " + integer);
    }


    public static int readInteger() throws NegativeNumberException {
        String txtInteger = scanner.nextLine();
        int integer = Integer.parseInt(txtInteger);

        if (integer < 0) {
            throw new NegativeNumberException(integer);
        }

        if (integer > 100) {
            throw new GreaterNumberException(100, integer);
        }

        return integer;
    }
}
