## Method 1: Two Pointers 同向双指针 - sliding window
One pointer i to loop through the array, and the other pointer j to locate the start index of the sliding window / subarray. While the sum is the greater or equal to the target, we keep incrementing pointer j until the greater or equal condition no longer satisfies, and update the counter / ret to get the minimum value.

Note: compare with at most系列 - at most is to slide right pointer until condition no longer satisfies, then slide left pointer until condition satisfies again, so condition is always satisfied outside the while loop which is where we update the result. Though in this problem, we slide the right pointer until condition no longer satisfies, then slide left pointer until condition satifies again, so condition is always satisfied within the while loop which is where we update the result.

Time Complexity: O(n) - each element can be visited at most once, once by the i pointer and once by the j pointer

## Method 2: Binary Search + Prefix Sum
Prefix sum must be in ascending order, so we can combine it with binary search to solve the problem. The prefix sum array stores the sum of all the elements up to the point before the element, that is, prefixSum[i] stores the sum of the first i elements. And we know for a subarray from ith element to jth element with sum equal to target, we have prefixSum[j-1] - prefixSum[i-1] = target.

Time Complexity: O(nlogn)


