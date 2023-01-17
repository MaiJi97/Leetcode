## Method 1: DFS / Matrix Traverse through recursion

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state. Break the recursion when the block is 0 / all the blocks have been visited / we reach the border of the matrix and then add 1 to the result. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent blocks that is not 0 / have not been visited / have not reached the border of the matrix. 

Time Complexity: O(mn) 

## Method 2: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Similar as DFS but there two points to note: 1) We use a customized inner class here to include information of x axis and y axis of the current block, but can also be done through a direction array, which represent the step we take vertically and horizontally. 2) When we add neighbors of the current block to the queue. What are the neighbors? They are the four blocks that adjacent to / directly connected with the current block in the four direction and is not 0 / have not been visited / have not reached the border of the matrix. If it satisfies the conditions, add it to the queue and mark it as visited.

Time Complexity: O(mn) 
