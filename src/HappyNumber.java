import java.util.HashSet;

public class HappyNumber {


    public static void main(String[] args) {

        int suma = 2;
        HashSet<Integer> memo = new HashSet<>();
        String s = Integer.toString(suma);
        while (suma!=1) {
            suma = 0;
            for (int i = 0; i < s.length(); i++) {
                suma += ((s.charAt(i) - '0') * (s.charAt(i) - '0'));
            }
            if (memo.contains(suma)) {
                System.out.println(false);
                break;
            }
            memo.add(suma);
            s = Integer.toString(suma);
            System.out.println(suma);
        }

    }
}
