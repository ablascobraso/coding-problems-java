package org.alex;

import java.util.Arrays;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {
        int p1 = 0, p2 = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                p1 = i+1;
                p2 = i+2;
            }
            else{
                break;
            }
        }
        while(p2 < nums.length){
            if(nums[p2] == 0){
                p2++;
            }
            else{
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2= p1 + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

