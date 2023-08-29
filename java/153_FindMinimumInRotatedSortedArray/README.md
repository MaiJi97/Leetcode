## Method 1: Binary Search

To find minimum value in rotated array, use template 2 of binary search, but the initial right boundary value is set to nums.length - 1 instead of nums.length, as we will use it later in the body part and it's not good to alwasy write as right - 1.

Time Complexity: O(logn)
