class Solution {
    public int maxCoins(int[] nums) {
        int[][] memo = new int[nums.length][nums.length];
        for (int[] I : memo) {
            Arrays.fill(I, -1);
        }
        return dfs(nums, memo, 0, nums.length-1);
    }
    
    public int dfs(int[] nums, int[][] memo, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            int m = (i == 0) ? 1 : nums[i-1];
            int n = (j == nums.length - 1) ? 1 : nums[j+1];
            int coins = nums[k] * m * n + dfs(nums, memo, i, k-1) + dfs(nums, memo, k+1, j);
            max = Math.max(max, coins);
        }
        memo[i][j] = max;
        return memo[i][j];
    }
}
