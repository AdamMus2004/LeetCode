package Medium;

import java.util.*;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        List<String> solution = new ArrayList<>();


        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        for (String w : words) {
            if (w.length() != pattern.length()) {
                continue;
            }
            HashSet<Character> used = new HashSet<>();
            Map<Character, Character> map = new TreeMap<>();
            boolean matches = true;

            for (int i = 0; i < w.length(); i++) {
                char n = pattern.charAt(i);
                char m = w.charAt(i);

                if (map.containsKey(n)) {
                    if (!map.get(n).equals(m)) {
                        matches = false;
                        break;
                    }
                } else {
                    if (used.contains(m)) {
                        matches = false;
                        break;
                    }
                    map.put(n, m);
                    used.add(m);
                }
            }


            if (matches) solution.add(w);
        }
        solution.forEach(System.out::println);
    }
}
