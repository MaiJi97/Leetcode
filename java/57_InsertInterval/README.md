## Method 1: Two Pointers 同向双指针

Similar as problem 56. Difference is that in 56 we need to compare each pair of adjacent intervals and check if there is intersection, but in this problem 
we only need to insert one interval into its correct position. There are three situations when we iterate through the intervals through one pointer: 1) if 
the interval to be inserted is at the back, then we do not need to do anything, just add the current interval to the list. 2) if the interval is already 
past, then do what we did in problem 56 as if there is no intersection. Add the current interval to the list and update the newInterval pointer. Why not
just add the current interval directly? Because that will mess up the order and the merged interval will be added at the end instead at the correct position. 3) if it is the case we need to merge intervals, merge and update the newInterval.

First case: add current
----- current
           ----- toBeInserted

Second case: add toBeInserted, update toBeInserted to be current 
----- toBeInserted
           ----- current

Third case: merge the two intervals, no need to update toBeInserted
----- toBeInserted
  ----- current
or 
----- current
  ----- toBeInserted

Time Complexity: O(n)
