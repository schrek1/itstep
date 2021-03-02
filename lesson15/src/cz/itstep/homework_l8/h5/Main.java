package cz.itstep.homework_l8.h5;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        try {
            new Runner().halt();
        } catch (RuntimeException exception) {
            System.out.println("halt");
        }
    }
}
