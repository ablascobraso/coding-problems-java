package org.alex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class MissingNumber268
{
    public static int missingNumber(int[] nums) {
        Set<Integer> allNums = new HashSet<>();
        for (int i = 0; i < nums.length + 1; i++) {
            allNums.add(i);
        }
          for (int num : nums) {
            allNums.remove(num);
          }
        return allNums.iterator().next();
    }

    public static int missingNumberLessMemory(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length + 1; i++) {
            if(i == nums.length){
                break;
            }
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumberWithSum(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return totalSum - actualSum;
    }


    public static void main(String[] args) {
        System.out.println(missingNumberLessMemory(new int[]{0,1}));
    }
}

