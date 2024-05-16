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
    int longestPath;
    public int longestUnivaluePath(TreeNode root) {
        longestPath = 0;
        longestFromSubtree(root);
        return longestPath;
    }

    public int longestFromSubtree(TreeNode root) {
        if (root == null) return 0;
        int longestFromLeft = longestFromSubtree(root.left);
        int longestFromRight = longestFromSubtree(root.right);
        int updatedLeft = 0;
        int updatedRight = 0;
        if (root.left != null && root.left.val == root.val) {
            updatedLeft = longestFromLeft + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            updatedRight = longestFromRight + 1;
        }
        longestPath = Math.max(longestPath, updatedLeft + updatedRight);
        return Math.max(updatedLeft, updatedRight);
    }
}
