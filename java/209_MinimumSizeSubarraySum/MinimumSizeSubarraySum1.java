class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ret = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (j <= i && sum >= target) {
                ret = Math.min(ret, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }
}
