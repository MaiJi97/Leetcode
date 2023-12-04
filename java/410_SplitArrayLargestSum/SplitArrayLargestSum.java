class Solution {
    public int splitArray(int[] nums, int m) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            left = Math.max(nums[i], left);
            right += nums[i];
        }
        int ret = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = helper(nums, mid);
            if (count > m) {
                left = mid + 1;
            }
            else {
                ret = mid;
                right = mid - 1;
            }
        }
        return ret;
    }
    
    private int helper(int[] nums, int targetSum) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {     
            if (sum + nums[i] <= targetSum) {
                sum += nums[i];
            }
            else {
                count++;
                sum = nums[i];
            }     
        }
        return count;
    }
}
