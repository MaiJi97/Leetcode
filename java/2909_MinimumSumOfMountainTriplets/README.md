## Method 1: Two Pointers 同向双指针 - parallel pointers

For each element in the array, we would like to know the minimum value on its left and minimum value on its right which are also less than the element itself. Therefore, we can use two arrays to keep track of the minimum values for element at each index. Then, use another iteration to compute the triplet that satisfies the requirement.

Note that instead of keeping the two arrays as minimum values on an element's left / right side that is also smaller than the elemenet, we can simply keep the minimum on its left / right side and check if it is smaller than the element during the final iteration.

Time Complexity: O(n)
