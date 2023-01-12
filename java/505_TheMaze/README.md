## Method 1: BFS / Dijkstra Algorithm through Priority Queue

This problem is a follow up from the problem 490 The Maze I. Intuition - can we use the same BFS approach and add the count of steps to a list if the current block poped out of the queue is the end point? Won't work since we need a way to memorize number of steps we have already taken up to the current
block. So will need a distance matrix to store the distance from start point to each block in the maze.

We can apply the Dijkstra Algorithm as a solution to the SSSP (Single Source Shortest Path) problem. Use a matrix to store the distance from the start point to each block in the graph. All the values in the matrix are initialized to be Integer.MAX_VALUE. Then we use a priority queue to do the BFS and continue traversing and updating the value in the distance matrix. When polling a new block out of the queue, we always pick the one with shortest distance from the start point first. Using a priority queue is more efficient than a normal queue and save time complexity from O(mnmax(m,n)) to O(mnlog(mn)). 

Why we no longer need the visited matrix? Because previously we add the new block to the queue if it is not yet visited. Here we add the new node to the 
queue if the calculated new distance is shorter than the distance stored in the matrix. That is, the neighbors are the blocks that we will reach if keep going until hitting the wall and only if the calculated total distance is shorter than the distance stored in the matrix.

Time Complexity: O(mnlog(mn))

## Method 2: DFS / Dijkstra Algorithm through recursion

DFS traverse through recursion. Also in this problem we need a distance matrix to store the distance from start point to each block in the maze, and the helper method dfs does not need to have any return type other than filling in the distance matrix. Other parts are the same - we call the method on its neighbors and recursively find if there is a path from the start to the end point. What are the neighbors? They are the blocks that we will reach if keep going until hitting the wall and only if the calculated total distance is shorter than the distance stored in the matrix.

Time Complexity: O(mn)
