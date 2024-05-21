## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, the helper method compute the maximum sum after partition for the subarray starting from ith index to the end index. If we reach the end of the 
array, return 0. Else compute the sum for the current partition and call the method recursively to find the total sum for all the partitions. Record results we 
get into the memo array to avoid repeated computation.

Time Complexity: O(n * k)

## Method 2: Dynamic Programming

Bottom up solution, dp[i] represents the maximum sum after partition for the subarray starting from ith index to the end index.

Time Complexity: O(n * k)
