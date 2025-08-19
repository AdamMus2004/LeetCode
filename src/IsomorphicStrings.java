import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        if (s.length()!=t.length()) {
            System.out.println(false);
        }

        Map<Character,Character> map = new TreeMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            char m = t.charAt(i);

            if (map.containsKey(n)) {
                if (!map.get(n).equals(m)) {
                    System.out.println(false);
                }
            } else if (used.contains(m)) {
                System.out.println(false);
            }

            map.put(n,m);
            used.add(m);
        }
        System.out.println(true);

    }
}
