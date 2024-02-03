## Method 1: Two Pointers 同向双指针 - sliding window

First sort the intervals by start time. Then we use one pointer to iterate through the intervals and the other pointer to keep track of previous interval. If the current interval's end is smaller than the previous interval's end, we won't count current interval into the result. Else, we know that the current interval's end is greater than the previous interval's end, or there is no intersection at all, then count the current interval into the result and update the previous interval. 

Though there might be a issue: What if the two intervals have the same start time? We want to make sure the one with later end time is on the top, else we are keeping both which is not desirable. That is why we need to sort the intervals by end time in descending order if they have the same start.

<img width="582" alt="Screen Shot 2023-08-27 at 8 59 09 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/3c8af6c2-f496-4240-946e-27411ff9b416.png">

Time Complexity: O(nlogn)
