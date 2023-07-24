## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents how many ways we can get to ith floor, so i is from 0 to n (length n+1) </br>

Recurrence relation:
dp[i] = 0 if i is 0 or 1. </br>
dp[i] = dp[i-1] + dp[i-2] where i >= 2. </br>

Time Complexity: O(n)
