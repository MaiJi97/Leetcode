## Method 1: Binary Search

Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like this through guessing the answer by calculation through mid value. As we aim to minimize the largest sum of the k subarrays, we want the sum of each subarray to be as equal as possible ( total sum / k). Note for the sum of each subarray the smallest possible value is the maximum number in the original array, and the largest possible value is the total sum of the whole array. Therefore, we can get a mid value first, and then use this mid value to compute the number of subarrays we can get that have a sub sum of (total sum / k). If the number of subarrays is greater than k, we know the subarray can have greater sum than mid and we only to consider the second half; if the number of subarrays is less than k, the subarray should have smaller sum than mid and we only need to consider the first half.

Since we have a specific target (compare computed count with k), we can use template 3. However, why not take case of equal as a separate case and return directly as in traditional binary search template 3? Because count does not necessarily need to be equal to k. We can put the case of equal together with case that computed count is less than k and continue to look for an optimized result until the while loop breaks.

Time Complexity: O(nlogn)
