## Method 1: Dynamic Programming

Bottom up solution, dp[i][j] represents the side length of the maximum square whose bottom right corner is at (i, j) of the matrix.

Recurrence relation: 
dp[i][j] = 0 if matrix[i][j] = 0
dp[i][j] = min(dp[i-1][j-1], dp[i][j-1], dp[i-1][j]) + 1 if matrix[i][j] = 1
dp[i][0] = matrix[i][0] if j == 0 
dp[0][j] = matrix[0][j] if i == 0 

<img width="555" alt="Screen Shot 2023-10-12 at 8 04 44 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/532c9a52-fc27-4b32-8a50-fad3f96cf8ec.png">

We also need to use a variable to keep track of the maximum side length of the maximum square as we keep updating the values in the dp matrix.

Time Complexity: O(m * n)

## Method 2: Dynamic Programming Improved 

We can improve the space complexity of method 1, as we only care about the dp values of the three cells that are adjacent to the current cell. So we can reduce the 
2D matrix to an array and reduce the space complexity from O(m * n) to O(n).

Time Complexity: O(m * n)
