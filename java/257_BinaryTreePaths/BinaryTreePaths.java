class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        pathHelper(ret, "", root);
        return ret;
    }
    
    public void pathHelper(List<String> ret, String path, TreeNode root) {
        if (root.left == null && root.right == null) {
            path += root.val;
            ret.add(path);
            return;
        }
        path += root.val;
        if (root.left != null) pathHelper(ret, path + "->", root.left);
        if (root.right != null) pathHelper(ret, path + "->", root.right);
    }
}
