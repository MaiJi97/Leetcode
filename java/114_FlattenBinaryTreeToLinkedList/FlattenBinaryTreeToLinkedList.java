class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        flatten(root.left);    
        flatten(root.right);   
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left = null;
        root.right = left;
        
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = right;
    }
}
