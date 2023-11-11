## Method 1: Two Pointers 同向双指针 - fast & slow

Similar to problem 26, but will need to use a counter to count number of times a number repeat and add an additional case. Even when the element pointed by i is the same as the element pointed by j, as long as counter is less than two, we still increment j and assign value at i to the position at j.

Time Complexity: O(n)
