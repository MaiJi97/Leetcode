## Method 1: Scanning Line 扫描线

A brute force method is to scan every single time and track the maximum number of rooms we need at each time, though the complexity can be large. Instead we can scan only the time when a start or end takes place. Store the intervals as a list of timestamp array of two numbers: first number is the timestamp, second number represents if it is a start time or an end time (1 for start and -1 for end). Then iterate through the list and for each timestamp when there is a start or end, we modify the count tracker and update the result which will be the maximum count value. Note that when we define the comparator, we would want to compare the timestamp first, and if the two timestamps are the same we would put the 
start first and then end.

Time Complexity: O(nlogn)


## Method 2: Scanning Line 扫描线 by Priority Queue

Same as method 1 but use priority queue instead. We want the timestamp to be in order so priority queue can always be an option.

Time Complexity: O(nlogn)

## Method 3: Priority Queue 

Similar idea as using two arrays. Here we replace the array holding the ends times by a priority queue. If the peek element (earliest unchecked end time) 
is earlier than the current start time we pop one element out (the earliest unchecked end time) and add a new element (the current start time) in to the
queue. The overall number of element in the queue does not change since we can reuse the room to be released. Else it means we need an additional room 
for the new meeting, so we just add a new element into the queue.

Time Complexity: O(nlogn)

## Method 4: Two Pointers

The difficult point is that we may reuse the room if any of them become idle. We can use two arrays to store the start times and end times both in ascending order. Then iterate through the start times using one pointer and set a second pointer at the beginning of the end times. For each start time, check the end time pointed by the second pointer and see if it is earlier than the current start time. If it is, it means there is going to be a room released and to be reused before the current start time so we do not need an additional room for it. If the end time is later than the current start time, it means we need an additional room for the new meeting. Increment both the counter and the second pointer.

<img width="795" alt="Screen Shot 2023-01-06 at 6 25 45 PM" src="https://user-images.githubusercontent.com/106039830/211121648-0def9509-8240-4708-9da6-0f6c2f08a542.png">


Time Complexity: O(nlogn)

