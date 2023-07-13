## Method 1: Two Pointers 同向双指针

Parallel pointers - a pointer for each of the input string, if the first character of the two strings equal, then proceed with the rest
of the characters until we reach the end of the needle string. Break if there is an inequal character and continue with the next 
character of the main string.

Time Complexity: O(n)

## Method 2: Improved Pointer Approach

Similar as method 1, but we can make use of the substring() approach so we don't need to use two pointers to traverse both strings and
compare.

Time Complexity: O(n)

