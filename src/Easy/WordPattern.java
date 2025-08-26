package Easy;

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cart cat dog";
        String[] arr = s.split(" ");

        if (pattern.length()> arr.length) {
            System.out.println(false);
        }

        Map<Character,String> map = new HashMap<>();
        Set<String> used = new HashSet<>();


        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    System.out.println(false);
                }
            } else {
                if (used.contains(arr[i])) {
                    System.out.println(false);
                }
            }

            map.put(pattern.charAt(i),arr[i]);
            used.add(arr[i]);
        }
        System.out.println(true);
        }
}
