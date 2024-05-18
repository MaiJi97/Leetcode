## Method 1: DFS / Divide and Conquer

Base case is when the tree is null, then return node with value to be inserted. If not, call the method recursively on its subtrees and assign the result to the left and right children of current node.

Time Complexity: O(n)
