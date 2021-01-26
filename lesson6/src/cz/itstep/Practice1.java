package cz.itstep;

public class Practice1 {
    public static void main(String[] args) {
        printEvenNumbersInRange(1, 10);
        printEvenNumbersInRange(10, 1);
    }

    public static void printEvenNumbersInRange(int start, int end) {
        if (start > end) {
            System.out.println("Sorry...Bad range");
            return;
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}
