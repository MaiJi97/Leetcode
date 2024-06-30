## Method 1: 升级版 Merge Interval + Priority Queue + Two Pointers

This problem is similar as problem 56 merge interval, the difference is that 1) there are a number of intervals instead of two arrays of intervals. 2) 
we want the common unintersected section instead of the full chunks of intervals. 

Since there are multiple lists of intervals, a brute force method is to compute and update the merged intersections a pair at a time. But there is an optimized solution, by using a priority queue to store all the intervals, sorted by their start time. Then poll one interval each time and use the two pointers approach to check if there is intersection, just as how we loop through the interval arrays in the merge interval problem.

Time Complexity: O(nlogn)
