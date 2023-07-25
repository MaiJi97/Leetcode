## Method 1: Dynamic Programming

Bottom up solution, dp[i] represents the minimum number of jump required to reach index i, so i is from 0 to n - 1 (length n).

Recurrence relation: 
Initially all dp[i] are Integer.MAX_VALUE </br>
dp[i] = 0 if i = 0 </br>
dp[i] = dp[j] + 1 if for some j <= i, i - j <= nums[j] 

Time Complexity: O(n^2)

## Method 2: Greedy Algorithm - Two Pointers 同向双指针 - fast & slow

We can improve the solution to linear time complexity. Use two pointers, a right pointer to track the furthest index we can reach, and
a left pointer to track the furthest starting index before we take a new step. As pointer i reaches the left pointer, which means the
current jump ends, we can update left pointer to right pointer and increment number of jumps.

Time Complexity: O(n)
