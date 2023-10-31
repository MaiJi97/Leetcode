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
    public List<TreeNode> generateTrees(int n) {
        return n > 0 ? dfs(1, n, new HashMap<>()) : new ArrayList<>();
    }

    private List<TreeNode> dfs(int start, int end, Map<Pair<Integer, Integer>, List<TreeNode>> memo) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (memo.containsKey(new Pair<>(start, end))) {
            return memo.get(new Pair<>(start, end));
        }
        for (int i = start; i <= end; i++) { // for each node at index i as root
            List<TreeNode> left = dfs(start, i - 1, memo); // create a list of nodes for all the possible BSTs that could be the left subtree
            List<TreeNode> right = dfs(i + 1, end, memo); // create a list of nodes for all the possible BSTs that could be the right subtree
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode current = new TreeNode(i, leftNode, rightNode);
                    list.add(current);
                }
            }
        }
        memo.put(new Pair<>(start, end), list);
        return list;
    }
}
