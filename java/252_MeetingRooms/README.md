## Method 1: Comparator

Sort the intervals array by its start time and see if there is a intersection between each pair of consecutive intervals. If there is then return false.
Key point for this problem is to define the comparator when sorting the array.

Time Complexity: O(nlogn)
