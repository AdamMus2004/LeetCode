public class AddDigits {
    public static void main(String[] args) {
        int suma = 38;
        String s = Integer.toString(suma);
        while (suma>=  10) {
            suma = 0;
            for (int i = 0; i < s.length(); i++) {
                suma += ((s.charAt(i) - '0'));
            }

            System.out.println(suma);
            s = Integer.toString(suma);
        }
    }
}
