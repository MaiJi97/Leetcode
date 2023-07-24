class Solution {
    public boolean canJump(int[] nums) {
       int i = 0;
       int maxIndex = 0;
       while (i < nums.length && i <= maxIndex) {
           maxIndex = Math.max(maxIndex, i + nums[i]);
           i++;
       }
       return maxIndex >= nums.length - 1;
    }
}
