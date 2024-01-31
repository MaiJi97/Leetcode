## Method 1: Iterative - Pointers

参考binary tree inorder traversal using stack.

One way to traverse is by recursion, the other way is non recursive through stack. As we do it through stack, we push the root node to the stack before the iteration. While the stack is not empty, we keep popping node from the stack as the current node, and link it with the previous node. No need for dummy node, and no need for first node as it is preorder so the root node is always the first node.

Time Complexity: O(n)

## Method 2: Recursion 

DFS preorder traverse, and link the node all the way to the right. </br>

We call the method itself on both its left subtree and right subtree, and link the subtrees as root -> flattened left tree -> flattened right tree. </br>

<img width="211" alt="Screen Shot 2022-06-12 at 5 18 58 PM" src="https://user-images.githubusercontent.com/106039830/173254027-9a45ac20-7fda-4707-bb46-0132f7d23b24.png">

Time Complexity: O(n)
