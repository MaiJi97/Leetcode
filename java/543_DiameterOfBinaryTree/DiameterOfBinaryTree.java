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

    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameterSubtree(root);
        return diameter;
    }

    public int diameterSubtree(TreeNode root) {
        if (root == null) return 0;
        int left = diameterSubtree(root.left);
        int right = diameterSubtree(root.right);
        int current = Math.max(left, right) + 1;
        diameter = Math.max(diameter, left + right);
        return current;
    }
}
