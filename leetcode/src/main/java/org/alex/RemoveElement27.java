public class RemoveElement27 {

    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[k] != val){
                k++;
            } else if (nums[i] != val) {
                nums[k] = nums[i];
                nums[i] = val;
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {

        int[] nums = new int[8];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 2;
        nums[4] = 3;
        nums[5] = 0;
        nums[6] = 4;
        nums[7] = 2;

        System.out.println("K:" + removeElement(nums, 2));

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
