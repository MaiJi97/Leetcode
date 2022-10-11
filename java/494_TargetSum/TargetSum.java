class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return dfs(nums, target, 0, 0, memo);
    }
    
    public int dfs(int[] nums, int target, int index, int sum, HashMap<String, Integer> memo) {
        String key = serialize(index, sum);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        int plus = dfs(nums, target, index + 1, sum + nums[index], memo);
        int minus = dfs(nums, target, index + 1, sum - nums[index], memo);
        memo.put(key, plus+minus);
        return plus+minus;
    }
    
    public String serialize(int index, int sum) {
        return index + "," + sum;
    }
}
