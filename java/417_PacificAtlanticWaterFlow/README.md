## Method 1: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Since there are two oceans, we need two queues. Originally all the cells that are adjacent to the 
oceans are offered into the corresponding queue. Each time we poll an element out of the queue and offer its neighbors to the queue. What
are the neighbors? They are the four cells that adjacent to / directly connected with the current cell in the four directions and is higher
than the current cell / have not been marked recheable / have not reached the border of the matrix. If it satisfies the conditions, add the
neighbor to the queue and mark it as reacheable. 

<img width="338" alt="Screen Shot 2022-10-19 at 11 06 29 PM" src="https://user-images.githubusercontent.com/106039830/196988040-5a0be2b8-0314-4069-92eb-57219c6814ee.png">

Similar as problem 200, we create bfs as a separate method because we want to call the bfs method twice for both oceans, and we need to 
return the reacheable matrix as result as we need to use it later.

Time Complexity: O(m * n)

## Method 2: DFS / Matrix Traverse through recursion

Similar as problem 200. DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the
current state, ie: the x and y axis of the current cell. In the main method we iterate through the cells that are adjacent to the oceans
and continue to traverse through other cells from there. Then in the helper method, we call the method recursively on its neighbors to 
find cells that have water flowing into the oceans. What are the neighbors? They are the four cells that adjacent to / directly connected with the current cell in the four directions and is higher than the current cell / have not been marked recheable / have not reached the border of the matrix. We need to return the reacheable matrix as result as we need to use it later (the output is taken as an input of the dfs method).

Time Complexity: O(m * n)



