## Method 1: Brute Force (DFS / recursion)
Time Complexity: O(2 ^ n)

## Method 2: Memoization Search (DFS/recursion + Memoization)
Similar as brute force method using recursion, but we will record the result of recursion through a hash map using current sum and current index as key, so that we do not 
need to do recursion with same parameters multiple times.

Time Complexity: O(t * n) where t is the sum of the nums array
