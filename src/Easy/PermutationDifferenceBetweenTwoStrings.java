package Easy;

public class PermutationDifferenceBetweenTwoStrings {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";
        int n = s.length();
        int[] position = new int[26];
        for (int i = 0; i < n; i++) {
            position[t.charAt(i)-'a'] =i;
        }

        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum+=Math.abs(i-position[s.charAt(i)-'a']);
        }
        System.out.println(sum);

    }
}
