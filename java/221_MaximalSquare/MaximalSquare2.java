class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length + 1;
        int n = matrix[0].length + 1;
        int[] dp = new int[n];
        int side = 0;
        int prev = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int temp = dp[j]; 
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(dp[j], Math.min(dp[j - 1], prev)) + 1;
                    side = Math.max(side, dp[j]);
                }
                else dp[j] = 0;
                prev = temp;
            }
        }
        return side * side;
    }
}
