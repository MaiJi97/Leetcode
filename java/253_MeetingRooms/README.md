## Method 1: Two Pointers
We use two arrays to store the start times and end times both in ascending order. Then iterate through the start times using one pointer and set a second 
pointer at the beginning of the end times. For each start time, check the end time pointed by the second pointer and see if it is earlier than the current
start time. If it is, it means there is going to be a room released and to be reused before the current start time so we do not need an additional room 
for it. Though if the end time is later than the current start time, it means we need an additional room for the new meeting. Increment both the counter
and the second pointer.

Time Complexity: O(nlogn)

## Method 2: Priority Queue
Similar idea as using two arrays. Here we replace the array holding the ends times by a priority queue. If the peek element (earliest unchecked end time) 
is earlier than the current start time we pop one element out (the earliest unchecked end time) and add a new element (the current start time) in to the
queue. The overall number of element in the queue does not change since we can reuse the room to be released. Else it means we need an additional room 
for the new meeting, so we just add a new element into the queue.

Time Complexity: O(nlogn)
