## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, use recursion to get the minimum path sum for up to each point, and use a matrix to store the result so we don't need to recompute when there are encountered values. </br>

Time Complexity: O(n^2)


## Method 2: Dynamic Programming

Bottom up solution, dp[i][j] represents the minimum path sum from position (i,j) to the top. The reason we go from the last row to the top instead of the opposite is that we don't need to consider the edge case for the boundary two points on each row explicitly. </br>

Recurrence relation:

dp[i][j] = triangle(i,j) if i == 0 </br>
dp[i][j] = Math.min(dp[i+1,j], dp[i+1][j+1]) + triangle(i,j)

Time Complexity: O(n^2)
