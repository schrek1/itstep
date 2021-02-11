package cz.itstep.inheritence;

public class Square extends Shape {
    public double a;

    @Override
    public double length() {
        return a * 4;
    }
}
