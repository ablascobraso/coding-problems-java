package org.alex;

import java.util.ArrayList;
import java.util.List;

public class KkidsWithCandies1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] candies = {2,3,5,1,3};
        System.out.println("Result:" + kidsWithCandies(candies, 3));
    }
}
