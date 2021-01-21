package cz.itstep;

public class Main {

    public static void main(String[] args) {
        for (int i = 1, j = 3; i < 5 & j > 0; i++, --j) {
            System.out.println("i = " + i + " j = " + j);
        }

        int i = 0;
        while (i < 10) {
            i++;
        }
    }
}
