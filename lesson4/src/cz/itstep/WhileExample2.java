package cz.itstep;

import java.util.Scanner;

public class WhileExample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



/* bad impl

        String input = null;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("vstup: ");
            input = scanner.nextLine();
            isValid = !input.isBlank();
        }

 */


        String input;
        do {
            System.out.print("vstup: ");
            input = scanner.nextLine();
        } while (input.isBlank());

        System.out.println("zadali jste -> " + input);

        System.out.println("konec");
    }

}
