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
class Pair {
    int column;
    TreeNode node;
    public Pair(int column, TreeNode node) {
        this.column = column;
        this.node = node;
    }
}
class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, List<Integer>> hm = new HashMap<>();
        queue.add(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int currentColumn = current.column;
            if (!hm.containsKey(currentColumn)) {
                hm.put(currentColumn, new ArrayList<Integer>());
            }
            hm.get(currentColumn).add(current.node.val);
            if (current.node.left != null) {
                queue.add(new Pair(currentColumn-1, current.node.left));
            }
            if (current.node.right != null) {
                queue.add(new Pair(currentColumn+1, current.node.right));
            } 
        }
        List<Integer> keySet = new ArrayList<Integer>(hm.keySet());
        Collections.sort(keySet);
        for (int key : keySet) {
            ret.add(hm.get(key));
        }
        return ret;
    }
}
