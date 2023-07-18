class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int profit = 0;
        while (j < prices.length) {
            if (prices[j] > prices[i]) {
                while (j < prices.length - 1 && prices[j + 1] > prices[j]) j++; // find the breakpoint of monotonically increasing
                profit += (prices[j] - prices[i]);
                i = j;
            }
            else {
                i = j;
                j++;
            }
        }
        return profit;
    }
}
