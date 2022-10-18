package leetcode.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Task 1</a>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevNumsIndexByNum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            Integer prevNumIndex = prevNumsIndexByNum.get(diff);

            if (prevNumIndex != null) {
                return new int[]{prevNumIndex, i};
            } else {
                prevNumsIndexByNum.put(num, i);
            }
        }

        return null;
    }

}
