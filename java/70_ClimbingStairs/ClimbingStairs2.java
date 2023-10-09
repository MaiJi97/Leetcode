class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return dfs(n, memo);
    }

    public int dfs(int n, int[] memo) {
        if (n == 1) return memo[n] = 1;
        if (n == 2) return memo[n] = 2;
        if (memo[n] != 0) return memo[n];
        int current = dfs(n - 1, memo) + dfs(n - 2, memo);
        return memo[n] = current;
    }
}
