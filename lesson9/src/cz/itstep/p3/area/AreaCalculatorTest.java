package cz.itstep.p3.area;

public class AreaCalculatorTest {

    public static void main(String[] args) {
        testForSquare();
        testForRectangle();
        testForTriangle();
//        method_validDimmensions_shouldComputeArea();
    }

    private static void testForSquare() {
        final double EXPECTED_RESULT = 25;

        double result = new AreaCalculator().area(5);

        if (result != EXPECTED_RESULT) {
            System.err.println("test for rectangle failed -> expected " + EXPECTED_RESULT + " but was " + result);
        }
    }

    private static void testForRectangle() {
        final double EXPECTED_RESULT = 15;

        double result = new AreaCalculator().area(5, 3);

        if (result != EXPECTED_RESULT) {
            System.err.println("test for rectangle failed -> expected " + EXPECTED_RESULT + " but was " + result);
        }
    }

    private static void testForTriangle() {
        final double EXPECTED_RESULT = 6.4951905283833;

        double result = new AreaCalculator().area(5, 3, 7);

        if (Math.abs(result - EXPECTED_RESULT) > 0.00001) {
            System.err.println("test for rectangle failed -> expected " + EXPECTED_RESULT + " but was " + result);
        }
    }

}
