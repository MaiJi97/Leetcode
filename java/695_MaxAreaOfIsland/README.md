## Method 1: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Each time we poll an element out of the queue and offer its neighbors to the queue. What are the neighbors? They are the four cells that adjacent to / directly connected with the current cell in the four directions and does not reached the border of the matrix and is not 0 and have not been visited. If it satisfies the conditions, add the neighbor to the queue and mark it as visited. Note that: to reach the adjacent cells, we can either use a customized inner class here to include information about x axis and y axis of the current cell, or use direction array such as deltaX and deltaY, which represent the steps we take vertically and horizontally.

<img width="338" alt="Screen Shot 2022-10-19 at 11 06 29 PM" src="https://user-images.githubusercontent.com/106039830/196988040-5a0be2b8-0314-4069-92eb-57219c6814ee.png">

Similar as problem 200, we create bfs as a separate method because we want to find the maximum area of all the island, each time would require a call to the bfs method so we can update the maximum area. Also we need to return the area of the island traversed from the current cell in the bfs method as we need to use the returned value later.

Time Complexity: O(m * n)

## Method 2: DFS / Matrix Traverse through recursion

Similar as problem 200. DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the x and y axis of the current cell. Break the recursion when the cell exceeds the border of the matrix / is 0 / has been visited and then add 1 to the final result because we've found another island and then update the max area. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent cells that does not reached the border of the matrix and is not 0 and have not been visited. We need to return the area of the island traversed from the current cell in the dfs method as we need to use the returned value later.

Time Complexity: O(m * n)



