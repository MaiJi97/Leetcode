## Method 1: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. When we add neighbors of the current province to the queue. What are the neighbors? They are the neighbors we find through the isConnected matrix and have not been visited. If the neighbor satisfies the conditions, add it to the queue and mark it as visited.

Time Complexity: O(n^2)

## Method 2: DFS / Matrix Traverse through recursion

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the current province. Call the method recursively on current province's neighbors. What are the neighbors? They are the neighbors we find through the isConnected matrix and have not been visited.

Time Complexity: O(n^2)

