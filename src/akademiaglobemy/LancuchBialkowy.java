package akademiaglobemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class LancuchBialkowy {
    private  String s1;
    private  String s2;

    public LancuchBialkowy( String s1, String s2 ) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public boolean changePossible( String s1, String s2){
        // check if both strings have the same length, if not, return false
        if (s1.length() != s2.length()){
            return false;
        }

        // create HashMap, make character as key and its count as value
        HashMap<Character, Integer> ht = new HashMap<>();
        // check if that character already existing in hashmap, if yes then
        // increase its count by one. Otherwise, insert into the hashmap with
        // count as 1.

        for (int i = 0; i < s1.length() ; i++) {
            char c = s1.charAt(i);
            if (ht.containsKey(c)){
                int val = ht.get(c) + 1;
                ht.put(c, val);
            }else{
                ht.put(c, 1);
            }
        }
        // navigate second string
        for (int i = 0; i < s2.length() ; i++) {
            // check if character exists in hash map. If yes then decrease its
            // count by one, otherwise return false
            char c = s2.charAt(i);
            if (ht.containsKey(c)) {
                int val = ht.get(c);
                if (val == 0){
                    return false;
                }
                val--;
                ht.put(c, val);
            }else{
                return false;
            }
        }

        // check if all keys has 0 count
        Set keys = ht.keySet();
        Iterator<Character> iterator = keys.iterator();
        while (iterator.hasNext()) {
            char c = iterator.next();
            int value = ht.get(c);
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
