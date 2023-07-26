class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ret = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i-1][j+1])) {
                    dp[i][j] = true;
                    ret++;
                }
            }
        }
        return ret;
    }
}
