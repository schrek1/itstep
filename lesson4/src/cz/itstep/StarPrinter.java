package cz.itstep;

import java.util.Scanner;

public class StarPrinter {

    public static void main(String[] args) {

    }

    public void TomasImpl() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String stars = "";
        System.out.println("Zadej číslo k zobrazení očtu hvězd:");
        String input = sc.nextLine();
        input = input.replaceAll("\\D", "").replaceAll("\\s", "");
        int starCount = Integer.parseInt(input);
        while (i <= starCount) {
            stars += "*";
            i++;
        }
        System.out.println(stars);
    }

    public void DanielImpl() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej číslo: ");
        int enter = sc.nextInt();
        sc.nextLine();
        if (enter < 0) {
            System.out.println("zadal jsi záporné číslo.");
            System.exit(0);
        }
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (counter < enter) {
            sb.append("*");
            counter++;
        }
        System.out.println(sb.toString());
    }
}
