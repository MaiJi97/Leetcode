## Method 1: Two Pointers 同向双指针 - fast & slow

Similar as problem 56. Difference is that in 56 we need to compare each pair of adjacent intervals and check if there is intersection, but in this problem we only need to insert one interval into its correct position. There are three situations when we iterate through the intervals through one pointer: 1) if the interval to be inserted is at the back, then we do not need to do anything, just add the current interval to the list. 2) if the interval is already past, then do what we did in problem 56 as if there is no intersection. Add the current interval to the list and update the newInterval pointer. Why not just add the current interval directly? Because that will mess up the order and the merged interval will be added at the end instead at the correct position (遍历过去需要merge的部分但还没有将newInterval加入list，one step behind). 3) if it is the case we need to merge intervals, merge and update the newInterval.

<img width="545" alt="Screen Shot 2023-01-09 at 12 10 20 AM" src="https://user-images.githubusercontent.com/106039830/211249509-8fdf91fb-8b0c-4c43-817b-ba1636cb051c.png">

Time Complexity: O(n)
