## Method 1: Iterative - Pointers

Two passes of a for loop. First time loop through the list and use a hashmap to record number of occurrences of all the values in the list. Second time loop through again and bypass the node if it appears more than once. To deal with the case that the first node is a one we want to remove, we create dummy node. To bypass, can either check current.next and set current's pointer to current.next.next, or can set a prev pointer, check current and set prev pointer pointing to current.next to bypass the node we want to remove.

Time Complexity: O(n)
