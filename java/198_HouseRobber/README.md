## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents the maximum amount of money can be robbed up to the ith index house, so i is from 0 to n - 1 (so
length n)

Recurrence relation:

dp[i] = 0 if length is 0 </br>
dp[i] = nums[0] if length is 1 </br>
dp[i] = Math.max(nums[0], nums[1]) if length is 2 </br>
dp[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]) otherwise </br>
Finally return dp[n - 1]

Time Complexity: O(n)
