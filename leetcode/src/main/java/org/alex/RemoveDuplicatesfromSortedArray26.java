import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray26 {

    public static int removeDuplicates(int[] nums){
        int index = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;

        System.out.println("K:" + removeDuplicates(nums));

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
