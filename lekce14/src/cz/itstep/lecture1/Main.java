package cz.itstep.lecture1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        try {
//            divide(5, 0);
//        } catch (ArithmeticException ex) {
//            System.out.println("Chyba deleni nulou");
//        }


        String fileContent;
        try {
            fileContent = readFile("C:\\bus_reservations.xml");
        } catch (IllegalArgumentException exception) {
            System.out.println("bad file name arg");
            fileContent = "- error -";
        } catch (FileNotFound fileNotFound) {
            fileNotFound.requestedResource = "Bus ticket reservation file";
            throw fileNotFound;
        }

        System.out.println(fileContent);

    }

    public static double divide(int a, int b) {
        return a / b;
    }

    public static String readFile(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException("Path must be valid");
        }
        if (!filePath.toLowerCase().startsWith("c:\\")) {
            FileNotFound fileNotFound = new FileNotFound();
            fileNotFound.requestedPath = filePath;
            throw fileNotFound;
        }


        List<String> lines;
        try {
            /* magic  code for reading file */
            lines = Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }

        return "some text from file\n"
                + lines;
    }
}
