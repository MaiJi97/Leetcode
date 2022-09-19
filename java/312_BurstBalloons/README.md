## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, in between index i and index j, each number can be k, which is the index of the balloon burst lastly. Through recursion we can calculate the maximum number of coins we can get for each k and therefore the maximum number of coins we can get for subproblem bursting balloons between i and j. We use a matrix to store the result so we don't need to recompute when there are encountered values. </br>

Time Complexity: O(n^3)


## Method 2: Dynamic Programming

Bottom up solution, dp[i][j] represents the maximum number of coins we can by bursting balloons from index i to index j (solving a sub problem). </br>

Recurrence relation:

dp[i][j] = max(nums[k] * nums[i-1] * nums[j+1] + dp[i, k-1] + dp[k+1, j]) for k in between i and j </br>

Time Complexity: O(n^3)
