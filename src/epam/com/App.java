package epam.com;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main( String[] args ) throws IOException {
        // given a jpeg file
        ClassFile classFile = new ClassFile();
        classFile.isFileValid(new java.io.File("obraz.jpg"));

    }
}
