## Method 1: Dynamic Programming

Bottom up solution, dp[i][j] represents number of path from the starting point to position (i,j).

Recurrence relation:

dp[i][j] = 1 if i == 0 or j == 0 </br>
dp[i][j] = dp[i-1][j] + dp[i][j-1]

Time Complexity: O(m * n)
