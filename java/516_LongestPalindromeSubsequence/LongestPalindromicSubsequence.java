class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxlen = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j <= 2) {
                        dp[i][j] = i - j + 1;
                    }
                    else {
                        dp[i][j] = dp[i - 1][j + 1] + 2;
                    }   
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[n - 1][0];
    }
}
