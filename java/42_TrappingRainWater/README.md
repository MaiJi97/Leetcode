## Method 1: Two Pointers 同向双指针 - parallel pointers

This approach compute sum of water using each column as a unit. We keep track of a left maximum and right maximum for each column (对于每个column来说向左右分别看到的最高点）Then we iterate through each column and add trapped water at each column to the result.

Time Complexity: O(n)

## Method 2: Monotonic Stack

We can use monotonic stack as we care about next greater element / next smaller element / previous greater element / previous smaller element. But compare with the two pointers approach which compute sum of water using each column as a unit, now we want to trap water only when we go from low to high column (there is no need to trap water when we go from high to low column), and we compute sum of water layer by layer instead. 只有高度由低到高我们才需要计算储水，由高到低时不储水。Keep executing the while loop as: the stack is not empty and the peek element is smaller than the current element, trap the water corresponding to the height difference.

<img width="495" alt="Screen Shot 2023-06-15 at 3 14 06 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/ffda4faa-5ae7-45d5-acb0-5c48bbaa4dda.png">

Time Complexity: O(n)
