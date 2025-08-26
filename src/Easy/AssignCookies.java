package Easy;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3,2};
        int[] s = {1,2,3,3};
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookies = 0;
        while (child < g.length && cookies < s.length) {
            if (g[child]<=s[cookies]) {
                child++;
            }
            cookies++;
        }
        System.out.println(child);
    }
}
