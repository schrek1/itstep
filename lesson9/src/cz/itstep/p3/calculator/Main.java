package cz.itstep.p3.calculator;

import cz.itstep.p3.calculator.Calculator;
import cz.itstep.p3.calculator.NumberHolder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.add(1);
        numberHolder.add(2);
        numberHolder.add(3);
        numberHolder.add(4);
        numberHolder.add(5);
        numberHolder.add(7);

        Calculator calculator = new Calculator();
        double avg = calculator.avg(numberHolder);
        System.out.println(avg);

        double[] inc = calculator.incrementAll(numberHolder);
        System.out.println(Arrays.toString(inc));
        System.out.println(Arrays.toString(numberHolder.getAll()));


        numberHolder.add(8);

        double sum = calculator.sum(numberHolder);
        System.out.println(sum);
    }
}
