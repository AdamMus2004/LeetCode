package Easy;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        for (int i = 0; Math.pow(3,i) <= n ; i++) {
            if (Math.pow(3,i)==n) {
                System.out.println(true);
            }
        }
        System.out.println(false);


    }
}
