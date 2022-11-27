## Method 1: Two Pointers 同向双指针

Sliding window - One pointer iterate through each tuple and the other pointer to point at the current chunk. We need to check if the current tuple has 
any intersection with the current chunk (start time of the current tuple is smaller than the end time of the current chunk). If there is intersection, 
then we merge the current tuple into the chunk and update the end time to be the later one among the two. If there is no intersection, we update the current
chunk to the current tuple.

Time Complexity: O(nlogn)
