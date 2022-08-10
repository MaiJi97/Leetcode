## Method 1: Dynamic Programming

DP[i] represents the longest increasing subsequence up to index i.

Recurrence relation is: </br>
dp[i] = max(dp[j]) + 1 where j < i and nums[j] < nums[i]

Time Complexity:O(n^2)

## Method 2: Binary Search

