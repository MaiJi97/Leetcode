## Method 1: DFS / Traverse through recursion - backtracking

This problem is to find all possible paths and is usually solved by DFS and backtracking. DFS as a separate method as it takes in 
additional information regarding the current state, including the current board, current row and current final result. In the helper 
method, break the recursion when we traversing until the last row / get a valid compelte solution to the board. No return as we just 
need to print and add the current traversed board to the final result. In the body we recursively explore which columns we can put 
the queen, and then we start to backtrack by removing the last queen from a board.

Time Complexity: O(n!)
