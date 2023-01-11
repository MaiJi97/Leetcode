## Method 1: BFS / Matrix Traverse through Queue

The problem can be done through breath first search. There two points to note: 1) A good use of the direction array, which represent the step we take 
vertically and horizontally. 2) When we add neighbors of the current node to the queue, we consider the place we stop when going in the four directions
until hitting the wall. Not the four adjacent blocks. 3) The ball will keep going until it hits the wall or the boundary. As we break out of the while loop the conditions in the while loop (that the ball will keep going) no longer satisfy. So we need to take one step back to continue traversing.

Time Complexity: O(mn)
