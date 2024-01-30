## Method 1: DFS / Divide and Conquer through recursion

Consider different cases: if both nodes' values are smaller than the current node's value, then we call the method recursively on the
left child of the current node; if both nodes' values are greater than the current nodes's value, then we call the method recursively
on the right child of the current node; else (if one is smaller, the other one is greater, or when one of the node has equal value 
with the current node), current node is the lowest common ancester.

Since given that the tree is a BST, we can make use of the properties of a BST to make prediction regarding the position of p and q in the tree and determine the lowest common ancester.

Time Complexity: O(n)
