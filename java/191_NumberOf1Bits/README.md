## Method 1: Bit Manipulation

Using a mask and AND (&) operator to get each bit in a binary number. Mask is 1 first, then left shift to 10, then left shift again to 100, etc. It can be used to
distinguish the left most leading bit so far, as all other bits to the right of the leading 1 will be 0, therefore will be produce all 0 when AND with the input number.

Time Complexity: O(1)
