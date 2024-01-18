## Method 1: Brute Force

Iterate twice and connect the nodes.

Time Complexity: O(n) but space complexity is O(n)

## Method 1: Iterative - Two Pointers

We can do this in space complexity of O(1). To partition the list, we can iterate through the list and split it into smaller/equal to & greater by comparing the value with the given pivot. Then, we just change the pointers to link the two parts together. In this problem, we create dummy nodes because it would be easier to construct a new linked list to be returned than to operate on the original one (pointers will mess up). </br>

Time Complexity: O(n)
