## Method 1: DFS / Divide and Conquer through recursion

The minimum depth of the binary tree can be obtained by 1 + the minimum depth of the remaining left tree or right tree.

Compare with maximum depth of binary tree, we add two additional base cases. The reason is that in maximum depth of binary tree, we are using Math.max() in the recursive case, while here we are using Math.min(), so if either left child or right child is null it will return 0 directly, which is not desirable (it has to be a complete path). Therefore, 
we add two bases separately to deal with left child or right child being null.

Time Complexity: O(n) each node is visited once

## Method 2: BFS / Level Order Traverse through Queue

Another solution is by traversing the binary tree level by level, and add 1 to the result if there isn't a node on the level that is a tree leaf.

Time Complexity: O(n) 
