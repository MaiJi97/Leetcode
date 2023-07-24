## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents if or not index i can be reached, so i is from 0 to n - 1 (length n). 

Recurrence relation: </br>
dp[i] = 0 if i = 0 </br>
dp[i] = true if for some j <= i, dp[j] is true and i - j <= nums[j] </br>

Time Complexity: O(n^2)

## Method 2: Greedy Algorithm

We can improve the solution to linear time complexity. We keep track of a variable maxIndex which represents the furthest index we can 
jump to. If the final value of maxIndex is greater than or equal to length of nums, we are able to jump to the last index.

Time Complexity: O(n)
