class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) return;
        k = k % nums.length;
        int temp[] = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
