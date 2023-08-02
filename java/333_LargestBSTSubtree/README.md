## Method 1: DFS / Divide and Conquer

A brute force method is to traverse through each node of the tree and check if the subtree rooted form the current node is a BST or not 
(validate BST). If it is, then call another method which counts the number of nodes in a tree to return the final result. 

We can optimize the solution. In the brute force solution, In the previous approaches, we traversed the tree from root to leaf. This 
resulted in us checking some of the same subtrees multiple times because a smaller subtree can be a part of many larger subtrees. By 
traversing each tree's children first, we can pass information about subtrees up to the parent. This information can be used by the 
parent to determine if the parent node is a BST in constant time. A left subtree needs to tell its parent whether it is BST and the 
maximum value in it. This allows us to compare the maximum value with the parent’s data to check the BST property. Similarly, the right 
subtree needs to tell its parent whether it is BST and the minimum value it contains.

We can create a separate data structure for each node, which includes information about the subtree rooted at the current node: the 
minimum value in the subtree, the maximum value in the subtree, and the size of the subtree. In the recursive case, we check if the 
subtree rooted from current node is a BST and update the corresponding information.

Time Complexity: O(n)

