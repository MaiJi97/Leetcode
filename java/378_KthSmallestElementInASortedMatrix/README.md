## Method 1: Binary Search

To find the kth smallest element in the matrix, we can cut the elements in the matrix in half and call a helper method to get the number of elements that are smaller or equal to the mid value. In the helper method we integrate the idea we use in problem 74 - start from the upper right corner or the lower left corner and move along the diagnal. For example, if we start from the upper right corner, each time we increment the row value, we know the mid number we takes in is greater than another (col + 1) elements. 

Why can't we use same idea of problem 74 in the main body of the method? Because kth smallest element does not work as the idea of "kth smallest" in common sense. Instead it is the kth element of an array after the array is sorted. Approach for problem 74 requires moving left or down to get a smaller / greater value, which could lead to over-move (eg: number of equal or smaller is 10 which is greater than k = 8, so we move left and number of equal or smaller might become 7 which is too small).

Time Complexity: O(nlog(max-min))
