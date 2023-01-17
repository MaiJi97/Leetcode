## Method 1: BFS / Matrix Traverse through Queue

The problem can be done through breath first search. There two points to note: 1) A good use of the direction array, which represent the step we take 
vertically and horizontally. 2) When we add neighbors of the current node to the queue. What are the neighbors? Not the four adjacent blocks. Here we consider the place we will stop at when going in the four directions until hitting the wall. If the block is not visited yet, add it to the queue and mark it as visited. We need to make sure the block is not visited repeatedly or else the ball might go into an infinite loop. 3) The ball will keep going until it hits into the wall or the boundary. As we break out of the while loop the conditions in the while loop (that the ball will keep going) no longer satisfy. So we need to take one step back to continue traversing.

Time Complexity: O(mn)

## Method 2: DFS / Matrix Traverse through recursion

DFS traverse through recursion. We have a helper method that takes in additional information regardign the current state. Break the recursion when we reach
the end point (return true) or when all the block has been visited (return false). Else we call the method recursively on its neighbors and find if there 
is a path from the start to the end point. What are the neighbors? They are the blocks that we will reach if keep going until hitting the wall and is not yet visited. We need to make sure the block is not visited repeatedly or else the ball might go into an infinite loop.

Time Complexity: O(mn)
