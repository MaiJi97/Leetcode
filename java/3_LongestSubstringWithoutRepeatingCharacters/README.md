## Method 1: Two Pointers 同向双指针

Sliding window - one pointer i to loop through the array, and the other pointer j to track the start index of the subarray without any repeating character (use a hash set to track repeating characters)

Time Complexity: O(n)