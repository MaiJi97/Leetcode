class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        int[][] dp = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i-1][0] + costs[i-1][0];
            dp[0][i] = dp[0][i-1] + costs[i-1][1];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.min(dp[i-1][j] + costs[i+j-1][0], dp[i][j-1] + costs[i+j-1][1]);
            }
        }
        return dp[n][n];
    }
}
