package leetcode.com.easy.model.task_1379;

public class TreeNode implements Cloneable {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    @Override
    public TreeNode clone() {
        try {
            TreeNode clone = (TreeNode) super.clone();

            clone.val = this.val;

            if (this.left != null) {
                clone.left = this.left.clone();
            }

            if (this.right != null) {
                clone.right = this.right.clone();
            }

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("clone error", e);
        }
    }
}
