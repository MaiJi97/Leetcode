## Method 1: Brute Force
Use two for loops to trace the start and end of the substring and use another loop to determine if the substring is palindromic or not. <br />
Time complexity is O(n^3)

## Method 2: Expand from Center
For each character, consider center and expand on both sides to find maximum length of palindrome. <br />
Two possibilities: <br />
1) For odd length of palindrome: center = i <br />
2) For even length of palindrome: center = i to i + 1 <br />
Length = right - left + 1

## Method 3: Dynamic Programming
Store true / false information in a matrix, opt[i][j] represents if the substring from index i to index j is palindromic or not. <br />
Recurrence relation is: <br />
OPT[i][j] = true if i == j (base case) <br />
OPT[i][j] = true if s.charAt(i) == s.charAt(j) && j - i <= 2 <br />
OPT[i][j] = true if s.charAt(i) == s.charAt(j) && OPT[i+1][j-1] == true <br />
Time complexity is O(n^2)
