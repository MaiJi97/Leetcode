class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxlen = 1;
        int start = 0;
        int end = 0;
        int n = s.length();
        boolean[][] OPT = new boolean[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || OPT[i+1][j-1])) {
                    OPT[i][j] = true;
                    if (j - i + 1 > maxlen) {
                        maxlen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}
