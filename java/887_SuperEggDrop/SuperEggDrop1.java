class Solution {
    public int superEggDrop(int k, int n) {
        int[][] memo = new int[k + 1][n + 1];
        return helper(k, n, memo);
    }

    private int helper(int k, int n, int[][] memo) {
        if (n <= 1) return n;
        if (k <= 1) return n;
        if (memo[k][n] > 0) return memo[k][n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int up = helper(k, n - i, memo);
            int down = helper(k - 1, i - 1, memo);
            min = Math.min(min, Math.max(up, down) + 1);
        }
        memo[k][n] = min;
        return min;
    }
}
