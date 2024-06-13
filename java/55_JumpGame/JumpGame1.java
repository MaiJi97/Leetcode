class Solution {
    public boolean canJump(int[] nums) {
       boolean[] dp = new boolean[nums.length];
       dp[0] = true;
       for (int i = 0; i < nums.length; i++) {
            if (dp[i] == true) {
                for (int j = 0; j <= nums[i]; j++) {
                    if (i + j >= nums.length) break;
                    dp[i + j] = true;
                }
            }
       }
       return dp[nums.length - 1];
    }
}
