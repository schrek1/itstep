package cz.itstep.inheritence.liskov;

public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String name() {
        return "Ctverec";
    }
}
