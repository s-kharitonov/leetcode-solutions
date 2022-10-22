package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/find-smallest-letter-greater-than-target/">Task 774</a>
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters. Return the smallest character in letters that is
 * lexicographically greater than target. If such a character does not exist, return the first character in letters.
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int lettersCount = letters.length;
        int lastLetterIndex = lettersCount - 1;
        char lastLetter = letters[lastLetterIndex];
        char firstLetter = letters[0];

        if (lastLetter <= target || target < firstLetter) {
            return letters[0];
        }

        int head = 0;
        int tail = lastLetterIndex;
        char smallLetter = lastLetter;

        while (head <= tail) {
            int midIndex = head + (tail - head) / 2;
            char mid = letters[midIndex];

            if (mid > target) {
                if (smallLetter > mid) {
                    smallLetter = mid;
                }

                tail = midIndex - 1;
            } else {
                head = midIndex  + 1;
            }
        }

        return smallLetter;
    }

}
