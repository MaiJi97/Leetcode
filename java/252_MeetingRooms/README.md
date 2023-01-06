## Method 1: Two Pointers 同向双指针

Sort the intervals array by its start time and then this is similar to a sliding window problem (refers to problem 56 merge intervals). One pointer to 
iterate through the sorted array until it satisfies certain condition (there is an intersection). In this problem we can just return false if this is the
case and do not need to use the other pointer. We might also need a variable to track the latest end time (may be?)

Time Complexity: O(nlogn)
