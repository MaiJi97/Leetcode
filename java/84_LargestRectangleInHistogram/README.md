## Method 1: Two Pointers 同向双指针 - parallel pointers + Monotonic Stack

In this approach, we keep track of closest previous smaller height and closest next smaller height for each column (对于每个column来说向左右分别看到最近的smaller element. Then we iterate through each column, compute the sum of rectangle using the column as center, and update the maximum value.

Time Complexity: O(n)

## Method 2: Monotonic Stack Improved

We can use monotonic stack as we care about next greater element / next smaller element / previous greater element / previous smaller element. In this optimized approach, we always treat the current height as the local minimum (which is the height of the current resulting rectangle) and traverse to the previous as long as previous is greater than the current height. Keep executing the while loop as: the stack is not empty and the peek element is greater than the current element, compute the area and update the result.

Time Complexity: O(n)
