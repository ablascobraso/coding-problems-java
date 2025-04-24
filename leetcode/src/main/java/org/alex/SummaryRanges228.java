import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
  public static void main(String[] args) {
    int[] nums = new int[]{0, 1, 2, 4, 5, 7};
    int[] nums2 = new int[]{0, 2, 3, 4, 6, 8, 9};
    List<String> ranges = SummaryRanges228.summaryRanges(nums);
    for (String range : ranges) {
      System.out.println(range);
    }
  }

  private static List<String> summaryRanges(int[] nums) {
    List<String> ranges = new ArrayList<>();
    if (nums.length == 0) {
      return new ArrayList<>();
    }
    int firstElement = nums[0];
    int lastElement = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > lastElement + 1) {
        SummaryRanges228.addToRanges(ranges, firstElement, lastElement);
        firstElement = nums[i];
      }
      lastElement = nums[i];
    }
    SummaryRanges228.addToRanges(ranges, firstElement, lastElement);
    return ranges;
  }

  private static void addToRanges(List<String> ranges, int firstElement, int lastElement) {
    if (firstElement != lastElement) {
      ranges.add(firstElement + "->" + lastElement);
    } else {
      ranges.add(String.valueOf(firstElement));
    }
  }
}

