### Method 1: Two Pointers 同向双指针 - sliding window

One pointer i to loop through the array, and the other pointer j to locate the start index of the sliding window / subarray. In this question we aim to obtain the number of subarrays instead of the minimum length subarray, so we will need to find the boundaries between which the subarray has product that is smaller than the target. Therefore, while the product is greater or equal to the target, we keep incrementing pointer j until the greater or equal condition no longer satisfies, and the i - j + 1 represents the total number of subarray between these boundaries.

Time Complexity: O(n) - each element can be visited at most once, once by the i pointer and once by the j pointer
