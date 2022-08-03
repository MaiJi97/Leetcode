class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length]; // dp[i][j] stands for the MRS of the subarray ends at nums1[i] and ends at nums2[j]
        int ret = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }
        return ret;
    }
}
