## Method 1: Two Pointers 同向双指针

Sliding window - compare with the traditional sliding window approach (slide the right pointer until condition no longer satisfies, and slide the left pointer until condition satisfies again, or vice versa), there are two things we need to note here:

1) Instead of looking for the longest substring, we are looking for number of substrings, so instead of ret = Math.max(ret, i - j + 1), we add i - j + 1 to the result.
   
2) Instead of at most k distinct elements, the problem specifies the requirement to be exact k distinct elements, which can be computed through atMostK(nums, k) - atMostK(nums, k-1)

Time Complexity: O(n)
