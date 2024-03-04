## Method 1: Binary Search 

Similar as problem 852, but the array is not sorted and could have multiple local peaks. We can only use template 2 here, since we do not have a specific target to look for.

Note that there cannot be continuous same element, like {1, 4, 4, 2, 2, 5, 3}.

If there are continuous same element as above, the definition for peak must be changed from "strictly greater than its neighbors" to "greater or equal to its neighbors", and the if condition must be changed from nums[mid] < nums[mid + 1] to nums[mid] < nums[mid + 1].

有连续相同element => 必须换neighbor的定义

Time Complexity: O(n)
