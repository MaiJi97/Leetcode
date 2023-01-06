## Method 1: Scanning Line 扫描线

This problem is an extension from problem 252 but still applies the same idea of scanning line. We can store the intervals as a list of timestamp array of two numbers: first number is the timestamp, second number represents if it is a start time or an end time (1 for start and -1 for end). Then iterate through the list and for each timestamp when there is a start or end, we modify the count tracker and update the result which will be the maximum count value. Note that when we define the comparator, we would want to compare the timestamp first, and if the two timestamps are the same we would put the 
start first and then end.

Time Complexity: O(nlogn)

## Method 2: Scanning Line 扫描线 by Priority Queue

Same as method 1 but use priority queue instead. We want the timestamp to be in order so priority queue can always be an option.

Time Complexity: O(nlogn)

## Method 3: Priority Queue 

Another method is to use priority queue directly. Elements in the queue represent rooms that are taken into use and are sorted by end time. Next we sort the intervals by start time. For each interval, if there is an idle room in the queue (end time is earlier than the start time of the current interval), 
we poll an element out and offer the end time of the current interval into the queue. Else just offer the end time of the current interval into the queue.
Final result will be the size of the queue.

Time Complexity: O(nlogn)
