package cz.itstep.homework2;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(double actualValue) {
        super(String.format("Number is %f is negative, which is not allowed", actualValue));
    }
}
