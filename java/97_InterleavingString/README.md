## Method 1: DFS / Traverse through recursion

A traditional brute force DFS approach, if the current string built up has the same length as s3, we can compare if they are equal and return the result. Else build 
up the current string character by character, either from taking the next character from s1, or taking the next character from s2.

Time Complexity: O(2 ^ (m + n)) where m is the length of s1 and n is the length of s2.

## Method 2: DFS / Traverse through recursion - backtracking

Same approach as method 1, but we use a string builder instead so we don't have to create too many new strings. However, note that appending new characters to the
string builder will make change to the current existing string builder, so we need to take one step back in order to enable other options (this is not an issue in 
method 1 since concatenate new characters to the string will create a new string instead of changing the exisiting string).

Time Complexity: O(2 ^ (m + n)) where m is the length of s1 and n is the length of s2.

## Method 3: Memoization Search (DFS/recursion + Memoization)

Top down solution, memo[i][j] represents if or not the first i characters in s1 and first j characters in s2 can interleave to form the first (i+j) characters in s3.

Time Complexity: O(m * n)

## Method 4: Dynamic Programming

Bottom up solution, dp[i][j] represents if or not the first i characters in s1 and first j characters in s2 can interleave to form the first (i+j) characters in s3.

Recurrence relation: 
dp[i][j] = true if i == 0 and j == 0 </br>
dp[i][j] = true if s1.charAt(i - 1) = s3.charAt(i - 1) and j == 0 </br>
dp[i][j] = true if s2.charAt(j - 1) = s3.charAt(j - 1) and i == 0 </br>
dp[i][j] = true if dp[i][j] = (dp[i - 1][j] and s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j] = dp[i][j - 1] and s2.charAt(j - 1) == s3.charAt(i + j - 1)) else </br>

Time Complexity: O(m * n)


