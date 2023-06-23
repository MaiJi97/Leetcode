## Method 1: Monotonic Deque

Two pointers appraoch won't work as there could be negative elements in the array. Instead, we need to use prefix sum.

We do not use hash map here as we are not looking for sum of k, but for sum of at least k. We need monotonic deque instead.

<img width="612" alt="Screen Shot 2023-06-23 at 1 43 43 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/956f9016-6e68-432a-9539-d46cb9693e6e.png">

递增队列：for each element at index i in the prefi sum array, we make sure elements are kept in a window such that difference between
prefix sums is at least k, and they are monotonically increasing within the window. 为什么递增？We want to find the closest element before
element at index i that is k value smaller than element at index i.

<img width="806" alt="Screen Shot 2023-06-23 at 7 23 03 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d5d3b3f2-1595-4cc1-ae18-fb35dc424f40.png">


Time Complexity: O(n)
