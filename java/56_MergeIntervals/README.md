## Method 1: Two Pointers 同向双指针 - fast & slow

First sort the intervals by start time. Then use one pointer to iterate through the intervals and the other pointer to point at the previous interval. We need to check if the current interval has any intersection with the previous interval (start time of the current is smaller than the end time of the previous). Keep iterating until the pair of intervals have no intersection, then update the previous interval to be the current interval.  If there is an intersection, we merge the current interval into the previous and there is no need to update the previous interbval pointer. 

<img width="712" alt="Screen Shot 2023-01-09 at 12 05 09 AM" src="https://user-images.githubusercontent.com/106039830/211249004-d8ce144b-b2f4-4635-bbf1-c785a06b8392.png">



Time Complexity: O(nlogn)

