## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, if the string starts with a word in the dictionary, then call the method recursively to find if the rest of the string is also composed of words in the dictionary, and use an array to store the result so we don't need to recompute when there are encountered values. </br>

Time Complexity: O(n^2)


## Method 2: Dynamic Programming

Bottom up solution, dp[i] represents if the prefix of the string from the beginning up to index i can be segmented into different words in the dictionary.  </br>

Recurrence relation:

dp[i] = true if for any j < i and dp[j] == true, substring s(i, j) is in the dictionary </br>
dp[i] = false otherwise

Time Complexity: O(n^2)

