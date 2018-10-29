package sjsu.datastructure.homework.homwork2;

import java.io.File;

public class CounterTester {
    public static void main(String args[])
    {
        File inputFile = new File("GettysburgAddress.txt");
        Counter counter = new Counter(inputFile);

        int lineCount = counter.countLines();
        System.out.println("Line count: " + lineCount);
        System.out.println("Expected: 25");

        int wordCount = counter.countWords();
        System.out.println("Word count: " + wordCount);
        System.out.println("Expected: 267");

        int charCount = counter.countChars();
        System.out.println("Character count: " + charCount);
        System.out.println("Expected: 1459");
    }
}
