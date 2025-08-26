package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<>();
        if (numRows<=0) System.out.println(result);;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> perv = result.get(i - 1);
                row.add(perv.get(j - 1) + perv.get(j));
            }
            if (i>0) {
                row.add(1);
            }
            result.add(row);
        }
        System.out.println(result);
    }
}
