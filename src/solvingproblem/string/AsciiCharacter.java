package solvingproblem.string;

public class AsciiCharacter {
    public static void main( String[] args ) {
        asciCharacter("I am a Java deleloper.");
    }

    private static void asciCharacter( String str ) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int num = (int) characters[i];
            System.out.println(characters[i] + ":" + num);
        }
    }

//    public static class ImmutableClass {
//        public static void main( String[] args ) {
//            String name = "John Q.Public";
//            String upperCase =  name.toUpperCase(); // name is not changed
//
//            System.out.println(name);
//            System.out.println(upperCase);
//        }
//    }
}
