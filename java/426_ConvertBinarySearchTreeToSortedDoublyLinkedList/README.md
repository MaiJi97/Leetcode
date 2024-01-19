## Method 1: Iterative - Pointers

参考binary tree inorder traversal using stack. 

Two ways:
1) Create a dummy node so we can generalize implementation within the while loop. Use the dummy node as prev pointer.
2) No dummy node, but create a first & prev node. Split into cases.

Note that it's better not to create a dummy node and link it with the current node in this problem, as we have to link the last node to the first and we do not want a dummy node as a part of the solution.

One way to traverse is by recursion, the other way is non recursive through stack. As we do it through stack, we keep pushing nodes to the stack by traversing until we reach the leftmost node. Then start to pop elemenets out. This is where we manipulate the pointers to get the element connected in ascending order. (we know in order traversal of a BST is in ascending order). Finally push the right nodes to the stack by traversing until we reach the right most node. </br>

Time Complexity: O(n)

## Method 2: Recursion

Achieved by modifying the binary search tree in order traversal through DFS through recursion (refer to problem 230). Other modifications are same as in the 
first method non recursive way.

Time Complexity: O(n)
