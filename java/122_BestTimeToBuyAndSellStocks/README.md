## Method 1: Greedy Algorithm

Intuition is that we can do a trade whenever the current price is greater than the price on the previous day. Then the total profit would be the sum of all the profits from the trades. Though this approach could cause trades that are not necessary.

Time Complexity: O(n)

## Method 2: Two Pointers - sliding window

A problem with the above approach is that we may end up trading too many times, some of which are not necessary. How can we know when is the best time to sell a stock. For example, in the example, [7, 1, 4, 5, 3, 6], profit is (5-1) + (6-3). However, if we do not do the trade each time there is an increase in price, how do we know when is the best time to sell the stock? The solution is to look for monotonically increasing pattern, and trade only for those monotonically increasing intervals. We need two pointers, one to track the local maximum price which is the end of the interval (when we sell the stock), the other to stay at the local minimum price which is the start of the interval (when we buy the stock). Use a while loop since we want to keep iterating under a condition instead of incrementing one step by one step. After we find the boundaries for an interval, compute the profit gained from this interval and add it to the total profit. Then update the left pointer to the position of the right pointer. 

Note that if we have an array like [7, 1, 4, 5, 7, 3, 6], we will do nothing on the first day and the fifth day. So before starting to find the monotonically increasing pattern, we have to add a check to ensure that we are at the start of a monotonically increasing interval (ie: local minimum, the former element is greater).

Time Complexity: O(n)
