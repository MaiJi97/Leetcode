## Method 1: Two Pointers 同向双指针

Similar as problem 56. Difference is that in 56 we need to compare each pair of adjacent intervals and check if there is intersection, but in this problem 
we only need to insert one interval into its correct position. There are three situations when we iterate through the intervals through one pointer: 1) if 
the interval to be inserted is at the back, then we do not need to do anything, just add the current interval to the list. 2) if the interval is already 
past, then do what we did in problem 56 when there is no intersection. Add the new interval to the list and update the newInterval pointer. Else if it is the
case we need to merge intervals, merge and update the newInterval.

Time Complexity: O(n)
