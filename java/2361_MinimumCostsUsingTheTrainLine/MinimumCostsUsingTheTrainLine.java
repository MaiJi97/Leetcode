class Solution {
    public long[] minimumCosts(int[] regular, int[] express, int expressCost) {
        int n = regular.length;
        long[] ret = new long[n];
        long[] regularLong = Arrays.stream(regular).mapToLong(i -> i).toArray();
        long[] expressLong = Arrays.stream(express).mapToLong(i -> i).toArray();
        long[] dp1 = new long[n+1];
        long[] dp2 = new long[n+1];
        dp2[0] = (long)expressCost;
        for (int i = 1; i < n + 1; i++) {
            dp1[i] = Math.min(dp1[i-1], dp2[i-1]) + regularLong[i-1];
            dp2[i] = Math.min(dp1[i-1] + (long)expressCost, dp2[i-1]) + expressLong[i-1];
            ret[i-1] = Math.min(dp1[i], dp2[i]);
        }
        return ret;
    }
}
