## Method 1: Dynamic Programming 

The problem is similar as problem 5, but instead of finding the longest palindromic substring, we are looking for the total number of 
palindromic substrings. 

Store true / false information in a matrix, dp[i][j] represents if the substring from index i to index j is palindromic or not. 
Recurrence relation is: 
dp[i][j] = true if i == j (base case) 
dp[i][j] = true if s.charAt(i) == s.charAt(j) && j - i <= 2 
dp[i][j] = true if s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true 

Time Complexity: O(n^2)
