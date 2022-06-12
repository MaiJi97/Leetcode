class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        else {
            return (Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
