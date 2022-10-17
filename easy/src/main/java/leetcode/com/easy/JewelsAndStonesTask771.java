package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/jewels-and-stones/">Task 771</a>
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
 * you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have
 * are also jewels.
 * Letters are case-sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStonesTask771 {

    public int numJewelsInStones(String jewels, String stones) {
        int stonesCounter = 0;

        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);

            if (jewels.indexOf(stone) != -1) {
                stonesCounter++;
            }
        }

        return stonesCounter;
    }

}
