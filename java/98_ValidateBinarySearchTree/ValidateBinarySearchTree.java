class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    public boolean valid(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        else if (low != null && root.val <= low) {
            return false;
        }
        else if (high != null && root.val >= high) {
            return false;
        }
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }
}
