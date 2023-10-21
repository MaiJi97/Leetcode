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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ret = new ArrayList<>();
        dfs(root, new HashMap<String, Integer>(), ret);
        return ret;
    }

    public String dfs(TreeNode root, Map<String, Integer> hm, List<TreeNode> ret) {
        if (root == null) return "";
        String left = dfs(root.left, hm, ret);
        String right = dfs(root.right, hm, ret);
        String representation = "(" + left + root.val + right + ")";
        hm.put(representation, hm.getOrDefault(representation, 0) + 1);
        if (hm.containsKey(representation) && hm.get(representation) == 2) ret.add(root);
        return representation;
    }
}
