## Method 1: Two Pointers 同向双指针 - sliding window

First sort the intervals by start time. Then use one pointer to iterate through the intervals and the other pointer to point at the previous interval. We need to check if the current interval has any intersection with the previous interval (start time of the current is smaller than the end time of the previous). Keep iterating until the pair of intervals have no intersection, then update the previous interval to be the current interval.  If there is an intersection, we merge the current interval into the previous and there is no need to update the previous interbval pointer. 

<img width="575" alt="Screen Shot 2023-08-27 at 8 41 36 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/3f9853fc-0d72-4f07-9e5d-275def09bb4d.png">


Time Complexity: O(nlogn)

