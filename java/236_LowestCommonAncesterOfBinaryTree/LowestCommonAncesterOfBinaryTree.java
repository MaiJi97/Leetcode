class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) { // if root is p or q
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) { // if p and q are in two different subtrees
            return root;
        }
        
        if (left != null) { // if left subtree has a LCA
            return left;
        }
        
        
        if (right != null) { // if right subtree has a LCA
            return right;
        }
        
        return null;
    }
}
