package leetcode.com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/number-of-good-pairs/">Task 1512</a>
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        Map<Integer, Integer> numCounterByNum = new HashMap<>();

        for (int num : nums) {
            int prevNumCount = numCounterByNum.getOrDefault(num, 0);

            counter += prevNumCount;
            numCounterByNum.put(num, prevNumCount + 1);
        }

        return counter;
    }
}
