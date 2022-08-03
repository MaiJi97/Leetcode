class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        int ret = nums.length + 1;
        prefixSum[0] = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for (int i = 1; i < nums.length + 1; i++) {
            int left = i;
            int right = nums.length;
            int newTarget = target + prefixSum[i - 1];
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (prefixSum[mid] >= newTarget) {
                    ret = Math.min(ret, mid - i + 1);
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return ret > nums.length ? 0 : ret;
    }
}
