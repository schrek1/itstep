package cz.itstep;

public class StarRectangle {

    public static void main(String[] args) {
        int x = 5, y = 3;

        for (int line = 1; line <= y; line++) {
            for (int index = 0; index <= x; index++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
