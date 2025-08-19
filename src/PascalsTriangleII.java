import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static int rowIndex = 5;
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < rowIndex+1; i++) {
            row = new ArrayList<>();
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
        System.out.println(row);
    }
}
