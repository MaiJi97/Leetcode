// method 1: DFS/inorder traverse
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        inOrder(root, nums);
        return nums.get(k-1);
    }

    public void inOrder(TreeNode root, ArrayList<Integer> nums) {
        if(root == null) {
            return;
        }
        else {
            inOrder(root.left, nums);
            nums.add(root.val);
            inOrder(root.right, nums);
        }
    }
}
