package cz.itstep;

public class OdsAndEvens {

    // m...n

    // m = 10, n = 20

    //  10      12      14      16      18      20
    //      11      13      15      17      19

    public static void main(String[] args) {
        int m = 10, n = 20;

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + "\t\t");
        }

        System.out.println();

        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) continue;
            System.out.print("\t" + i + "\t");
        }

    }
}
