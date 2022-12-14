package leetcode.com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/">Task 15</a>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
 * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];

            if (i > 0 && num1 == nums[i - 1]) {
                continue;
            }

            int headIndex = i + 1;
            int tailIndex = nums.length - 1;

            while (headIndex < tailIndex) {
                int num2 = nums[headIndex];
                int num3 = nums[tailIndex];
                int sum = num1 + num2 + num3;

                if (sum > 0) {
                    tailIndex--;
                } else if (sum < 0) {
                    headIndex++;
                } else {
                    result.add(List.of(num1, num2, num3));
                    headIndex++;

                    while (nums[headIndex] == nums[headIndex - 1] && headIndex < tailIndex) {
                        headIndex++;
                    }
                }
             }
        }

        return result;
    }

}
