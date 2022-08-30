class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[][] dp = new int[l1 + 1][l2 + 1]; // dp[i][j] stands for the MRS of the subarray of nums1 of first i char, and subarray of nums2 of first j char
        int ret = 0;
        for (int i = 0; i < l1 + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < l2 + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < l1 + 1; i++) {
            for (int j = 1; j < l2 + 1; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }
        return ret;
    }
}
