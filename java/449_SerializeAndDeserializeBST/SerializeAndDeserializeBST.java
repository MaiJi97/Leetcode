/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val);
        sb.append(',');
        dfs(root.left, sb);
        dfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        String[] nodes = data.split(",");
        int[] nums = new int[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            nums[i] = Integer.valueOf(nodes[i]);
        }
        return constructTree(nums, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int i = 0;
    private TreeNode constructTree(int[] pre, int lower, int upper) {
        if (i == pre.length || pre[i] < lower || pre[i] > upper) return null;

        TreeNode node = new TreeNode(pre[i++]);

        node.left = constructTree(pre, lower, node.val);
        node.right = constructTree(pre, node.val, upper);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
