import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int lastPos = m + n - 1;
        while(nidx >= 0){
            if (midx >= 0 && nums1[midx] > nums2[nidx]){
                nums1[lastPos] = nums1[midx];
                midx--;
            }
            else{
                nums1[lastPos] = nums2[nidx];
                nidx--;
            }
            lastPos--;
        }
    }

    public static void main(String[] args) {

        final int[] nums1 = new int[]{1, 2, 3, 0, 0, 0 };
        final int[] nums2 = new int[]{2, 5, 6};
        MergeSortedArray88.merge(nums1, 1, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}

