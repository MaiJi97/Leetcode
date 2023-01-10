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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(root, 0, ret);
        return ret;
    }

    public void dfs(TreeNode root, int height,List<List<Integer>> list) {
        if (root == null) return;
        if (height >= list.size()) list.add(new ArrayList<>());
        list.get(height).add(root.val);
        if (root.left != null) dfs(root.left, height+1, list);
        if (root.right != null) dfs(root.right, height+1, list);
    }
}
