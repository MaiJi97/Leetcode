## Method 1: Two Pointers 同向双指针

Two pointers iterating through different arrays / strings. If both are characters and are equal, then increment both pointers. Else 
the pointer on the abbreviation string must point to a digit (if not, return false). For digit keep iterating and incrementing 
the abbreviation pointer until the end of the digit, convert it to integer and add it to the original string pointer.

Time Complexity: O(n)
