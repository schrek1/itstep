package cz.itstep.inheritence;

public class Rectangle extends Shape {

    double a, b;

    @Override
    public double length() {
        return a * b;
    }
}
