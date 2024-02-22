## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution using DFS, but we will record the result of recursion through an array so that we do not need to do recursion with same parameters multiple times.

Time Complexity: O(T * N) where T is the target value, and N is the number of elements in the input array.

## Method 2: Dynamic Programming

This problem is different from the first three combination sum problems, because we do not need to find all the result, just the number of outputs. We can 
use dynamic programming for this:

Recurrence relation: 

dp[i] represents number of ways to sum up to i. 

Time Complexity: O(T * N) where T is the target value, and N is the number of elements in the input array.
