class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    ret = sum;
                    break;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;              
                }
                if (Math.abs(sum - target) < Math.abs(ret - target)) {
                    ret = sum;
                }
            }
        }
        return ret;
    }
}
