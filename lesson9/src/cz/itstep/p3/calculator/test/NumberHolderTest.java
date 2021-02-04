package cz.itstep.p3.calculator.test;

import cz.itstep.p3.calculator.NumberHolder;

public class NumberHolderTest {

    public static void main(String[] args) {
        testEmpty();
        testExtending();
    }

    private static void testEmpty() {
        NumberHolder numberHolder = new NumberHolder();

        if (numberHolder.getAll().length != 0) {
            System.err.println("number holder empty test error");
        }

    }

    private static void testExtending() {
        NumberHolder numberHolder = new NumberHolder();

        numberHolder.add(1);
        numberHolder.add(2);
        numberHolder.add(3);
        numberHolder.add(4);
        numberHolder.add(5);
        numberHolder.add(6);
        numberHolder.add(7);

        if (numberHolder.getAll().length != 7) {
            System.err.println("number holder extending test error");
        }
    }
}
