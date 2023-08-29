## Method 1: Binary Search

Similar as Problem 153. The only difference is that there might be duplicates in this problem, so all we need to do is to add an additional case in the binary search, to decrement the right pointer when nums[mid] is equal to nums[right].
