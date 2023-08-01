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

class NodeValue {
    public int maxNode, minNode, maxSize;
    
    NodeValue(int minNode, int maxNode, int maxSize) { // info about a valid BST
        this.minNode = minNode; // min node value in the tree rooted at current node
        this.maxNode = maxNode; // max node value in the tree rooted at current node
        this.maxSize = maxSize; // max BST size so far
    }
};

class Solution {
    public int largestBSTSubtree(TreeNode root) {
        return helper(root).maxSize;
    }

    public NodeValue helper(TreeNode root) {
        if (root == null) return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        NodeValue left = helper(root.left);
        NodeValue right = helper(root.right);

        if (left.maxNode < root.val && root.val < right.minNode) {
            return new NodeValue(Math.min(root.val, left.minNode), Math.max(root.val, right.maxNode), left.maxSize + right.maxSize + 1);
        }

        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 
                            Math.max(left.maxSize, right.maxSize));
    }

}
