## Method 1: Iterative Approach

Loop through the array and check adjacent elements to determine if there are duplicates.

Time Complexity: O(n)


## Method 2 & 3: Binary Search

Let's use template 2 and template 3 of binary search. For template 2, after we break the while loop, left and right pointers are the same, so we just need to return any of them. For template 3, after we break the while loop, left and right pointers are like (right, left), where left should be the target.

Better to use template 2 though since we do not have a specific target to look for.

Also note that the approach won't work if there are duplicate: 1, 2, 4, 4, 6, 6, 5, 3, 2. Because the condition to check is if the current element is smaller than the next element,
but there might be a case when the target is on the right but we are at the first 6 so we eliminate everything on its right.

Time Complexity: O(logn)
