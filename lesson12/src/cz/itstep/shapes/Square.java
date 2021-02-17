package cz.itstep.shapes;

public class Square extends Shape implements PerimeterComputable, AreaComputable {

    public int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double computeArea() {
        return a * a;
    }

    @Override
    public double computePerimeter() {
        return 4 * a;
    }

    @Override
    public String getShapeName() {
        return "square";
    }
}
