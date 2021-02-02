package cz.itstep.fraction;

public class FractionTest {

    public static void main(String[] args) {
        testFractionPrintFormat();
        System.out.println("KONEC TESTU");
    }

    public static void testFractionPrintFormat() {
        var firstCase = new Fraction(1, 1);
        String firstResult = firstCase.printableFormat();
        if (firstResult == null || !firstResult.equals("1/1")) {
            System.err.println("test 1 - failed");
        }

        var secondCase = new Fraction(1, -1);
        String secondResult = secondCase.printableFormat();
        if (secondCase == null || !secondResult.equals("-1/1")) {
            System.err.println("test 2 - failed");
        }

        var thirdCase = new Fraction(-1, 1);
        String thirdResult = thirdCase.printableFormat();
        if (thirdResult == null || !thirdResult.equals("-1/1")) {
            System.err.println("test 3 - failed");
        }

        var fourthCase = new Fraction(-1, -1);
        String fourthResult = fourthCase.printableFormat();
        if (fourthResult == null || !fourthResult.equals("1/1")) {
            System.err.println("test 4 - failed");
        }
    }
}
