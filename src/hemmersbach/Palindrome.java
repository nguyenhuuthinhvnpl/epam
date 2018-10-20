package hemmersbach;

public class Palindrome {
    public static boolean isPalindrome( String word ) {
        for (int i = 0; i < word.length(); i++) {
            char[] ch = word.toLowerCase().toCharArray();
            System.out.print(ch[i]);
        }

        return true;
    }

    public static void main( String[] args ) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}