package leetcode.com.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTask01 {

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
