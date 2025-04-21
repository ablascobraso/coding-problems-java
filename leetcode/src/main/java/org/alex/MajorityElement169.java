import java.util.HashMap;

public class MajorityElement169 {

    public static int majorityElement(int[] nums) {
        int maxValue = nums[0];
        HashMap<Integer, Integer> numsByQuantity = new HashMap<>();
        for (Integer num : nums) {
            if (numsByQuantity.containsKey(num)) {
                numsByQuantity.put(num, numsByQuantity.get(num) + 1);
                if (numsByQuantity.get(num) > numsByQuantity.get(maxValue)) {
                    maxValue = num;
                }
            } else {
                numsByQuantity.put(num, 1);
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{32, 41, 21, 29, 7, 53, 97, 76, 71, 53, 53, 53, 72, 53, 53, 14, 22, 53, 67, 53, 53, 53, 54, 98, 53, 46, 53, 53, 62, 53, 76, 20, 60, 53, 31, 53, 53, 53, 95, 27, 53, 53, 53, 53, 36, 59, 40, 53, 53, 64, 53, 53, 53, 21, 53, 51, 53, 53, 2, 53, 53, 53, 53, 53, 50, 53, 53, 53, 23, 88, 3, 53, 61, 19, 53, 68, 53, 35, 42, 53, 53, 48, 34, 54, 53, 75, 53, 53, 50, 44, 92, 41, 71, 53, 53, 82, 53, 53, 14, 53};
        System.out.println(majorityElement(nums));
    }
}

