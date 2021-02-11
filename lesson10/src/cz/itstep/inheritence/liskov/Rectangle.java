package cz.itstep.inheritence.liskov;

public class Rectangle {
    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public String name() {
        return "Obdelnik";
    }
}
