## Method 1: Binary Search

Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like this through guessing the answer by calculation through mid value. As we aim to minimize the largest sum of the k subarrays, we want the sum of each subarray to be as equal as possible ( total sum / k). Note for the sum of each subarray the smallest possible value is the maximum number in the original array, and the largest possible value is the total sum of the whole array. Therefore, we can get a mid value first, and then use this mid value to compute the number of subarrays we can get that have a sub sum of (total sum / k). If the number of subarrays is greater than k, we know the subarray can have greater sum than mid and we only to consider the second half; if the number of subarrays is less than k, the subarray should have smaller sum than mid and we only need to consider the first half.

Time Complexity: O(nlogn)
