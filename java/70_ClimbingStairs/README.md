## Method 1: Dynamic Programming

Recurrence relation:

dp[i] represents how many ways we can get to ith floor, so i is from 0 to n (length n+1) </br>
dp[i] = dp[i-1] + dp[i-2] where i >= 2. </br>
dp[0] and dp[1] is 1 at the beginning.
