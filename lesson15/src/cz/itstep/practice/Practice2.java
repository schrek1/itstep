package cz.itstep.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {

    public static <T extends Number> double max(T... numbers) {
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Bad numbers...");
        }

        double max = Double.MIN_VALUE;

        for (Number number : numbers) {
            double value = number.doubleValue();
            if (value > max) {
                max = value;
            }
        }

        Arrays.sort(new char[]);

        new ArrayList<>();

        return max;
    }

    public static void main(String[] args) {
        Number intMax = max(5, 1, 3, 5);
        System.out.println(intMax);

        Number decMax = max(5.0, 3.5, 7.5);
        System.out.println(decMax);
    }
}
