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
        
        // usually do not need to consider the leaf case seperately.
        // 如果叶子的返回结果可以通过两个空节点的返回节点得到则可以省略
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
