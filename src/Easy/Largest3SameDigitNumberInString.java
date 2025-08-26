package Easy;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String num = "6777133339";

        String[] arr={"999","888","777","666","555","444","333","222","111","000"};

        for (String regex : arr) {
            if (num.contains(regex)) {
                System.out.println(regex);
            }
        }
        System.out.println("");
    }
}
