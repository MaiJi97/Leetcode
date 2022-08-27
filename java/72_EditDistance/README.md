## Method 1: Memoization Search (DFS/recursion + Memoization)

top down solution, use recursion to get the edit distance of different prefixes of the two words, and use a matrix to store the result so we don't need to recompute when there are encountered values. </br>

Time Complexity: O(mn)


## Method 2: Dynamic Programming

bottom up solution, dp[i][j] represents the edit distance of vi and wj, where vi is the prefix of v of length i (substring from the beginning to index i) and wj is the prefix of w of length j (substring from the beginning to index j) </br>

Recurrence relation:
<img width="1116" alt="Screen Shot 2022-08-27 at 5 26 39 PM" src="https://user-images.githubusercontent.com/106039830/187050196-138d7943-6703-483a-b7bc-77fd97dedd5f.png">

dp[i-1, j] + 1 is deletion:
for example, from horse to hors

dp[i, j-1] + 1 is addition: 
for example, from hors to horse

dp[i-1, j-1] + 1 is substitution, to replace the last character of v by the last character of w.


Time Complexity: O(mn)

