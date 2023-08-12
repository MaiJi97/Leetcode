## Method 1: Two Pointers 相向双指针

Similar as the 3Sum question, we use a for loop and two pointers to go through the array and increment / decrement the two pointers to
get sum and compare with a target value. Difference is that we want total number of combination whose sum is less than the target, so 
as we find the left and right pointer that satisfy the condition, add (right - left) to the result.

The solution does not take into acount duplicates either. 

Time Complexity: O(n^2)
