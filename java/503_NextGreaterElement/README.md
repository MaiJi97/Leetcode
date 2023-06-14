## Method 1: Brute Force

Similar as problem 496, but in problem 496 we first locate the element and then iterate until the end of the array to look for next
greater element. Though in this problem we iterate until we traverse through all the elements in the array instead of stopping at the
end of the array. 

Time Complexity: O(n^2)

## Method 2: Monotonic Stack

Similar as problem 496, but in this problem we need to loop through the array one additional time, as after the first iteration we can 
only guarantee to find the next greater element for the first element in the array, while the next greater elements for the rest of the
elements can only be decided after the second iteration.

Time Complexity: O(n)
