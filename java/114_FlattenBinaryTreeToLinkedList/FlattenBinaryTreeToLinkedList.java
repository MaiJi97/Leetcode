class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }
        
        if (root.left != null) {
            flatten(root.left);
            TreeNode temp = root.right; // store the initial right subtree
            root.right = root.left; // insert the flattened left subtree
            root.left = null; // set the left subtree to null
            TreeNode curr = root;
            while (curr.right != null) {
                curr = curr.right;
            }
            curr.right = temp;        
        }
        flatten(root.right);    
    }
}
