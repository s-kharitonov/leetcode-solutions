package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">Task 1365</a>
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 */
public class HowManyNumbersAreSmallerThanCurrentNumberTask1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] counts = new int[101];

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 1; i < 101; i++) {
            int prevCount = counts[i - 1];

            counts[i] += prevCount;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num == 0) {
                result[i] = 0;
            } else {
                result[i] = counts[num - 1];
            }
        }

        return result;
    }

}
