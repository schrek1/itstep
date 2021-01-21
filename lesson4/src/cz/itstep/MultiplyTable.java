package cz.itstep;

public class MultiplyTable {
    // <----> 2-10
    // *1-10

    // 1*2=2    1*3=3
    // 2*2=4    2*3=6

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d", j, i, (i * j));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}


