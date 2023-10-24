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
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair<TreeNode, Integer>> q = new ArrayDeque<>();
        q.offer(new Pair(root, root.val));
        int sum = 0;
        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> current = q.poll();
            TreeNode currentNode = current.getKey();
            int currentVal = current.getValue();
            if (currentNode.left == null && currentNode.right == null) sum += currentVal;
            if (currentNode.left != null) {
                q.offer(new Pair(currentNode.left, currentVal * 10 + currentNode.left.val));
            }
            if (currentNode.right != null) {
                q.offer(new Pair(currentNode.right, currentVal * 10 + currentNode.right.val));
            }
        }
        return sum;
    }
}

    
