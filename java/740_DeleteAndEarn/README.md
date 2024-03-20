## Method 1: Memoization Search (DFS/recursion + Memoization)

Top down solution, the problem can be converted to the house robber problem - we have to remove the adjacent elements after we select an element. First we use a data structure to store the elements in the array and their frequencies (can use a hashmap but to make it easier, we use array / bucket sort). Then recursively find the maximum score we can earn from the subarray that contains elements up to the current index's element.

Time Complexity: O(n)

## Method 2: Dynamic Programming

Bottom up solution, dp[i] represents the maximum score we can earn from elements that are in between 0 and i. So i is from 0 to max value in the array.

Recurrence relation: 
dp[i] = 0 if i == 0 </br>
dp[i] = 1 * 1's frequencies if i == 1 </br>
dp[i] = max(dp[i-2] + i * i's frequencies, dp[i - 1]) if i >= 2 </br>

Time Complexity: O(n)
