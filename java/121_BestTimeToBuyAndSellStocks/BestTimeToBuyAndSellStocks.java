class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - prices[j]);
            if (prices[i] < prices[j]) {
                j = i;
            }
        }
        return maxProfit;
    }
}
