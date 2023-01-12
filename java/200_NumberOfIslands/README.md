## Method 1: DFS / Traverse through recursion

DFS traverse through recursion. Break the recursion when the block is 0 / the block has been visited / we reach the border of the matrix. Else we call the method on its four adjacent blocks and recursively find all the blocks connecting to it and count the whole area as 1. 

Time Complexity: O(mn) 

## Method 2: BFS / Matrix Traverse through Queue

BFS matrix traverse through queue. Similar as DFS but need to consider what to be pushed into the queue -> the index of the current block as a two element array or an inner class data structure. Also note the use of a direction array, which represents the next step to take both vertically and horizontally. Who are the neighbors? The four blocks that adjacent to / directly connected with the current block in the four direction, represented by the direction array.

Time Complexity: O(mn) 
