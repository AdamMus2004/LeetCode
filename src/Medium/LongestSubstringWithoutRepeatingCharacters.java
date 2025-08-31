package Medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";

        int max = 0;
        int left = 0;
        HashSet<Character> memo = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (memo.contains(c)) {
                memo.remove(s.charAt(left));
                left++;
            }
            memo.add(c);
            max = Math.max(max,right-left+1);
        }
        System.out.println(max);

    }
}
