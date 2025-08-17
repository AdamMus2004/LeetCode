public class MergeSortedArray {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        for (int i = m ; i < m+n ; i++) {
            nums1[i] = nums2[i-m];
        }

        for (int i = 0 ; i < m+n ; i++) {
            for (int j = 0 ; j < m+n ; j++) {
                if (nums1[j]>nums1[i]) {
                    int tmp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = tmp;
                }
            }
        }
    }
}
