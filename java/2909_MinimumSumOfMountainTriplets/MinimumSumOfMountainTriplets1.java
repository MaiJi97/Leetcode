class Solution {
    public int minimumSum(int[] nums) {
        int[] left = new int[nums.length]; // store minimum on the left of each element
        int[] right = new int[nums.length]; // store minimum on the right of each element

        left[0] = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.min(left[i - 1], nums[i - 1]);
        }
        
        right[nums.length - 1] = Integer.MAX_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = Math.min(right[i + 1], nums[i + 1]);
        }
        
        int ret = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > left[i] && nums[i] > right[i]) {
                ret = Math.min(ret, nums[i] + left[i] + right[i]);
            }
        }
        return ret == Integer.MAX_VALUE ? -1 : ret;
        
    }
}
