## Method 1: Dynamic Programming

dp[i][j] represents the optimal / minimum total price if select i from first price and select j from second element. We can form the following recurrence
relation: </br>
dp[i][j] = dp[i-1][0] + costs[i-1][0] if i > 0 and j = 0 </br>
dp[i][j] = dp[0][j-1] + costs[j-1][1] if j > 0 and i = 0 </br>
dp[i][j] = min(dp[i-1][j] + costs[i+j-1][0], dp[i][j-1] + costs[i+j-1][1])

Time Complexity: O(n^2)
