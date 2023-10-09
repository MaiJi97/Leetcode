class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        Boolean[][] memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return dfs(s1, 0, s2, 0, s3, memo);
    }

    public boolean dfs(String s1, int i, String s2, int j, String s3, Boolean[][] memo) {
        if (i + j == s3.length()) return true;
        if (memo[i][j] != null) return memo[i][j];
        if (i < s1.length() && s1.charAt(i) == s3.charAt(i + j)) {
            if (dfs(s1, i + 1, s2, j, s3, memo)) return memo[i][j] = true;
        }
        if (j < s2.length() && s2.charAt(j) == s3.charAt(i + j)) {
            if (dfs(s1, i, s2, j + 1, s3, memo)) return memo[i][j] = true;
        }
        return memo[i][j] = false;
    }
}
