package cz.itstep.inheritence.liskov;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(1);
        System.out.println(square.area());
        System.out.println(square.name() + " obvod = " + square.area());

        Rectangle polyRect = square;
        System.out.println(polyRect.name() + " obvod = " + polyRect.area());


        Rectangle originalRect = new Rectangle(1, 1);
        System.out.println(originalRect.name() + " obvod = " + originalRect.area());


    }
}
