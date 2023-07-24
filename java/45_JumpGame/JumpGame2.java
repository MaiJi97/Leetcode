class Solution {
    public int jump(int[] nums) {
        int left = 0;
        int right = 0;
        int ret = 0;
        for (int i = 0; i < nums.length - 1; i++) { // stop at second last index as we don't need to make any jump from the last index
            right = Math.max(right, i + nums[i]);
            if (i == left) {
                ret++;
                left = right;
            }
        }
        return ret;
    }
}
