class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] DP = new int[nums.length];
        DP[0] = 1;
        int ret = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, DP[j]);
                }
            } 
            DP[i] = max + 1;
            ret = Math.max(ret, DP[i]);
        }
        return ret;
    }
}
