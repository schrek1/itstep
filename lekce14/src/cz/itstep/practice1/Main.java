package cz.itstep.practice1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();

        boolean isSuccessfulRead = false;
        do {
            try {
                System.out.print("Zadej cislo <0;9>: ");
                int integer = consoleReader.readZeroToNine();
                System.out.println("zadali jste: " + integer);
                isSuccessfulRead = true;
            } catch (ConsoleReadingProblem consoleReadingProblem) {
                System.out.println("problem pri zadavani -> " + consoleReadingProblem.getMessage());
            }
        } while (!isSuccessfulRead);

    }
}
