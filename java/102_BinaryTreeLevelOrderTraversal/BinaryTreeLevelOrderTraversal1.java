class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                level.add(current.val);
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }
}
