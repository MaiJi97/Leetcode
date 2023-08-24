## Method 1: Two Pointers 同向双指针 - fast & slow

First sort the intervals by start time. Then we use one pointer to iterate through the intervals and the other pointer to keep track of previous interval. If the current interval's end is smaller than the previous interval's end, we won't count current interval into the result. If the current interval's end is greater than the previous interval's end, then count the current interval into the result and update the previous interval. 

Though there might be a issue: we are making it firm that the previous interval is counted and we are only determining the current interval's fate. What if the two intervals have the same start but the current interval has greater end? The solution is to sort the intervals by end in descending order if they have the same start.

<img width="873" alt="Screen Shot 2023-01-09 at 2 38 55 PM" src="https://user-images.githubusercontent.com/106039830/211403599-f840c6c6-85a9-4123-abfe-214aaa1512f6.png">

Time Complexity: O(nlogn)
