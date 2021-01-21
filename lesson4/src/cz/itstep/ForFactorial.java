package cz.itstep;

public class ForFactorial {

    public static void main(String[] args) {
        int base = 5;

        int fact = 1;

        System.out.print(base + "! = ");
        for (int i = 1; i <= base; i++) {
            fact *= i;
            System.out.print(i);
            if (i != base) {
                System.out.print("*");
            }
        }
        System.out.print(" = " + fact);
    }
}
