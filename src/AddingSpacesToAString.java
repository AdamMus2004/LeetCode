import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class AddingSpacesToAString {
    public static void main(String[] args) {
        int[] spaces = {8,13,15};
        String s = "LeetcodeHelpsMeLearn";
        StringBuilder sb = new StringBuilder();
        int spacesCount = 0;


        for (int i = 0; i < s.length(); i++) {
            if (spacesCount<spaces.length && i==spaces[spacesCount]) {
                sb.append(' ');
                spacesCount++;
            }
            sb.append(s.charAt(i));

        }



        System.out.println(sb.toString());


    }
}
