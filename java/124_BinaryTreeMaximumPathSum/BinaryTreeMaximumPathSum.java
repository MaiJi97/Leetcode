/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int maxSum;

    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        gainFromSubtree(root);
        return maxSum;
    }

    private int gainFromSubtree(TreeNode root) {
        if (root == null) return 0;
        int gainFromLeft = Math.max(gainFromSubtree(root.left), 0);
        int gainFromRight = Math.max(gainFromSubtree(root.right), 0);
        int current = Math.max(gainFromLeft + root.val, gainFromRight + root.val);
        maxSum = Math.max(current, gainFromLeft + root.val + gainFromRight);
        return current;
    }
}
