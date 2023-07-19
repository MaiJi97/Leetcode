## Method 1: Two Pointers 同向双指针 - parallel pointers

We can solve the problem by keeping two arrays => a left array such that left[i] records the product of all elements on the left side
of element at index i, and right[i] records the product of all elements on the right side of element at index i. Then we can loop through 
the orginal array and the product except self is the product of left[i] * right[i].

Note that the problem takes similar approach as problem 42 trapping rain water.

Time Complexity: O(n)

