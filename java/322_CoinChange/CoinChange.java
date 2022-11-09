class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    int temp = dp[i - coins[j]] + 1;   
                    min = Math.min(min, temp);
                }
            }
            dp[i] = min;    
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
