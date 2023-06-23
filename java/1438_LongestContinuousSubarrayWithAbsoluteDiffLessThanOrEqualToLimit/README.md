## Method 1: Two Pointers 同向双指针 + Priority Queue

To ensure that every pair of numbers within the subarray satisfies the limit of difference, we just need to ensure the maximum number 
and the minimum number within the subarray satisfies the limit of difference. So for each subarray, we need to compute the maximum value 
and minimum value - we can use two priority queues for this. 

The rest of the problem is similar to problem 209 - two pointers sliding window. But instead of computing sum of all the elements in the
subarray, we need to compute the difference between the maximum element and the minimum element here.

Time Complexity: O(nlogn)

## Method 2: Monotonic Deque
