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

    int i = 0; 

    public TreeNode bstFromPreorder(int[] preorder) {        
        return constructTree(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode constructTree(int[] pre, int lower, int upper) {
        if (i == pre.length || pre[i] < lower || pre[i] > upper) return null;

        TreeNode node = new TreeNode(pre[i++]);

        node.left = constructTree(pre, lower, node.val);
        node.right = constructTree(pre, node.val, upper);
        return node;
    }
}
