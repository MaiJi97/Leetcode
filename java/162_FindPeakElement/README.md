## Method 1: Binary Search 

Similar as problem 852, but the array is not sorted and could have multiple local peaks. We can only use template 2 here, since we do not have a specific target to look for.

If the definition for peak is changed from "strictly greater than its neighbors" to "greater or equal to its neighbors", simply change the if condition to nums[mid] <= nums[mid + 1]. (<= instead of <)

Time Complexity: O(n)
