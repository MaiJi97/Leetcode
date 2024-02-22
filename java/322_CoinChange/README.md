## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents minimum number of coins needed to change for value i, so i is from 0 to n (length n+1). </br>

Recurrence relation: </br>
dp[i] = 0 if i = 0 </br>
dp[i] = min(dp[j]+1) if i - dp[j] is in coins </br>
dp[i] = Integer.MAX_VALUE otherwise </br>
Finally return dp[amount] if it is not Integer.MAX_VALUE, -1 otherwise

Time Complexity: O(n * m) where n is amount and m is number of coins
