public class PowerOfFour {
    public static void main(String[] args) {
        int n = 129140163;

        for (int i = 0; Math.pow(4,i) <= n; i++) {
            if (Math.pow(4,i)==n) {
                System.out.println(true);
            }
        }
    }
}
