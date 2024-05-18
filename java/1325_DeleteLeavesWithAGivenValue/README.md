## Method 1: DFS / Divide and Conquer

Base case is when the tree is null, then return it. If not, call the method recursively on its subtrees to delete target nodes from the subtrees and assign the result to the left and right children of current node. Note that this is an example we do the recursive call after the recursive calls.

Time Complexity: O(n)
