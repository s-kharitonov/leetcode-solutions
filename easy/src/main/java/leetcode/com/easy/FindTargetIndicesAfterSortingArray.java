package leetcode.com.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-target-indices-after-sorting-array/">Task 2089</a>
 * You are given a 0-indexed integer array nums and a target element target.
 * A target index is an index i such that nums[i] == target.
 * Return a list of the target indices of nums after sorting nums in non-decreasing order.
 * If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
 */
public class FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {
        int targetsCounter = 0;
        int lessThanTargetCount = 0;

        for (var num : nums) {
            if (num < target) {
                lessThanTargetCount++;
            }

            if (num == target) {
                targetsCounter++;
            }
        }

        List<Integer> targetsIndices = new ArrayList<>();

        for (int i = 0; i < targetsCounter; i++) {
            targetsIndices.add(lessThanTargetCount++);
        }

        return targetsIndices;
    }

}
