class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] ret = new int[nums.length];
        while (left <= right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                ret[index] = nums[left] * nums[left];
                left++;
            }
            else {
                ret[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return ret;
    }
}
