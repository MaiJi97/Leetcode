class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums, target, 0, 0);
    }

    public int dfs(int[] nums, int target, int index, int currentSum) {
        if (index == nums.length) {
            if (currentSum == target) return 1;
            else return 0;
        }
        int plus = dfs(nums, target, index + 1, currentSum + nums[index]);
        int minus = dfs(nums, target, index + 1, currentSum - nums[index]);
        return plus + minus;
    }
}
