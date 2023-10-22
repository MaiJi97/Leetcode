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
        boolean hasEncounteredNull = false;
        Queue<TreeNode> q = new LinkedList<>(); // has to use LinkedList as ArrayDeque does not adding or offering null element
        q.offer(root);
        
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current == null) {
                hasEncounteredNull = true;
            }
            else {
                if (hasEncounteredNull) {
                    return false;
                }
                q.offer(current.left);
                q.offer(current.right);
            }
        }
        return true;
    }
}
