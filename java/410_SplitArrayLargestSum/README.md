## Method 1: Binary Search

Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like this through guessing the answer. As we aim to minimize the largest sum of the k subarrays, we want the sum of each subarray to be as equal as possible ( total sum / k). Therefore, we can use a binary search and investigate each time if we are able to achieve the task of splitting the array into k subarrays, each has a sub sum of (total sum / k). Note that largest possible sub sum is the total sum, smallest possible sub sum is the maximum number in the original array.

Time Complexity: O(nlogn)
