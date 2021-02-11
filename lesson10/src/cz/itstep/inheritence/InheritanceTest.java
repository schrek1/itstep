package cz.itstep.inheritence;

public class InheritanceTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.sum();
        child.sum();

        Rectangle rectangle = new Rectangle();
        rectangle.length();
        Square square = new Square();
        square.length();

        Shape shapeRectangle = rectangle;
        Shape shapeSquare = square;

        Shape[] shapes = {shapeRectangle, shapeSquare};

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.print("Ctverec ");
            } else if (shape instanceof Triangle) {
                System.out.print("Trojuhelnik ");
            }

            System.out.println("ma obvod: " + shape.length());
        }
    }

}
