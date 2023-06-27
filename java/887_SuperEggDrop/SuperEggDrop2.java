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

        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int up = helper(k, n - mid, memo);
            int down = helper(k - 1, mid - 1, memo);
            if (down < up) left = mid + 1;
            else right = mid - 1;
            min = Math.min(min, Math.max(up, down) + 1);
        }
        memo[k][n] = min;
        return min;
    }
}
