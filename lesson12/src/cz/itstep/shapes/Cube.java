package cz.itstep.shapes;

public class Cube extends Shape implements AreaComputable, CubicComputable, PerimeterComputable {

    public int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double computeArea() {
        return 6 * a * a;
    }

    @Override
    public double computeCubic() {
        return a * a * a;
    }

    @Override
    public double computePerimeter() {
        return 12 * a;
    }

    @Override
    public String getShapeName() {
        return "cubic";
    }
}
