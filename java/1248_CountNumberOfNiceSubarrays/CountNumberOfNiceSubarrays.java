class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }

    private int atMostK( int[] nums, int k) {
        int ret = 0;
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) count++;
            while (j <= i && count > k) {
                if (nums[j] % 2 == 1) count--;
                j++;
            }
            ret += (i - j + 1);
        }
        return ret;
    }
}
