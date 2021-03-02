package cz.itstep.homework1;

import java.util.Random;

public class MyArray {
    private final Random random = new Random();
    private int convertedInput;
    private final int[] array = new int[random.nextInt(10) + 1];

    public MyArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        array[array.length - 1] = 0;
    }

    public void division(String input) {
        try {
            convertedInput = Integer.parseInt(input);

            for (int i = 0; i < array.length; i++) {
                System.out.println("Celočíselný výsledek: " + (convertedInput / array[i]) + "\tZbytek: " + (convertedInput % array[i]));
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Nezadal si celočíselnou hodnotu.");
            throw nfe;
        } catch (ArithmeticException ae) {
            System.out.println("Nelze dělit nulou.");
            throw ae;
        }
    }


    public void getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(String.format("%d ", array[i]));
        }
        System.out.println();
    }
}
