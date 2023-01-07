package leetcode.com.easy;

import leetcode.com.easy.model.task_1379.TreeNode;

/**
 * <a href="https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/">Task 1379</a>
 * Given two binary trees original and cloned and given a reference to a node target in the original tree.
 * The cloned tree is a copy of the original tree.
 * Return a reference to the same node in the cloned tree.
 * Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.
 * <br>
 * Definition for a binary tree node:
 * <pre>{@code
 * public class TreeNode {
 *      int val;
 *      TreeNode left;
 *      TreeNode right;
 *      TreeNode(int x) { val = x; }
 * }
 * }</pre>
 */
public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target) {
            return cloned;
        }

        var result = getTargetCopy(original.left, cloned.left, target);

        if (result != null) {
            return result;
        }

        return getTargetCopy(original.right, cloned.right, target);
    }
}
