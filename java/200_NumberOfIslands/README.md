## Method 1: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Note that: 1) We can either use a customized inner class here to include information about x axis and y axis of the current cell, or use direction array such as deltaX and deltaY, which represent the steps we take vertically and horizontally. 2) When we add neighbors of the current block to the queue. What are the neighbors? They are the four blocks that adjacent to / directly connected with the current block in the four direction and is not 0 / have not been visited / have not reached the border of the matrix. If it satisfies the conditions, add the neighbor to the queue and mark it as visited.

Time Complexity: O(m * n) 

## Method 2: DFS / Matrix Traverse through recursion

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the x and y axis of the current block. In the main method we iterate through each block of the matrix and find connected blocks as an island. In the helper method, break the recursion when the block is 0 / all the blocks have been visited / we reach the border of the matrix and then add 1 to the final result because we've found another island. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent blocks that is not 0 / have not been visited / have not reached the border of the matrix. 

Time Complexity: O(m * n) 

