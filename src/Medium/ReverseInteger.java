package Medium;


public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        String solution = (x < 0) ? "-" : "";


        String xs = String.valueOf(x);

        if (xs.charAt(0) == '-') {
            xs=xs.substring(1);
        }

        if (xs.charAt(xs.length()-1)=='0') {
            xs=xs.substring(0,xs.length()-1);
        }

        for (int i = xs.length()-1; i >= 0; i--) {
            solution+=xs.charAt(i);
        }
        try {
            System.out.println(Integer.parseInt(solution));
        } catch (NumberFormatException e) {
            System.out.println(0);
        }



    }
}

