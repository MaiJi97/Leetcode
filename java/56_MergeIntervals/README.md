## Method 1: Two Pointers 同向双指针

First sort the intervals by start time. Then use one pointer to iterate through the intervals and the other pointer to point at the previous interval. We need to check if the current interval has any intersection with the previous interval (start time of the current is smaller than the end time of the previous). Keep iterating until the pair of intervals have no intersection, then update the second pointer to be the previous interval.  If there is an intersection, we merge the current interval into the previous and there is no need to update the second pointer. 

<img width="558" alt="Screen Shot 2023-01-08 at 5 34 16 PM" src="https://user-images.githubusercontent.com/106039830/211224543-b64591c3-2de8-459b-b1d7-7a41028b5974.png">


Time Complexity: O(nlogn)
