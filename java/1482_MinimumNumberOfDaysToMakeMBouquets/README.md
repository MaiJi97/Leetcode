## Method 1: Binary Search

Similar with Problem 410. Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like this through guessing 
the answer by calculation through mid value. Here we aim to pick m subarrays of length k from the array, and the maximum values among the subarrays should
be minimized. Note for the maximum values among the subarrays the smallest possible value is the minimum number in the original array, and the largest 
possible value is the maximum number in the array. Therefore, we can get a mid value first, and then use this mid value to compute the number of subarrays 
of length k we can get each of which has a maximum value of mid (also represents the number of bouquets we can get on day mid). If the number of subarrays 
is smaller than m, we know the subarrays need to have greater maximum value than mid and we only to consider the second half; if the number of subarrays is greater
than k, the subarrays should have smaller maximum value than mid and we only need to consider the first half.

Time Complexity: O(nlogn)
