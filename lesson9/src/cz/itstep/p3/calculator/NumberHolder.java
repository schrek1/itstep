package cz.itstep.p3.calculator;

import java.util.Arrays;

public class NumberHolder {

    private double[] numbers = new double[3];

    private int actualIndex = 0;

    public void add(double number) {
        if (actualIndex == numbers.length) {
            numbers = Arrays.copyOf(numbers, numbers.length + 3);
        }
        numbers[actualIndex] = number;
        actualIndex++;
    }

    public double[] getAll() {
//        return numbers;
        return Arrays.copyOf(numbers, actualIndex);
    }
}
