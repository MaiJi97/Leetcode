## Method 1: Dynamic Programming

Similar with problem 62 Unique Path I, use bottom up solution, dp[i][j] represents number of path from the starting point to position (i,j). The only difference is 
that if the current cell is an obstacle, number of path to the current cell will be 0.

Recurrence relation:

dp[i][j] = 0 if current cell is an obstacle.
dp[i][j] = 1 if i == 0 or j == 0 </br>
dp[i][j] = dp[i-1][j] + dp[i][j-1]

Time Complexity: O(m * n)
