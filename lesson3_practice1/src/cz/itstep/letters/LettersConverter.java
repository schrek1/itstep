package cz.itstep.letters;

public class LettersConverter {

    public static void main(String[] args) {
        /**
         * lowercase letter -> print as uppercase letter
         * uppercase letter -> print as lowercase letter
         * not letter -> print as it
         */

        char inputChar = 'a';
//        char inputChar='A';
//        char inputChar=';';

        if (inputChar >= 97 && inputChar <= 122) {
            // lower to upper
            inputChar -= 32;
        } else if (inputChar >= 'A' && inputChar <= 'Z') {
            // upper to lower
            inputChar += 'a' - 'A';
        } else {
            // do nothing...
        }

        System.out.println(inputChar);
    }
}
