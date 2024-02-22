## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents number of ways to change for value i, so i is from 0 to n (length n+1).

Note that {1, 2} and {2, 1} are considered as the same way in this problem. So coins iteration has to be in the outer loop.

Time Complexity: O(n * m) where n is amount and m is number of coins
