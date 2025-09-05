package Medium;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        String s = "42";

        if (!s.matches("\\d")) {
            System.out.println(0);
        }
        int start=0;
        String solution="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ') {
                start = i;
                break;
            }
        }
        s=s.substring(start);
        boolean negative =false;
        if (s.charAt(0)=='-') {
            s=s.substring(1);
            negative=true;
            solution="-";
        }
        if (s.charAt(0)=='+') {
            if (!negative) {
                s = s.substring(1);
            }
        }
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                solution+=c;
            } else {
                break;
            }
        }
        System.out.println(solution);
        if (solution.equals("-")) {
            System.out.println(0);
        }
        if (solution.isBlank()) {
            System.out.println(0);
        }
        try {
            System.out.println(Integer.parseInt(solution));
        } catch (NumberFormatException e) {
            if (negative) {
                System.out.println(Integer.MIN_VALUE);
            } else {
                System.out.println(Integer.MAX_VALUE);
            }
        }


    }
}
