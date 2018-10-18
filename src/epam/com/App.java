package epam.com;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main( String[] args ) throws IOException {
        // given a jpeg file
        ClassFile classFile = new ClassFile();
        //        classFile.isFileValid(new java.io.File("obraz.jpg"));

        // given a not *png file extension
        //        classFile.isFileValid(new java.io.File("obraz.png"));
        // given a *class file extension. get value false
        classFile.isFileValid(new java.io.File("Test.class"));
    }
}
