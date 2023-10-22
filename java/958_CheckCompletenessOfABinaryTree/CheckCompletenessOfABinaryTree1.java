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
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean hasEncounteredNull = false;
        boolean hasEncounteredNode = false;
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current.left == null) {
                if (hasEncounteredNull == false) hasEncounteredNull = true;
            }
            else {
                if (hasEncounteredNull == true) hasEncounteredNode = true;
                    q.offer(current.left);
                }

            if (current.right == null) {
                if (hasEncounteredNull == false) hasEncounteredNull = true;
            }
            else {
                if (hasEncounteredNull == true) hasEncounteredNode = true;
                q.offer(current.right);
            }
            if (hasEncounteredNull == true && hasEncounteredNode == true) return false;
        }
        return true;
    }
}
