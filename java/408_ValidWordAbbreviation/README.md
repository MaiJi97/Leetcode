## Method 1: Two Pointers 同向双指针

Two pointers iterating through different arrays / strings. If both are characters and are equal, then increment both pointers. Else 
the pointer on the abbreviation string must point to a digit (if not, return false). For digit keep iterating and incrementing 
the abbreviation pointer until the end of the digit, convert it to integer and add it to the original string pointer.

While we store the current digits and convert it to integer, we can either use a string builder or use substring as follow:
<img width="545" alt="Screen Shot 2023-06-26 at 12 50 17 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d82c46df-f0b2-4a5f-848e-69da0e81799c.png">



Time Complexity: O(n)
