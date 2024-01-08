## Method 1: Iterative - Pointers

We create a dummy node at the beginning of the list in this problem in case the first element is the element we want to remove, since if we are already at the current node which is a node to be removed, it is too late to remove it from the list. Then we simply use a current pointer to iterate through the list and skip the element if it is the one we want to remove. </br>

Time Complexity:O(n)

## Method 2: Recursion

Time Complexity:O(n)
