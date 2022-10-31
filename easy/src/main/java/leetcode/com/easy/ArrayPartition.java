package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/array-partition/">Task 561</a>
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn)
 * such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 */
public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        int[] counts = new int[20_001];

        for (var current : nums) {
            counts[current + 10_000]++;
        }

        var result = 0;
        var isShouldPick = true;

        for (int i = 0; i < counts.length; i++) {
            int current = counts[i];

            while (current > 0) {
                if (isShouldPick) {
                    result += i - 10_000;
                }

                isShouldPick = !isShouldPick;
                current--;
            }
        }

        return result;
    }

}
