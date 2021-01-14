package cz.itstep.example1;

public class Example1 {
    public static void main(String[] args) {
        int inputNumber = 0;
//        int inputNumber = 1;
//        int inputNumber = 2;

        if (inputNumber % 2 == 0) {
            System.out.println("cislo je sude");
        } else {
            System.out.println("cislo je liche");
        }


        if ((inputNumber & 0b1) != 0b1) {
            System.out.println("cislo je sude");
        } else {
            System.out.println("cislo je liche");
        }

        if (inputNumber == 0) {
            System.out.println("cislo je nula");
        } else if (inputNumber % 2 == 0) {
            System.out.println("cislo je sude");
        } else {
            System.out.println("cislo je liche");
        }
    }
}
