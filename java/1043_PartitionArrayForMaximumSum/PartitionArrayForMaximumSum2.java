class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            int end = Math.min(arr.length, i + k);
            int maxVal = 0;
            for (int j = i; j < end; j++) {
                maxVal = Math.max(maxVal, arr[j]);
                dp[i] = Math.max(dp[i], maxVal * (j - i + 1) + dp[j + 1]);
            }
        }
        return dp[0];
    }
}
