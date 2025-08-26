package Easy;

public class MaximumAreaOfLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][]dimensions = {{9,6},{6,8}};

        double max = 0;
        int maxArea = 0;

        for (int[] i : dimensions) {
            if ((i[0]*i[0]+i[1]*i[1])>max) {
                max = (i[0]*i[0]+i[1]*i[1]);
                maxArea= i[0]*i[1];
            } else if((i[0]*i[0]+i[1]*i[1])==max && i[0]*i[1]>maxArea) {
                maxArea= i[0]*i[1];
            }
        }
        System.out.println(maxArea); ;

    }
}
