## Method 1: Greedy Algorithm

Intuition is that we can do a trade whenever the current price is greater than the price on the previous day. Then the total profit would be the sum of all the profits from the trades. Though this approach could cause trades that are not necessary.

Time Complexity: O(n)

## Method 2: Two Pointers - sliding window (?)

A problem with the above approach is that we may end up trading too many times, some of which are not necessary. How can we know when is the best time to sell a stock. For example, in the example, [7, 1, 4, 5, 3, 6], profit is (5-1) + (6-3). However, if we do not do the trade each time there is an increase in price, how do we know when is the best time to sell the stock? What if someone buys it for 1 and sells it on the last day? The solution is to use two pointers, one to track the local maximum price, the other to track the local minimum price. For each current price that is greater than the previous, instead of doing the trade immediately, we can keep iterating until we find the breakpoint where the price is monotonically increasing, which is the day we will sell the stock. Then, update the left pointer to the position of the right pointer. If the current 
price is not greater than the previous, update both pointers.

Time Complexity: O(n)
