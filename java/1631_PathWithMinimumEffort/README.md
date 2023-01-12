## Method 1: BFS / Dijkstra Algorithm through Priority Queue

We can apply the Dijkstra Algorithm as a solution to the SSSP (Single Source Shortest Path) problem. Use a matrix to store the minimum effort from the 
start point to each block in the matrix. All the values in the matrix are initialized to be Integer.MAX_VALUE. Then we use a priority queue to do the BFS
and continue traversing and updating the value in the effort matrix. When polling a new block out of the queue, we always pick the one with minimum
effort from the start point first. Using a priority queue is more efficient than a normal queue and save time complexity from O(mnmax(m,n)) to O(mnlog(mn)).

What are the neighbors? They are the adjacent blocks that has a smaller effort than what is stored in the matrix.

Time Complexity: O(mnlog(mn))

## Method 2: DFS / Matrix Traverse through recursion

DFS traverse through recursion. Also in this problem we need a effort matrix to store the minimum effort from start point to each block, and the helper 
method dfs does not need to have any return type other than filling in the effort matrix. Other parts are the same - we call the method on its neighbors 
and recursively find if there is a path from the start to the end point. What are the neighbors? They are the adjacent blocks that has a smaller effort 
than what is stored in the matrix.

Time Complexity: TLE - Need to combine binary search? TODO
