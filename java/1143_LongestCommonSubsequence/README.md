## Method 1: Dynamic Programming

Bottom up solution, dp[i][j] represents the longest common subsequence between first i characters of first string and first j characters of second string. </br>

Recurrence relation:

dp[i][j] = dp[i-1][j-1] + 1 if s1.charAt(i) == s2.charAt(j) </br>
dp[i][j] = max(dp[i-1][j], dp[i][j-1]) otherwise.

Time Complexity: O(n^2)
