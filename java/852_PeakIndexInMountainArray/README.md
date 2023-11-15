## Method 1: Iterative Approach

Loop through the array and check adjacent elements to determine if there are duplicates.

Time Complexity: O(n)


## Method 2 & 3: Binary Search

Let's use template 2 and template 3 of binary search. For template 2, after we break the while loop, left and right pointers are the same, so we just need to return any of them. For template 3, after we break the while loop, left and right pointers are like (right, left), where left should be the target.

Time Complexity: O(logn)
