package cz.itstep.shapes;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(8);
        Cube cube = new Cube(15);

        Shape[] shapes = {square, cube};

        for (Shape shape : shapes) {
            String shapeName = shape.getShapeName();
            System.out.println(shapeName + ":");
            if (shape instanceof PerimeterComputable) {
                PerimeterComputable perimeterComputableInstance = (PerimeterComputable) shape;
                double area = perimeterComputableInstance.computePerimeter();
                System.out.println("- perimeter = " + area);
            }
            if (shape instanceof AreaComputable) {
                AreaComputable areaComputableInstance = (AreaComputable) shape;
                double area = areaComputableInstance.computeArea();
                System.out.println("- area = " + area);
            }

            if (shape instanceof CubicComputable) {
                CubicComputable cubicComputableInstance = (CubicComputable) shape;
                double area = cubicComputableInstance.computeCubic();
                System.out.println("- cubic = " + area);
            }
        }
    }
}
