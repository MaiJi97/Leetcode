## Method 1: BFS / Traverse through Queue

BFS traverse through queue. First we need to construct the graph, which could be represented as a hashmap. Note that we would want to 
add all the nodes into the hashmap even when there is there are nodes that do not have any edge connecting to them. Then, we start to 
poll nodes out and look for connected components. Each time we poll an element out of the queue and offer its neighbors to the queue. 
What are the neighbors? They are the nodes that are connected to the current node and have not been visited. If it satisfies the 
conditions, add the neighbor to the queue and mark it as visited. 

In this problem, we create bfs as a separate method because we want to count total number of connected components, each could be 
traversed through calling bfs method once. We do not need to return anything in the bfs method as we do not need to use the returned 
value.

Time Complexity: O(n) 

## Method 2: DFS / Traverse through recursion

DFS traverse through recursion. We have a helper method that takes in additional information regarding the current state, the id of the
current node. In the main method we iterate through each node and find connected components. In the helper method, call the method 
recursively on its neighbors to keep finding elements in the same component. What are the neighbors? They are the nodes that are 
connected to the current node and have not been visited. We do not need to return anything in the dfs method as we do not need to use 
the returned value.

Time Complexity: O(n) 

