class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode>() stack = new Stack<>();
        while(true) {
            while(root != null) {
                stack.push(root.val);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if(k == 0) {
                return root.val;
            }
            root = root.right;
        }
    }
}
