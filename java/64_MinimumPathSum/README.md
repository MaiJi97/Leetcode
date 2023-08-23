## Method 1: Dynamic Programming

Bottom up solution, dp[i][j] represents the minimum path sum up to the cell grid[i][j] 

Recurrence relation: 
dp[i][j] = grid[i][j] if i == 0 || j == 0 </br>
dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j] otherwise

Note that we can also use Dijkstra algorithm (though might be overkilling) because in the problem we can only move to the right or 
down, but backward toward left or up.

Time Complexity: O(m * n)
