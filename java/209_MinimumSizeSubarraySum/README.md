### Method 1: Two Pointers 同向双指针
One pointer to loop through the array, and the other to locate the start index of the sliding window / subarray for which the sum is the greater or equal to the target.

Time Complexity: O(n) - each element can be visited at most once, once by the i pointer and once by the j pointer
