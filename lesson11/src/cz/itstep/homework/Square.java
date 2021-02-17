package cz.itstep.homework;

import java.util.Objects;

public class Square extends Shape implements Cloneable {
    private String type;
    private double a;

    public Square() {

    }

    public Square(double a) {
        this.type = "Square";
        this.a = a;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void incrementEdges() {
        this.a++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return type.equals(square.type)
                && a == square.a;
    }

    @Override
    protected Square clone() {
        Square square = new Square();
        square.setType(type);
        square.setA(a);
        return square;
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                ", a=" + a +
                '}';
    }

    @Override
    public double calculateArea() {
        return 4 * a;
    }
}
