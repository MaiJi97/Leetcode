## Method 1: BFS / Dijkstra Algorithm through Priority Queue

We can apply the Dijkstra Algorithm as a solution to the SSSP (Single Source Shortest Path) problem. There are some differences between this approach and the traditional BFS:

1) Instead of using a boolean visited matrix, we use integer matrix to store the minimum effort from the start point to each cell in the matrix. All the values in the matrix are initialized to be Integer.MAX_VALUE.
   
2) Instead of using a queue, we use a priority queue to do the BFS and continue traversing and updating the value in the effort matrix. So when polling a new cell out of the priority queue, we always pick the one with minimum effort and add its neighbors to the priority queue only if it has smaller effort than its current effort stored in the effort matrix. 

What are the neighbors? They are the adjacent cells that has a smaller effort than what is stored in the matrix.

Time Complexity: O(mnlog(mn))

## Method 2: DFS / Matrix Traverse through recursion

DFS traverse through recursion. Also in this problem we need a effort matrix to store the minimum effort from start point to each cell, and the helper 
method dfs does not need to have any return type other than filling in the effort matrix. Other parts are the same - we call the method on its neighbors 
and recursively find if there is a path from the start to the end point. What are the neighbors? They are the adjacent cells that has a smaller effort 
than what is stored in the matrix.

Time Complexity: TLE - Need to combine binary search? TODO
