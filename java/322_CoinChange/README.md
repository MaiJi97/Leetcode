## Method 1: Dynamic Programming

dp[i] represents the minimum number of coins needed to change for value i. </br>
dp[i] = 0 if i = 0 </br>
dp[i] = min(dp[j]+1) if i - dp[j] is in coins </br>
dp[i] = Integer.MAX_VALUE otherwise </br>
Finally return dp[amount] if it is not Integer.MAX_VALUE, -1 otherwise
