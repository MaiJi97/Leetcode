## Method 1: BFS / Matrix Traverse through Queue

The problem can be done through breath first search. There two points to note: 1) A good use of the direction array, which represent the step we take 
vertically and horizontally. 2) When we add neighbors of the current node to the queue, we consider the place we will stop at when going in the four directions until hitting the wall. Not the four adjacent blocks. If the block is not visited yet, add it to the queue. 3) The ball will keep going until it hits the wall or the boundary. As we break out of the while loop the conditions in the while loop (that the ball will keep going) no longer satisfy. So we need to take one step back to continue traversing.

Time Complexity: O(mn)

## Method 2: DFS / Matrix Traverse through recursion

DFS traverse through recursion. Break the recursion when we reach the end point (return true) or when all the block has been visited (return false). Else we call the method on its neighbors and recursively find if there is a path from the start to the end point. What are the neighbors? They are the blocks that we will reach if keep going until hitting the wall or encounter a '1'.

Note: can also use the direction array here.

Time Complexity: O(mn)
