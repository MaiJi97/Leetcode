## Method 1: Bit Manipulation

How to get each bit in a binary number? Shift it to the rightmost bit and mask it with a 1 through AND (&) operator. At the same time,
as we want the bits in reverse order, we get digit of the original binary number from right to left, and then compose the reverse 
version from right to left, through shifting the result one bit to the left, and use OR (|) operator with the 0 on the left of the 
current result bit.

Time Complexity: O(1)
