## Method 1: Binary Search

This is similar as an ordinary binary search but the instead of comparing nums[mid] directly to the target value we need to obtain value for row and col from the mid value.

Time Complexity: O(log(m*n))

## Method 2: Two Pointers

Start from the upper right corner, move downward or leftward depending on how the current value is compared with the target value.

Time Complexity: O(log(m*n))
