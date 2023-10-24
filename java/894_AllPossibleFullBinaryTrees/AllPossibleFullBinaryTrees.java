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
    private Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) return new ArrayList<TreeNode>();

        if (n == 1) {
            return Arrays.asList(new TreeNode());
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        List<TreeNode> list = new ArrayList<>();

        for (int i = 1; i < n; i += 2) { // for each node at index i as root
            List<TreeNode> left = allPossibleFBT(i); // create a list of nodes for all the possible left subtree
            List<TreeNode> right = allPossibleFBT(n - 1 - i); // create a list of nodes for all the possible right subtree
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode current = new TreeNode(0, leftNode, rightNode);
                    list.add(current);
                }
            }
        }

        memo.put(n, list);
        return list;
        
    }
}
