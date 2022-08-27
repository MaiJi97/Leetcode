class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2) {
                        dp[i][j] = j - i + 1;
                    }
                    else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                }
                else {
                    OPT[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}
