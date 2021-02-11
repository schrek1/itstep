package cz.itstep.inheritence;

public class Triangle extends Shape {
    double a, b, c;

    @Override
    public double length() {
        return a + b + c;
    }
}
