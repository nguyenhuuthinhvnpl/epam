package string;

import java.util.Scanner;

public class CountWordLetter {
    public static void main( String[] args ) {
        //        Scanner scan = new Scanner(System.in);
        countWords("Hello World I am a Java developer");
    }

    public static void countWords( String str ) {
        char[] ch = str.toCharArray();
        int countword = 0;
        int countLetter = 0;
        for (int i = 0; i < ch.length; i++) {
            String word = "";
            while (i < ch.length && ch[i] != ' ') {
                word = word + ch[i];
                i++;
            }

            if (str.length() != 0) {
                System.out.println(word + ":" + word.length());
            }
        }


        //        String[] words = str.split(" ");
        //        for (int i = 0; i < words.length ; i++) {
        //            System.out.println(words[i]+ "->"+words[i].length());
        //        }
    }
}
