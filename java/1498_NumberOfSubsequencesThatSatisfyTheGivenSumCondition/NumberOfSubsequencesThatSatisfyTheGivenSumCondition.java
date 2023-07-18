class Solution {
    long[] memo;

    public int numSubseq(int[] nums, int target) {
        memo = new long[nums.length];
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        long ret = 0;
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            }
            else {
                ret += power(right - left);
                left++;
            }
        }
        return (int)(ret % 1000000007);
    }

    private long power(int time) {
        if (time == 0) return 1;
        if (memo[time] > 0) return memo[time];
        long ret = 2 * power(time - 1); 
        ret %= 1000000007;
        memo[time] = ret;
        return ret;
    }
}
