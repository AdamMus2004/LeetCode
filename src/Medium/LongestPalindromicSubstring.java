package Medium;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String s) {
        String solution = "";
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        String solution = "";
        int right = s.length()-1;
        for (int left = 0; left < right; left++) {

        }


    }
}


