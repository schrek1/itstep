package cz.itstep;

import java.util.Scanner;

public class WhileExample1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("vstup: ");
            String input = scanner.nextLine();

            if ("x".equals(input)) {
                break;
            }

            System.out.println("zadali jste -> " + input);
        }
        System.out.println("konec");
    }
}
