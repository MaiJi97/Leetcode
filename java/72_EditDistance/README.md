## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, use recursion to get the edit distance of different prefixes of the two words, and use a matrix to store the result so we don't need to recompute when there are encountered values. </br>

Time Complexity: O(mn)


## Method 2: Dynamic Programming

Bottom up solution, dp[i][j] represents the edit distance of vi and wj, where vi is the prefix of v of length i (substring from the beginning of length I, 即v的前i个char) and wj is the prefix of w of length j (substring from the beginning of length j, 即w的前j个char)
 </br>

Recurrence relation: </br>
dp[i][j] = dp[i-1][j-1] if v(i-1) == w(j-1) </br>
dp[i][j] = max(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]+1) if v(i-1) != w(j-1) </br>
dp[i][j] = i if j == 0 </br>
dp[i][j] = j if i == 0 </br>

dp[i-1, j] + 1 is deletion:
for example, from horse to hors

dp[i, j-1] + 1 is addition: 
for example, from hors to horse

dp[i-1, j-1] + 1 is substitution, to replace the last character of v by the last character of w.


Time Complexity: O(mn)

