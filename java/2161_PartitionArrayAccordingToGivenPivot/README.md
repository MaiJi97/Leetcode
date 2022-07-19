## Method 1: Two Pointers 同向双指针
One pointer to loop through the array, the other one to track the current position of the newly created array ret. We loop through the original array three times, first to add numbers that are smaller than the pivot to the returned array, then add numbers equal to the pivot, and last add numbers that are larger than the pivot, incrementing the j pointer each time we add a number.

Time Complexity: O(n)
