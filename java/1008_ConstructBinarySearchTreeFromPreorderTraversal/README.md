## Method 1: DFS / Divide and Conquer through recursion

Similar as problem 105, but now we only have a preorder array but not an inorder array, so there's no way to determine which part is for left subtree which part is for right subtree
as in problem 105. Instead since it is a binary search tree, we can treat the current number as a boundary, then recursively build the tree using the boundaries as constraint.

Time Complexity: O(n)
