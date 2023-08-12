class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left <= right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    ret += (right - left);
                    left++;
                }
                else if (sum >= target) right--;
            }
        }
        return ret;
    }
}
