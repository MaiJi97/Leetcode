## Method 1: Brute Force through recursion

Most straight forward approach, but will result in TLE.

## Method 2: Memoization Search (DFS/recursion + Memoization)

Top down solution, similar as brute force method using recursion, but we will record the result of recursion through an array so that we do not need to do recursion with same parameters multiple times.

Time Complexity: O(n)

## Method 3: Dynamic Programming

Bottom up solution, dp[i] represents the number of ways we can get to ith floor. So i is from 0 to n (length of n+1) </br>

Recurrence relation:
dp[i] = 0 if i is 0 or 1. </br>
dp[i] = dp[i-1] + dp[i-2] where i >= 2. </br>

Time Complexity: O(n)
