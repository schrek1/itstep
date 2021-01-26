package cz.itstep;

import java.security.SecureRandom;
import java.util.Random;

public class Lecture2 {
    public static void main(String[] args) {
        int arraySize = 10;
        int maxValue = 100;
        int[] array = createRandomArray(arraySize, maxValue);
        printArray(array);
        System.out.println("The sum of the array " + arraySum(array));
    }

    public static int[] createRandomArray(int arraySize, int maxValue) {
        int[] array = new int[++arraySize];
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(maxValue);
        }
        return array;
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
