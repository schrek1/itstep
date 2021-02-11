package cz.itstep.inheritence;

public class SquareExample {

    class Square {
        int width;

        public Square(int width) {
            this.width = width;
        }

        public int getPerimeter() {
            return 4 * width;
        }

        public int getArea() {
            return width * width;
        }
    }

    class Rectangle extends Square {
        int height;

        public Rectangle(int width, int height) {
            super(width);
            this.height = height;
        }

        @Override
        public int getPerimeter() {
            return 2 * (height + width);
        }

        @Override
        public int getArea() {
            return width * height;
        }
    }
}
