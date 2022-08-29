## Method 1: Iterative - Pointers

This is similar to the appraoch we take in problem 2161, but it's slightly more complicated to operate on a linked list compare with an array. To partition the list, we can iterate through the list and split it into smaller/equal to & greater by comparing the value with the given pivot. Then, we just change the pointers to link the two parts together. In this problem, we create dummy nodes because it would be easier to construct a new linked list to be returned than to operate on the original one (pointers will mess up). </br>

Time Complexity: O(n)
