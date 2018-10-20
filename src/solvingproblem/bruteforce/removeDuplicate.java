package solvingproblem.bruteforce;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main( String[] args ) {
        System.out.println(removeDuplicate("append"));

    }

    public static String removeDuplicate( String str ) {
        str.indexOf('a');
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder strBuffer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character cObject = str.charAt(i);
            if (!set.contains(cObject)) {
                set.add(cObject);
                strBuffer.append(cObject);
            }
        }
        return strBuffer.toString();
    }
}
