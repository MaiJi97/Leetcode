class Solution {

    int ret = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return ret;
    }

    public void dfs(int[] nums, int index, int currentSum) {
        if (index == nums.length) {
            ret += currentSum;
            return;
        }
        dfs(nums, index + 1, currentSum); // choose the current element
        dfs(nums, index + 1, currentSum ^ nums[index]); // not choose the current element
    }

}
