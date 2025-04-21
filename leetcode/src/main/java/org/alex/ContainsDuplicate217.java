import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
  private static boolean containsDuplicate(final int[] nums) {
    final Set<Integer> alreadySeen = new HashSet<>();
    for (final int num : nums) {
      if (alreadySeen.contains(num)) {
        return true;
      } else {
        alreadySeen.add(num);
      }
    }
    return false;
  }

  public static void main(final String[] args) {
    final int[] nums = new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
    System.out.println(containsDuplicate(nums));
  }
}
