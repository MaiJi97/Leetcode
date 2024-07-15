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
    int ret = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root, new int[10]);
        return ret;
    }

    public void dfs(TreeNode root, int[] count) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            count[root.val]++;
            if (check(count)) {
                ret++;
            }
            count[root.val]--;
            return;
        }
        count[root.val]++;
        dfs(root.left, count);
        dfs(root.right, count);
        count[root.val]--;
    }

    public boolean check(int[] count) {
        int odd = 0;
        for (int element : count) {
            if (element % 2 == 1) odd++;
        }
        return odd <= 1;
    }
}
