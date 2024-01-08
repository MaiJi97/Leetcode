## Method 1: Brute Force

Brute force approach to iterate through each tower and compute the maximum sum of heights by setting each tower as pivot. 

Time Complexity: O(n ^ 2)

## Method 2: Monotonic Stack

In this problem, we want to keep track of closest lower tower on the left and closest lower tower on the right for each column (对于每个column来说向左右分别看到的最近的比自己低的tower) and store the cumulative sum of heights from both sides up to the current tower, using two arrays through parallel pointers. This cannot be done through a simple two rounds of iteration from both directions as in problem 42. We can use monotonic stack as we care about next greater element / next smaller element / previous greater element / previous smaller element. 

We need to keep two monotonic stacks (or one used for twice). One iterate from left to right, keep the stack monotonically increasing, and use an array to store cumulative sum of heights from the leftmost tower to the current tower by setting the pivot to be the current tower. The other time iterate from right to left, keep the stack monotonically decreasing, and use another array to store cumulative sum of heights from the rightmost tower to the current tower by setting the pivot to be the current tower. Then we just need to go through the two arrays, and compute maximum sum of heights by setting the pivot to be each tower. This runs in O(n).

Time Complexity: O(n)
