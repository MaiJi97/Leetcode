## Method 1: Binary Search

Since the problem needs to be solved without modifying the original array, and using constant space, so we cannot sort the array / use hashset to find the duplicate. Since there the n+1 numbers are in range [1, n] with only one duplicate, we can use binary search to determine if the duplicate is in the first
half range from 1 to n/2 or from n/2 to n.

Eg: 1, 3, 4, 2, 2</br>
mid = 0 + (4-0)/2 = 2 so there should be 2 elements smaller or equal to 2, and other elements greater than 2. </br>
If we iterate through the array and find 3 elements smaller than or equal to 2, then we know that the duplicate must be smaller than or equal to mid 2, so we can cut off the second half of the elements and find the duplicate only in the elements that are smaller than or equal to mid, that is [left, mid-1]. [mid+1, right] otherwise.

Time Complexity: O(nlogn)
