## Method 1: Binary Search

This is related to problem 240, but combines it with binary search. To find the kth smallest element in the matrix, we can cut the elements in the matrix in half and call a helper method to get the number of elements that are smaller or equal to the mid value. In the helper method we integrate the idea we use in problem 74 - start from the upper right corner or the lower left corner and move along the diagnal. For example, if we start from the upper right corner, each time we increment the row value, we know the mid number we takes in is greater than another (col + 1) elements. 

Time Complexity: O(nlog(max-min))
