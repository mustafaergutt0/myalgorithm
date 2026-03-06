package LeetCodeAndAlgorthm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FindTheDifference {

    static void main() {

        System.out.println(FindTheDifference("a", "aa"));

    }



    static public char FindTheDifference(String s, String t) {
        Map<Character, Integer> counts = new HashMap<>();

// s stringindeki harfleri say
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

// t stringindeki harfleri eksilt
        for (char c : t.toCharArray()) {
            // Eğer harf Map'te yoksa veya sayısı 0'a düşmüşse, aranan harf budur!
            if (!counts.containsKey(c) || counts.get(c) == 0) {
                return c;
            }
            counts.put(c, counts.get(c) - 1);
        }
        return 0;
    }
}
