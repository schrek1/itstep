package cz.itstep.p3.area;

public class AreaCalculator {

    public double area(double a) {
        return Math.pow(a, 2);
    }

    public double area(double a, double b) {
        return a * b;
    }

    public double area(double a, double b, double c) {
        return 0.25 * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
    }
}
