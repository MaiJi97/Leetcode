class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return dfs(nums, target, 0, 0, memo);
    }

    public int dfs(int[] nums, int target, int index, int currentSum, HashMap<String, Integer> memo) {
        String key = index + "," + currentSum;
        if (memo.containsKey(key)) return memo.get(key);
        if (index == nums.length) {
            if (currentSum == target) return 1;
            else return 0;
        }
        int plus = dfs(nums, target, index + 1, currentSum + nums[index], memo);
        int minus = dfs(nums, target, index + 1, currentSum - nums[index], memo);
        memo.put(key, plus + minus);
        return plus + minus;
    }
}
