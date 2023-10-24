## Method 1: DFS / Divide and Conquer through recursion

A traditional DFS approach. Write a helper method that takes in extra parameter, which is the current sum we have so far, and call
the method recursively on the left child and right child if the current node is not the end of the path. The helper method have the
same return type as the main method which is the sum of numbers from all paths.

Time Complexity: O(n)

# Method 2: BFS / Level Order Traverse through Queue

Another solution is by traversing the binary tree using a queue. What being stored on the queue should not only contain the tree node
but also the current sum up to the current node. So as we reach the end of a path (when both left child and right child become null),
we can add the current sum to the final result.

Time Complexity: O(n)
