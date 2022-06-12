class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        pathHelper(ret, "", root);
        return ret;
    }
    
    public void pathHelper(List<String> ret, String path, TreeNode root) {
        if (root == null) {
            return;
        }
        
        path += root.val;
        
        if (root.left == null && root.right == null) {
            ret.add(path);
            return;
        }
        if (root.left != null) {
            pathHelper(ret, path + "->", root.left);
        }
        if (root.right != null) {
            pathHelper(ret, path + "->", root.right);
        }
    }
}
