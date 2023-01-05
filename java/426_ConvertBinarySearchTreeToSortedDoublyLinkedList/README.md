## Method 1: Iterative - Pointers

This problem can be converted to a binary search tree in order traversal through DFS (refer to problem 230). One way to traverse is by recursion, the other
way is non recursive through stack. As we do it through stack, we keep pushing nodes to the stack by traversing until we reach the leftmost node. Then start 
to pop elemenets out. This is where we manipulate the pointers to get the element connected in ascending order. (we know in order traversal of a BST is in
ascending order). Finally push the right nodes to the stack by traversing until we reach the right most node. </br>

Note that we cannot create a dummy node and link it with the current node, because we do not want a dummy node as a part of the solution and dummy.next may
cause issue as this is a doubly linked list. 

Time Complexity: O(n)

## Method 2: Recursion

Achieved by modifying the binary search tree in order traversal through DFS through recursion (refer to problem 230). Other modifications are same as in the 
first method non recursive way.

Time Complexity: O(n)
