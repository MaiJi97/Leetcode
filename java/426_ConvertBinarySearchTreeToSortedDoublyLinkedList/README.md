## Method 1: Iterative - Pointers

参考binary tree inorder traversal using stack. 

Note:
1) One way is to create a dummy node so we can generalize the implementation within the while loop. Use the dummy node as prev pointer.
2) However, in this problem, we have to link the last node to the first and we do not want a dummy node as a part of the solution. So it's better not to create the dummy node. Instead, we can split into cases (when current is the first node & when current is a later node). Also we need a first node as the node we return in the result as root node is no longer the first node in the result linked list.

One way to traverse is by recursion, the other way is non recursive through stack. As we do it through stack, we keep pushing nodes to the stack by traversing until we reach the leftmost node. Then start to pop elemenets out. This is where we manipulate the pointers to get the element connected in ascending order. (we know in order traversal of a BST is in ascending order). Finally push the right nodes to the stack by traversing until we reach the right most node. </br>

Time Complexity: O(n)

## Method 2: Recursion

Achieved by modifying the binary search tree in order traversal through DFS through recursion (refer to problem 230). Other modifications are same as in the 
first method non recursive way.

Time Complexity: O(n)
