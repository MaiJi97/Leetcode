## Method 1: BFS / Traverse through Queue

BFS matrix traverse through queue. Similar as DFS but there two points to note: 1) We can either use a customized inner class here to include information about x axis and y axis of the current block, or use delta x and delta y as what we did, or use a direction array, which represents the steps we take vertically and horizontally. 2) When we add neighbors of the current block to the queue. What are the neighbors? They are the four blocks that adjacent to / directly connected with the current block in the four direction and is not 0 / have not been visited / have not reached the border of the matrix. If it satisfies the conditions, add the neighbor to the queue and mark it as visited.

<img width="338" alt="Screen Shot 2022-10-19 at 11 06 29 PM" src="https://user-images.githubusercontent.com/106039830/196988040-5a0be2b8-0314-4069-92eb-57219c6814ee.png">

Time Complexity: O(m * n)

## Method 2: DFS / Traverse through recursion

Same as problem 200. DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the x and y axis of the current block. Break the recursion when the block is 0 / all the blocks have been visited / we reach the border of the matrix and then update the max area. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent blocks that is not 0 / have not been visited / have not reached the border of the matrix. 

Time Complexity: O(m * n)



