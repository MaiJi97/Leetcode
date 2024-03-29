class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] bucketSort = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            bucketSort[nums[i]]++;
        }

        int[] dp = new int[max + 1];
        dp[0] = 0;
        dp[1] = bucketSort[1] * 1;
        for (int i = 2; i < max + 1; i++) {
            dp[i] = Math.max(dp[i - 2] + i * bucketSort[i], dp[i - 1]);
        }
        return dp[max];
    }
}
