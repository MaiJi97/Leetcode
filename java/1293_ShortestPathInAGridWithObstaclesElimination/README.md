## Method 1: BFS / Traverse through Queue

This problem uses a traditional BFS approach with level => 有明显分层, size = queue.size() - for loop 

The difference is that we need to consider k and will need to keep a 3-dimensional array to track the visited state. 

Each time we poll an element out of the queue and offer its neighbors to the queue. What are the neighbors? They are the four cells that adjacent to / directly 
connected with the current cell in the four directions and have not reached the border of the matrix exceed the border and when neighbor is empty should have 
parameter k as unvisited and when neighbor is obstacle k should be greater than 0 and shoud have parameter k as unvisited. If it satisfies the conditions, add the 
neighbor to the queue and mark it as visited. 

Time Complexity: O(m * n * k)
