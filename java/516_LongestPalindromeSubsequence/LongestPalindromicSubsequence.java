class Solution {
    public int longestPalindromeSubseq(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int n = s.length();
        int[][] OPT = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 2) {
                        OPT[i][j] = j - i + 1;
                    }
                    else {
                        OPT[i][j] = OPT[i + 1][j - 1] + 2;
                    }
                }
                else {
                    OPT[i][j] = Math.max(OPT[i+1][j], OPT[i][j-1]);
                }
            }
        }
        return OPT[0][n-1];
    }
}
