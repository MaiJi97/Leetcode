class Solution {

    int ret = 0;
    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return ret;
    }

    public void dfs(int[] nums, int index, int current) {
        ret += current;
        for (int i = index; i < nums.length; i++) {
            dfs(nums, i + 1, current ^ nums[i]);
        }
    }
}
