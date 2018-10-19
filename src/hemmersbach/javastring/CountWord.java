package hemmersbach.javastring;

public class CountWord {
    public static void main( String[] args ) {
        String str = "Hello world. I am a Java developer.";
        System.out.println(countWords(str));

    }

    public static int countWords( String str ) {
        String[] words = str.split(" ");
        return words.length;
    }
}
