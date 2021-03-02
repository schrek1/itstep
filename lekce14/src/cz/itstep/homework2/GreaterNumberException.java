package cz.itstep.homework2;

public class GreaterNumberException extends RuntimeException {
    public GreaterNumberException(double maxValue, double actualValue) {
        super(String.format("Exceed number value max is %f, but current is %f", maxValue, actualValue));
    }
}
