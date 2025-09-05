package Hard;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {

        int[]nums1 = {1,2};
        int[] nums2 = {3};

        int[] result = Arrays.stream(IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray()).sorted().toArray();
        if (result.length%2!=0) {
            System.out.println((double) result[result.length/2]);
        } else System.out.println((result[result.length/2]+result[result.length/2+1]));
        System.out.println((double) (result[result.length/2-1]+result[result.length/2])/2);
    }
}
