package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World    asd";
        String[] arr = s.split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
