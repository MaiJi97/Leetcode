class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++){
            // 初始化一层的左端点和右端点
            dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
            }
        }
        int ret = dp[n-1][0];
        for (int i = 0; i < n; i++) {
            if (dp[n-1][i] < ret) {
                ret = dp[n-1][i];
            }
        }
        return ret;
    }
}
