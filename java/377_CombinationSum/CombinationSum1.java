class Solution {
    int total = 0;
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return dfs(nums, target, memo);
    }

    public int dfs(int[] nums, int remain, int[] memo) {
        if (remain == 0) {
            return 1;
        }
        else if (remain < 0) return 0;
        else if (memo[remain] != -1) return memo[remain];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += dfs(nums, remain - nums[i], memo);
        }
        memo[remain] = count;
        return count;
    }
}
