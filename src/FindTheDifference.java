public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result^=s.charAt(i);
            result^=t.charAt(i);
        }
        result^=t.charAt(t.length()-1);
        System.out.println((char) result);

    }
}
