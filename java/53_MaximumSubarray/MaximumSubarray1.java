class Solution {
    public int maxSubArray(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum[i + 1] = sum;
        }
        int j = 0;
        int ret = Integer.MIN_VALUE;
        for (int i = 1; i < prefixSum.length; i++) {
            ret = Math.max(ret, prefixSum[i] - prefixSum[j]);
            if (prefixSum[i] < prefixSum[j]) j = i;
        }
        return ret;
    }
}
