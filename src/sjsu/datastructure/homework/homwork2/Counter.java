package sjsu.datastructure.homework.homwork2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {
    private File inputFile;

    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }

    public int countLines() {
        int count = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
            while(scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(" File was not found.");
        }finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return count;
    }

    public int countWords()
    {
        int count = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(inputFile);
            while(scanner.hasNext()){
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(" File was not found.");
        }finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return count;
    }

    public int countChars()
    {
        int count = 0;
        Scanner wordsScanner = null;
        try {
            wordsScanner = new Scanner(inputFile);
            wordsScanner.useDelimiter("");
            while (wordsScanner.hasNext()) {
                    ++count;
                    wordsScanner.next();
                }
            } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }finally {
            if ( inputFile != null) {
                wordsScanner.close();
            }
        }
        return count;
    }

}
