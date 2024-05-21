class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] memo = new int[arr.length];
        Arrays.fill(memo, -1);
        return dfs(arr, k, 0, memo);
    }

    public int dfs(int[] arr, int k, int index, int[] memo) {
        if (index >= arr.length) return 0;
        else if (memo[index] != -1) {
            return memo[index];
        }
        int maxVal = 0;
        int ret = 0;
        int end = Math.min(arr.length, index + k);
        for (int i = index; i < end; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            ret = Math.max(ret, maxVal * (i - index + 1) + dfs(arr, k, i + 1, memo));
        }
        return memo[index] = ret;
    }
}
