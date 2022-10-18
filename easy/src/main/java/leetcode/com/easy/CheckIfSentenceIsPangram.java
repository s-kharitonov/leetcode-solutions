package leetcode.com.easy;

/**
 * <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">Task 1832</a>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
 * or false otherwise.
 */
public class CheckIfSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        int[] characters = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            int index = character - 'a';

            characters[index]++;
        }

        for (int character : characters) {
            if (character == 0) {
                return false;
            }
        }

        return true;
    }

}
