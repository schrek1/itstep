package cz.itstep.homework_l8.h6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {

    public static void main(String[] args) throws IOException {
        XmlReader xmlReader = new XmlReader();

        for (int i = 0; i < 10; i++) {
            try {
                xmlReader.read();
            } catch (FileSystemAlreadyExistsException ex) {
                throw new FileNotFoundException(ex.toString());
            }
        }
    }
}
