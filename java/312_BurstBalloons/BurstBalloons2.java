class Solution {
    public int maxCoins(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        
        for (int g = 0; g < nums.length; g++) {
            for (int i = 0, j = g; j < nums.length; i++, j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k <= j; k++) {
                    int m = (i == 0 ? 1 : nums[i-1]);
                    int n = (j == nums.length - 1) ? 1 : nums[j+1];
                    int left = (i == k) ? 0 : dp[i][k-1];
                    int right = (j == k) ? 0 : dp[k+1][j];
                    int sum = nums[k] * m * n + left + right;
                    max = Math.max(sum, max);
                }
                dp[i][j] = max;
            }
        }
        return dp[0][nums.length - 1];
    }
}
