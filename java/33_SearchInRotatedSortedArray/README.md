## Method 1: Find Pivot + Binary Search

First want to find the pivot，which is the starting point of the rotated sorted array (smallest number in the array). To find minimum value in rotated array, use template 2 of binary search, but the initial right boundary value is set to nums.length - 1 instead of nums.length, as we will use it later in the body part and it's not good to always write as right - 1. After we find the pivot, reset the two pointers of the sorted array in order to carry out a normal binary search. To do this, we can compare the target number with the pivot to determine if we are going to do the binary search in the part before the pivot or after the pivot and then update the boundary. Since the boundary will include pivot iteself, we have to do the binary search using template 3. </br>

Time Complexity: O(logn)

## Method 2: Binary Search

Do the binary search direcly. Additional conditional statements because compare with traditional binary search template, we need to first determine the shape of the array and then 
distinguish the position of the target within the array.

Time Complexity: O(logn)
