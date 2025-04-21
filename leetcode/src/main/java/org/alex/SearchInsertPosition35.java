import java.util.Arrays;

public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid;

        while (low<=high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;

        System.out.println("Index:" + searchInsert(nums, 7));
    }
}
