import java.util.HashMap;
import java.util.Map;

class ContainsDuplicateII219 {
  public static void main(final String[] args) {
    final int[] nums = {1, 2, 3, 1};
    final int k = 3;
    System.out.println(containsNearbyDuplicate(nums, k));
  }

  private static boolean containsNearbyDuplicate(final int[] nums, final int k) {
    final Map<Integer, Integer> valuesByPosition = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (valuesByPosition.containsKey(nums[i]) && Math.abs(valuesByPosition.get(nums[i]) - i) <= k) {
        return true;
      } else {
        valuesByPosition.put(nums[i], i);
      }
    }
    return false;
  }
}