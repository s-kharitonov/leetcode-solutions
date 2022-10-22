package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/binary-search/">Task 704</a>
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to
 * search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {
            int midIndex = (head + tail) / 2;
            int mid = nums[midIndex];

            if (mid == target) {
                return midIndex;
            }

            if (mid > target) {
                tail = midIndex - 1;
            } else {
                head = midIndex + 1;
            }
        }

        return -1;
    }

}
