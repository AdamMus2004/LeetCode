package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                solution.add(i);
            }
        }
        solution.forEach(System.out::println);
    }
}
