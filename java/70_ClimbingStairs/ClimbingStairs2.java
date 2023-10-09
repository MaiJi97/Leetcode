class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        return dfs(n, memo);
    }

    public int dfs(int n, int[] memo) {
        if (memo[n] != 0) return memo[n];
        int current = dfs(n - 1, memo) + dfs(n - 2, memo);
        return memo[n] = current;
    }
}
