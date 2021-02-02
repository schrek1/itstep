package cz.itstep.fraction;

public class Fraction {

    private final int numerator; // citatel
    private final int denominator; // jemnovatel

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("jmenovatel se nesmi rovnat nule");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addition(Fraction other) {
        if (other == null) {
            return null;
        }
        int lcm = MathUtils.lowestCommonMultiple(this.denominator, other.denominator);
        int numerator = ((lcm / this.denominator) * this.numerator) + ((lcm / other.denominator) * other.numerator);

        return new Fraction(numerator, lcm);
    }

    public Fraction subtraction(Fraction other) {
        if (other == null) {
            return null;
        }
        int lcm = MathUtils.lowestCommonMultiple(this.denominator, other.denominator);
        int numerator = ((lcm / this.denominator) * this.numerator) - ((lcm / other.denominator) * other.numerator);

        return new Fraction(numerator, lcm);
    }

    public Fraction multiply(Fraction other) {
        if (other == null) {
            return null;
        }

        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;

        return new Fraction(numerator, denominator).toLowestTerm();
    }

    public Fraction division(Fraction other) {
        if (other == null) {
            return null;
        }

        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;

        return new Fraction(numerator, denominator).toLowestTerm();
    }

    public Fraction toLowestTerm() {
        int gcd = MathUtils.greatestCommonDivisor(numerator, denominator);

        int numerator = this.numerator / gcd;
        int denominator = this.denominator / gcd;

        return new Fraction(numerator, denominator);
    }

    public String printableFormat() {
        boolean isNegative = numerator < 0 ^ denominator < 0;
        return (isNegative ? "-" : "") + Math.abs(numerator) + "/" + Math.abs(denominator);
    }

}
