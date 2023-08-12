## Method 1: Two Pointers - parallel pointers

Simply set a pointer for each of the string, and then iterate. If the characters pointing by the two pointers are equal, then increment
both pointers, else increment only the source string's pointer to look for the character that is equal to the other.

Time Complexity: O(max(m, n))

## Method 2: Dynamic Programming

Similar to problem 1143 longest common subsequence.

Time Complexity: O(m * n)
