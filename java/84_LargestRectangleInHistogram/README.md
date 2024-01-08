## Method 1: Two Pointers 同向双指针 - parallel pointers + Monotonic Stack

We can use monotonic stack as we care about next greater element / next smaller element / previous greater element / previous smaller element. In this approach, we keep track of closest previous index and later index up to which the corresponsing heights start to be less than the current height for each column (对于每个column来说向左右分别看到的维持和自己一样或比自己高的index. Then we iterate through each column, compute the sum of rectangle using the current column as height, and update the maximum value. 一个是递增栈一个是递减栈。

Time Complexity: O(n)

## Method 2: Monotonic Stack Improved

We can optimize the previous method. We always treat the current height as the local minimum (which is the height of the current resulting rectangle) and traverse to the previous as long as previous is greater than the current height. 递增栈，且只有前面的比当前的大时才需要重新计算面积。Keep executing the while loop as: the stack is not empty and the peek element is greater than the current element, compute the area and update the result.

Time Complexity: O(n)
