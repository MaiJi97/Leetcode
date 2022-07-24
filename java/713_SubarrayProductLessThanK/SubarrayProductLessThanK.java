class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ret = 0;
        int product = 1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            while (product >= k && j <= i) {
                product /= nums[j];
                j++;
            }
            ret += (i - j + 1);
        }
        return ret;
    }
}
