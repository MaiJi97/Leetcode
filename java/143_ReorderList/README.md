## Method 1: Iterative - Pointers

First, we would like to find the midpoint of the linked list and cut it into two halfs. Next, we reverse the second half of the list. Then, we reorder the two linked list by using pointers to loop through both list, one element from l1, followed by one element from l2, then another element from l1 again, etc.

Time Complexity: O(n)
