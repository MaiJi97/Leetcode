## Method 1: DFS / Divide and Conquer through recursion

The minimum depth of the binary tree can be obtained by 1 + the minimum depth of the remaining left tree or right tree.

Time Complexity: O(n) each node is visited once

## Method 2: BFS / Level Order Traverse through Queue

Another solution is by traversing the binary tree level by level, and add 1 to the result if there isn't a node on the level that is a tree leaf.

Time Complexity: O(n) 
