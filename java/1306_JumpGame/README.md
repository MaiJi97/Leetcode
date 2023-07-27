## Method 1: BFS / Traverse through Queue

Similar as DFS, but traverse the connected index through a queue. Each time we add neighbors of the current index to the queue.
What are the neighbors? They are the left and right index we can reach from the current index.

Time Complexity: O(n)

## Method 2: DFS / Matrix Traverse through recursion

This problem can be converted to a graph problem. Start with the start index and traverse until we reach the index of value 0. Here is 
DFS approach through recursion. We have a helper method that takes in additional information regarding the current state, ie: the current
index. Break the recursion when the value of the current index is 0. Else we call the method recursively on its neighbors to keep finding
index we can reach. What are the neighbors? They are the left and right index we can reach from the current index.

Time Complexity: O(n)

