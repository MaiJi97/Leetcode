class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) return;
        for (int i = 0; i < k % nums.length; i++) {
            rotateOne(nums);
        }
    }

    public void rotateOne(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}
