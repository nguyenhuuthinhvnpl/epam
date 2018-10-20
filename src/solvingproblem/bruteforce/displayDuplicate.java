package solvingproblem.bruteforce;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class displayDuplicate {
    public static void main( String[] args ) {
        displayDuplicate("solving problem");

    }

    public static void displayDuplicate( String str ) {
        char[] arrayChar = str.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characterMap.containsKey(arrayChar[i])) {
                characterMap.put(arrayChar[i], 1);
            } else {
                characterMap.put(arrayChar[i], characterMap.get(arrayChar[i])
                        + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = characterMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }
        }
    }
}
