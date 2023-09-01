## Method 1: Iterative Approach

Loop through the array and check adjacent elements to determine if there are duplicates.

Time Complexity: O(n)


## Method 2: Binary Search

Choose to use template 3 of binary search. After we break the while loop, left and right pointers are like (right, left), where left points to the peak element and right points to the element before the peak element.

Time Complexity: O(logn)
