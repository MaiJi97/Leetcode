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
    Map<Integer, List<int[]>> hm = new HashMap<>();
    int min = 0;
    int max = 0;
    
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        dfs(root, 0, 0);
        for (int start = min; start <= max; start++) {
            List<int[]> list = hm.get(start);
            list.sort((a, b) -> {
                return a[1] - b[1];
            });
            List<Integer> temp = new ArrayList<>();
            for (int[] e : list) {
                temp.add(e[0]);
            }
            
            ret.add(temp);
        }
        return ret;
    }

    public void dfs(TreeNode root, int column, int row) {
        if (root == null) {
            return;
        }
        if (column < min) min = column;
        if (column > max) max = column;
        if (!hm.containsKey(column)) {
            hm.put(column, new ArrayList<>());
        }
        hm.get(column).add(new int[] {root.val, row});

        if (root.left != null) {
            dfs(root.left, column - 1, row + 1);
        }
        if (root.right != null) {
            dfs(root.right, column + 1, row + 1);
        }
    }
}
