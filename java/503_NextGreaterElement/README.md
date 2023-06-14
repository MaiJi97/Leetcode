## Method 1: Brute Force

Similar as problem 496, but in problem 496 we first locate the element and then iterate until the end of the array to look for next
greater element. Though in this problem we iterate until we traverse through all the elements in the array instead of stopping at the
end of the array. 

Time Complexity: O(n^2)

## Method 2: Monotic Stack

Similar as problem 496, but we iterate through the cycle two times as the array is circular.

Time Complexity: O(n)
