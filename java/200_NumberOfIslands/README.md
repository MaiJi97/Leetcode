## Method 1: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Each time we poll an element out of the queue and offer its neighbors to the queue. What are the neighbors? They are the four cells that adjacent to / directly connected with the current cell in the four direction and is not 0 / have not been visited / have not reached the border of the matrix. If it satisfies the conditions, add the neighbor to the queue and mark it as visited. Note that: to reach the adjacent cells, we can either use a customized inner class here to include information about x axis and y axis of the current cell, or use direction array such as deltaX and deltaY, which represent the steps we take vertically and horizontally.

<img width="338" alt="Screen Shot 2022-10-19 at 11 06 29 PM" src="https://user-images.githubusercontent.com/106039830/196988040-5a0be2b8-0314-4069-92eb-57219c6814ee.png">

In this problem, we create bfs as a separate method because we want to count total number of islands, each could be traverseed through calling bfs method once.

Time Complexity: O(m * n) 

## Method 2: DFS / Matrix Traverse through recursion

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the x and y axis of the current block. In the main method we iterate through each block of the matrix and find connected blocks as an island. In the helper method, break the recursion when the block is 0 / all the blocks have been visited / we reach the border of the matrix and then add 1 to the final result because we've found another island. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent blocks that is not 0 / have not been visited / have not reached the border of the matrix. 

Time Complexity: O(m * n) 

