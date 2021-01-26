package cz.itstep;

public class Practice2 {

    enum Direction {
        VERTICAL,
        HORIZONTAL
    }

    public static void main(String[] args) {
        printSymbolLine(5, Direction.HORIZONTAL, '-');
        printSymbolLine(10, Direction.VERTICAL, '|');
    }

    public static void printSymbolLine(int length, Direction direction, char symbol) {
        if (length <= 0) {
            return;
        }
        if (direction == null) {
            System.out.println("Sorry...missing correct direction");
        }
        if (Character.isWhitespace(symbol)) {
            return;
        }

        for (int i = 0; i < length; i++) {
            if (Direction.HORIZONTAL == direction) {
                System.out.print(symbol);
            } else {
                System.out.println(symbol);
            }
        }
        System.out.println();
    }
}
