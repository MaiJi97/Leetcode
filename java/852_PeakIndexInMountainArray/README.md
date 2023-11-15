## Method 1: Iterative Approach

Loop through the array and check adjacent elements to determine if there are duplicates.

Time Complexity: O(n)


## Method 2: Binary Search

Let's use template 2 of binary search. After we break the while loop, left and right pointers are the same, so we just need to return any of them.

Time Complexity: O(logn)
