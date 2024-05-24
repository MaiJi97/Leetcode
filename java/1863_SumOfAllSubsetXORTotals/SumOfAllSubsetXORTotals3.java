class Solution {

    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    public int dfs(int[] nums, int index, int current) {
        if (index == nums.length) return current;
        return dfs(nums, index + 1, current) + dfs(nums, index + 1, current ^ nums[index]);
    }
}
