## Method 1: Two Pointers 同向双指针

Sliding window - compare with the traditional sliding window approach (slide the right pointer until condition no longer satisfies, and slide the left pointer until condition satisfies again, or vice versa), there are two things we need to note here:

1) Instead of looking for the longest substring, we are looking for number of substrings, so instead of ret = Math.max(ret, i - j + 1), we add i - j + 1 to the result. Sometimes in order to count total number of subarrays, we can also use hashmap to record the number of occurrence of certain condition.
   
2) The sliding window approach typically deals with at most condition, here we also have to convert exact k to at most k, as exact k = atMostK(nums, k) - atMostK(nums, k-1). Why can't we compute exact k directly? Because sliding window approach slides the right pointer until the extreme limit and then starts to slide the left pointer. By following exact k we stop sliding the right pointer as soon as we have exact k without continueing slidng until the extreme. At most -> 将右指针滑至极限，不然还需要手动再将右指针从k的开始滑到最后出去再滑回来。

Time Complexity: O(n)
