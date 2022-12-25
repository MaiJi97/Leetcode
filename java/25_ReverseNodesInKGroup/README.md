## Method 1: Iterative - Pointers

This is an extension of problem 92 Reverse Linked List II. We can count how many times we need to reverse the k length linked list, and call the method
written in problem 92 to do the operation.

Time Complexity: O(n)

## Method 2: Recursion

To use recursion, we can reverse the first k length linked list and then link it with the rest of the linked list (we bypass the first k nodes and call
the method on the rest of the linked list). It is similar as in problem 92 but here we assume we only reverse the first k nodes instead of the nodes 
between a specific interval. So we do not need to link the beforeStart node with the end node, just need to link the start node (head) with the afterEnd node and return the end node.

Time Complexity: O(n)
