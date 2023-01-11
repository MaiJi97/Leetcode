## Method 1: BFS / Dijkstra Algorithm through Priority Queue

This problem is a followup from the problem 490 The Maze I. We can apply the Dijkstra Algorithm as a solution to the SSSP (Single Source Shortest Path)
problem. Use a matrix to store the distance from the start point to each node in the graph. All the values in the matrix are initialized to be max integer. 
Then we use a priority queue to do the BFS and continue traversing and updating the value in the distance matrix. When polling a new node out of the queue,
we always pick the one with shortest distance from the start point first.

Why we no longer need the visited matrix? Because previously we add the new node to the queue if it is not yet visited. Here we add the new node to the 
queue if the distance is shorter than the distance stored in the matrix. 

Time Complexity: O(mnlog(mn))
