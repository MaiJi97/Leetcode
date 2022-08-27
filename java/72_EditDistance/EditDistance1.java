class Solution {
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] memo = new int[l1 + 1][l2 + 1];
        return helper(word1, word2, l1, l2, memo);
    }
    
    public int helper(String word1, String word2, int i, int j, int[][] memo) {
        if (i <= 0) {
            return j;
        }
        if (j <= 0) {
            return i;
        }
        if(memo[i][j] != 0) {
            return memo[i][j];
        }
        if (word1.charAt(i-1) == word2.charAt(j-1)) {
            return helper(word1, word2, i - 1, j - 1, memo);
        }
        else {
            int deletion = helper(word1, word2, i - 1, j, memo);
            int insertion = helper(word1, word2, i, j - 1, memo);
            int substitution = helper(word1, word2, i - 1, j - 1, memo);
            return memo[i][j] = Math.min(deletion, Math.min(insertion, substitution)) + 1;
        }
    }
}
