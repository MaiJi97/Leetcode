### Method 1: Two Pointers 同向双指针
Sliding window - One pointer i to loop through the array, and the other pointer j to locate the start index of the sliding window / subarray. While the sum is the greater or equal to the target, we keep incrementing pointer j until the greater or equal condition no longer satisfies, and update the counter / ret to get the minimum value.

Time Complexity: O(n) - each element can be visited at most once, once by the i pointer and once by the j pointer
