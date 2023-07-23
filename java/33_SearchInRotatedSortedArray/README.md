## Method 1: Find Pivot + Binary Search

First we use template 2 of binary search to find the pivot，which is the starting point of the rotated sorted array (smallest number in the array). Then reset the two pointers of the sorted array in order to carry out a normal binary search. To do this, we can compare the target number with the pivot to determine if we are going to do the binary search in the part before the pivot or after the pivot and then update the boundary. Since the boundary will include pivot iteself, we have to do the binary search using template 3. </br>

Time Complexity: O(logn)

## Method 2: Binary Search

Do the binary search direcly.

Time Complexity: O(logn)
