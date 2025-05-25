package org.alex;


public class RangeSumQueryImmutable303 {

    int[] sum;

    //We populate the sum in the constructor so that sumRange is constant time
    public RangeSumQueryImmutable303(int[] nums) {
        sum = new int[nums.length];
        if(nums.length>0)sum[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            sum[i]=sum[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0)return sum[j];
        return sum[j]-sum[i-1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable303 immutable303 = new RangeSumQueryImmutable303(nums);
        System.out.println(immutable303.sumRange(0,2));
    }
}

