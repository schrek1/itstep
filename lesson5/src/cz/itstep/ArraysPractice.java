package cz.itstep;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej číslo velikosti pole: ");
        int[] numb = new int[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < numb.length; i++) {
            System.out.printf("Zadej číslo na pozici %d: ", (i + 1));
            numb[i] = sc.nextInt();
            sc.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < numb.length; i++) {
            sum += numb[i];
        }

        System.out.println(Arrays.toString(numb));
        System.out.println("Součet čísel v polích je: " + sum);
        System.out.println("Průměr čísel v polích je: " + (sum / numb.length));
    }
}
