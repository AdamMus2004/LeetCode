import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> list = new ArrayList<>();
        for (int i = 1; i<n+1 ; i++) {
            if (i%3==0 && i%5==0) {
                list.add("FizzBuzz");
                continue;
            }
            else if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }
            else if (i % 5 == 0) {

                list.add("Buzz");
                continue;
            }
            else list.add(String.valueOf(i));
        }

        list.forEach(System.out::println);
    }
}
